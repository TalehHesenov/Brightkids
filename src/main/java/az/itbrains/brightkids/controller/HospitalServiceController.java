package az.itbrains.brightkids.controller;

import az.itbrains.brightkids.dtos.requset.HospitalServiceRequest;
import az.itbrains.brightkids.dtos.response.HospitalServiceResponse;
import az.itbrains.brightkids.services.HospitalServiceService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hospital-service")
@RequiredArgsConstructor
public class HospitalServiceController {
    private final HospitalServiceService hospitalServiceService;

    @PostMapping
    public ResponseEntity<HospitalServiceResponse> createHospitalService(
            @Valid @RequestBody HospitalServiceRequest hospitalServiceRequest) {
        return hospitalServiceService.createHospitalService(hospitalServiceService);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HospitalServiceResponse> getHospitalService(@PathVariable Long id) {
        return hospitalServiceService.getHospitalService(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HospitalServiceResponse> updateHospitalService(
            @Valid @RequestBody HospitalServiceRequest hospitalServiceRequest, @PathVariable Long id) {
        return hospitalServiceService.updateHospitalService(id, hospitalServiceRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHospitalService(@PathVariable Long id) {
        hospitalServiceService.deleteHospitalService(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/all")
    public ResponseEntity<List<HospitalServiceResponse>> getAllHospitalService() {
        return hospitalServiceService.getAllHospitalService();
    }
}
