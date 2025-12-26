package az.itbrains.brightkids.services;

import az.itbrains.brightkids.dtos.request.MedicalSpecialtyRequest;
import az.itbrains.brightkids.dtos.response.MedicalSpecialtyResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MedicalSpecialtyService {

    ResponseEntity<MedicalSpecialtyResponse> createMedicalSpecialty(MedicalSpecialtyRequest request);
    ResponseEntity<MedicalSpecialtyResponse> updateMedicalSpecialty(Long id,MedicalSpecialtyRequest request);
    ResponseEntity<MedicalSpecialtyResponse> getMedicalSpecialty(Long id);
    ResponseEntity<Void> deleteMedicalSpecialty(Long id);
    ResponseEntity<List<MedicalSpecialtyResponse>> getAllMedicalSpecialty();
}
