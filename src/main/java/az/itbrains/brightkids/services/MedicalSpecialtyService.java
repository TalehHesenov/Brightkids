package az.itbrains.brightkids.services;

import az.itbrains.brightkids.dtos.requset.HeroBannerRequest;
import az.itbrains.brightkids.dtos.requset.MedicalSpecialtyRequest;
import az.itbrains.brightkids.dtos.response.HeroBannerResponse;
import az.itbrains.brightkids.dtos.response.MedicalSpecialtyResponse;
import az.itbrains.brightkids.repositories.MedicalSpecialtyRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MedicalSpecialtyService {

    ResponseEntity<MedicalSpecialtyResponse> createMedicalSpecialty(MedicalSpecialtyRequest request);
    ResponseEntity<MedicalSpecialtyResponse> updateMedicalSpecialty(Long id,MedicalSpecialtyRequest request);
    ResponseEntity<MedicalSpecialtyResponse> getMedicalSpecialty(Long id);
    ResponseEntity<Void> deleteMedicalSpecialty(Long id);
    ResponseEntity<List<MedicalSpecialtyResponse>> getAllMedicalSpecialty();
}
