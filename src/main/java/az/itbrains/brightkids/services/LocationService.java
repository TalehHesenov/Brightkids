package az.itbrains.brightkids.services;

import az.itbrains.brightkids.dtos.requset.LocationRequest;
import az.itbrains.brightkids.dtos.response.LocationResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LocationService {
    ResponseEntity<Void> deleteLocation(Long id);

    ResponseEntity<LocationResponse> updateLocation(Long id, @Valid LocationRequest locationRequest);

    ResponseEntity<LocationResponse> getLocation(Long id);

    ResponseEntity<LocationResponse> createLocation(LocationRequest locationRequest);

    ResponseEntity<List<LocationResponse>> getAllLocationService();
}
