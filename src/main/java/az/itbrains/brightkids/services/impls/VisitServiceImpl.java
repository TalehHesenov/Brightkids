package az.itbrains.brightkids.services.impls;

import az.itbrains.brightkids.dtos.requset.LocationRequest;
import az.itbrains.brightkids.dtos.requset.VisitRequest;
import az.itbrains.brightkids.dtos.response.VisitResponse;
import az.itbrains.brightkids.mapper.LocationMapper;
import az.itbrains.brightkids.mapper.VisitMapper;
import az.itbrains.brightkids.models.Location;
import az.itbrains.brightkids.models.Visit;
import az.itbrains.brightkids.repositories.LocationRepository;
import az.itbrains.brightkids.repositories.VisitRepository;
import az.itbrains.brightkids.services.VisitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class VisitServiceImpl implements VisitService {
    private final VisitMapper visitMapper;
    private final VisitRepository visitRepository;
    private final LocationRepository locationRepository;
    private final LocationMapper locationMapper;


    @Override
    public ResponseEntity<Void> deleteVisit(Long id) {
        Visit visit = visitRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Visit tapılmadı"));

        visitRepository.delete(visit);

        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<VisitResponse> updateVisit(Long id, VisitRequest visitRequest) {
                    Visit visit = visitRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Visit tapılmadı"));

            visitMapper.updateEntityFromDto(visitRequest, visit);
            visitRepository.save(visit);
            return new ResponseEntity<>(visitMapper.toDto(visit), HttpStatus.OK);
        }
    @Override
    public ResponseEntity<VisitResponse> getVisit(Long id) {
        Visit visit = visitRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SupportBanner tapılmadı"));
        return new ResponseEntity<>(visitMapper.toDto(visit), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<VisitResponse> createVisit(VisitRequest visitRequest) {
        Visit visit=visitMapper.toEntity(visitRequest);
        visitRepository.save(visit);
        for (Location v: visit.getLocations()){
            v.setVisit(visit);
            locationRepository.save(v);
        }
        return new ResponseEntity<>(visitMapper.toDto(visit), HttpStatus.CREATED);
    }
}
