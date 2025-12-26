package az.itbrains.brightkids.controller;

import az.itbrains.brightkids.dtos.requset.LocationRequest;
import az.itbrains.brightkids.dtos.response.HospitalServiceResponse;
import az.itbrains.brightkids.dtos.response.LocationResponse;
import az.itbrains.brightkids.services.LocationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/location")
@RequiredArgsConstructor
public class LocationController {
    private final LocationService locationService;

    @PostMapping
    public ResponseEntity<LocationResponse> createLocation(
            @Valid @RequestBody LocationRequest locationRequest) {
        return locationService.createLocation(locationRequest);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LocationResponse> getLocation(@PathVariable Long id) {
        return locationService.getLocation(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LocationResponse> updateLocation(
            @Valid @RequestBody LocationRequest locationRequest, @PathVariable Long id) {
        return locationService.updateLocation(id, locationRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLocation(@PathVariable Long id) {
        locationService.deleteLocation(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/all")
    public ResponseEntity<List<LocationResponse>> getAllLocationService() {
        return locationService.getAllLocationService();
    }
}
