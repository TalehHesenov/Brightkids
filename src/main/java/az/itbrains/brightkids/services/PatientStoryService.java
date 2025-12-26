package az.itbrains.brightkids.services;

import az.itbrains.brightkids.dtos.request.PatientStoryRequest;
import az.itbrains.brightkids.dtos.response.PatientStoryResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

public interface PatientStoryService {
    ResponseEntity<PatientStoryResponse> createPatientStory(@Valid PatientStoryRequest request);

    ResponseEntity<PatientStoryResponse> getPatientStory(Long id);

    ResponseEntity<PatientStoryResponse> updatePatientStory(Long id, @Valid PatientStoryRequest request);

    ResponseEntity<Void>deletePatientStory(Long id);
}
