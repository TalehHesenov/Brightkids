package az.itbrains.brightkids.controller;

import az.itbrains.brightkids.dtos.request.DoctorRequest;
import az.itbrains.brightkids.dtos.response.DoctorResponse;
import az.itbrains.brightkids.services.DoctorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @PostMapping
    public ResponseEntity<DoctorResponse> createDoctor(@Valid @RequestBody DoctorRequest request) {
        return doctorService.createDoctor(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DoctorResponse> getDoctor(@PathVariable Long id) {
        return doctorService.getDoctor(id);
    }

    @GetMapping("/all")
    public ResponseEntity<List<DoctorResponse>> getAllDoctor() {
        return doctorService.getAllDoctor();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DoctorResponse> updateDoctor(@Valid @RequestBody DoctorRequest request, @PathVariable Long id) {
        return doctorService.updateDoctor(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
        return ResponseEntity.noContent().build();
    }

}
