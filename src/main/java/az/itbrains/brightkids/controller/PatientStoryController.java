package az.itbrains.brightkids.controller;

import az.itbrains.brightkids.dtos.requset.HeroBannerRequest;
import az.itbrains.brightkids.dtos.response.HeroBannerResponse;
import az.itbrains.brightkids.services.PatientStoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patient-story")
@RequiredArgsConstructor
public class PatientStoryController {
    private final PatientStoryService patientStoryService;
    @PostMapping
    public ResponseEntity<HeroBannerResponse> createHeroBanner(@Valid @RequestBody HeroBannerRequest request) {
        return heroBannerService.createHeroBanner(request);
    }
}
