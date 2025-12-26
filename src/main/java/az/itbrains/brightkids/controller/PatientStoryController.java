package az.itbrains.brightkids.controller;

import az.itbrains.brightkids.dtos.requset.HeroBannerRequest;
import az.itbrains.brightkids.dtos.requset.PatientStoryRequest;
import az.itbrains.brightkids.dtos.response.HeroBannerResponse;
import az.itbrains.brightkids.dtos.response.PatientStoryResponse;
import az.itbrains.brightkids.services.PatientStoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patient-story")
@RequiredArgsConstructor
public class PatientStoryController {
    private final PatientStoryService patientStoryService;

    @PostMapping
    public ResponseEntity<PatientStoryResponse> createHeroBanner(
            @Valid @RequestBody PatientStoryRequest request) {
        return patientStoryService.createPatientStory(request);
    }
    @GetMapping("/{id}")
    public ResponseEntity<PatientStoryResponse> getPatientStory(@PathVariable Long id) {
        return patientStoryService.getPatientStory(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PatientStoryResponse> updatePatientStory(
            @Valid @RequestBody PatientStoryRequest patientStoryRequest, @PathVariable Long id) {
        return patientStoryService.updatePatientStory(id, patientStoryRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatientStory(@PathVariable Long id) {
        patientStoryService.deletePatientStory(id);
        return ResponseEntity.noContent().build();
    }
}
