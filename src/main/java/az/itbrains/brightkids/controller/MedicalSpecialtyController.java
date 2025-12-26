package az.itbrains.brightkids.controller;

import az.itbrains.brightkids.dtos.request.MedicalSpecialtyRequest;
import az.itbrains.brightkids.dtos.response.MedicalSpecialtyResponse;
import az.itbrains.brightkids.services.MedicalSpecialtyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medical-specialty")
@RequiredArgsConstructor
public class MedicalSpecialtyController {
    private final MedicalSpecialtyService medicalSpecialtyService;

    @PostMapping
    public ResponseEntity<MedicalSpecialtyResponse> createMedicalSpecialty(@Valid @RequestBody MedicalSpecialtyRequest request) {
        return medicalSpecialtyService.createMedicalSpecialty(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicalSpecialtyResponse> getMedicalSpecialty(@PathVariable Long id) {
        return medicalSpecialtyService.getMedicalSpecialty(id);
    }

    @GetMapping("/all")
    public ResponseEntity<List<MedicalSpecialtyResponse>> getAllMedicalSpecialty() {
        return medicalSpecialtyService.getAllMedicalSpecialty();
    }

    @PutMapping("/{id}")
    public ResponseEntity<MedicalSpecialtyResponse> updateMedicalSpecialty(@Valid @RequestBody MedicalSpecialtyRequest request, @PathVariable Long id) {
        return medicalSpecialtyService.updateMedicalSpecialty(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedicalSpecialty(@PathVariable Long id) {
        medicalSpecialtyService.deleteMedicalSpecialty(id);
        return ResponseEntity.noContent().build();
    }

}
