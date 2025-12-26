package az.itbrains.brightkids.services.impls;

import az.itbrains.brightkids.dtos.requset.LocationRequest;
import az.itbrains.brightkids.dtos.response.LocationResponse;
import az.itbrains.brightkids.mapper.LocationMapper;
import az.itbrains.brightkids.models.Location;
import az.itbrains.brightkids.repositories.LocationRepository;
import az.itbrains.brightkids.services.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {
    private final LocationMapper locationMapper;
    private final LocationRepository locationRepository;

    @Override
    public ResponseEntity<Void> deleteLocation(Long id) {
        Location location = locationRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Location tapılmadı"));
        locationRepository.delete(location);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<LocationResponse> updateLocation(Long id, LocationRequest locationRequest) {
        Location location = locationRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Location tapılmadı"));

        locationMapper.updateEntityFromDto(locationRequest, location);
        locationRepository.save(location);
        return new ResponseEntity<>(locationMapper.toDto(location), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<LocationResponse> getLocation(Long id) {
        Location location = locationRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Location tapılmadı"));

        return new ResponseEntity<>(locationMapper.toDto(location), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<LocationResponse> createLocation(LocationRequest locationRequest) {
        Location location = locationMapper.toEntity(locationRequest);
        locationRepository.save(location);
        return new ResponseEntity<>(locationMapper.toDto(location), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<LocationResponse>> getAllLocationService() {
        List<Location> locations = locationRepository.findAll();

        if (locations.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(locationMapper.toListDto(locations), HttpStatus.OK);
    }
}
