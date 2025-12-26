package az.itbrains.brightkids.services.impls;

import az.itbrains.brightkids.dtos.requset.PatientStoryRequest;
import az.itbrains.brightkids.dtos.response.PatientStoryResponse;
import az.itbrains.brightkids.mapper.PatientStoryMapper;
import az.itbrains.brightkids.models.HeroBanner;
import az.itbrains.brightkids.models.PatientStory;
import az.itbrains.brightkids.repositories.PatientStoryRepository;
import az.itbrains.brightkids.services.PatientStoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class PatientStoryServiceImpl implements PatientStoryService {
    private final PatientStoryRepository patientStoryRepository;
    private final PatientStoryMapper patientStoryMapper;
    @Override
    public ResponseEntity<PatientStoryResponse> createPatientStory(PatientStoryRequest request) {
        PatientStory patientStory=patientStoryMapper.toEntity(request);
        patientStoryRepository.save(patientStory);
        return new ResponseEntity<>(patientStoryMapper.toDto(patientStory), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<PatientStoryResponse> getPatientStory(Long id) {
        PatientStory patientStory = patientStoryRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "HeroBanner tapılmadı"));
        return new ResponseEntity<>(patientStoryMapper.toDto(patientStory), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PatientStoryResponse> updatePatientStory(Long id, PatientStoryRequest patientStoryRequest) {
        PatientStory patientStory = patientStoryRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "HeroBanner tapılmadı"));

        patientStoryMapper.updateEntityFromDto(patientStoryRequest, patientStory);
        patientStoryRepository.save(patientStory);
        return new ResponseEntity<>(patientStoryMapper.toDto(patientStory), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deletePatientStory(Long id) {
        PatientStory patientStory = patientStoryRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "HeroBanner tapılmadı"));

        patientStoryRepository.delete(patientStory);

        return ResponseEntity.noContent().build();
    }

}
