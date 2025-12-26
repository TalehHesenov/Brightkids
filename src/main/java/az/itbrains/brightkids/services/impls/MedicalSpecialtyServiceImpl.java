package az.itbrains.brightkids.services.impls;

import az.itbrains.brightkids.dtos.request.MedicalSpecialtyRequest;
import az.itbrains.brightkids.dtos.response.MedicalSpecialtyResponse;
import az.itbrains.brightkids.mapper.MedicalSpecialtyMapper;
import az.itbrains.brightkids.models.MedicalSpecialty;
import az.itbrains.brightkids.repositories.MedicalSpecialtyRepository;
import az.itbrains.brightkids.services.MedicalSpecialtyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalSpecialtyServiceImpl implements MedicalSpecialtyService {
    private final MedicalSpecialtyRepository medicalSpecialtyRepository;
    private final MedicalSpecialtyMapper medicalSpecialtyMapper;

    @Override
    public ResponseEntity<MedicalSpecialtyResponse> createMedicalSpecialty(MedicalSpecialtyRequest request) {
        MedicalSpecialty medicalSpecialty = medicalSpecialtyMapper.toEntity(request);
        medicalSpecialtyRepository.save(medicalSpecialty);
        return new ResponseEntity<>(medicalSpecialtyMapper.toDto(medicalSpecialty), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<MedicalSpecialtyResponse> updateMedicalSpecialty(Long id, MedicalSpecialtyRequest specialtyRequest) {
        MedicalSpecialty medicalSpecialty = medicalSpecialtyRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MedicalSpecialty tapılmadı"));

        medicalSpecialtyMapper.updateEntityFromDto(specialtyRequest, medicalSpecialty);
        medicalSpecialtyRepository.save(medicalSpecialty);
        return new ResponseEntity<>(medicalSpecialtyMapper.toDto(medicalSpecialty), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<MedicalSpecialtyResponse> getMedicalSpecialty(Long id) {
        MedicalSpecialty medicalSpecialty = medicalSpecialtyRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MedicalSpecialty tapılmadı"));

        return new ResponseEntity<>(medicalSpecialtyMapper.toDto(medicalSpecialty), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteMedicalSpecialty(Long id) {
        MedicalSpecialty medicalSpecialty = medicalSpecialtyRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MedicalSpecialty tapılmadı"));
        medicalSpecialtyRepository.delete(medicalSpecialty);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<MedicalSpecialtyResponse>> getAllMedicalSpecialty() {
        List<MedicalSpecialty> medicalSpecialty = medicalSpecialtyRepository.findAll();

        if (medicalSpecialty.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(medicalSpecialtyMapper.toListDto(medicalSpecialty), HttpStatus.OK);
    }

}
