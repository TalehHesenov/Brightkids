package az.itbrains.brightkids.services;

import az.itbrains.brightkids.dtos.request.DoctorRequest;
import az.itbrains.brightkids.dtos.response.DoctorResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DoctorService {
    ResponseEntity<DoctorResponse> createDoctor(DoctorRequest request);
    ResponseEntity<DoctorResponse> updateDoctor(Long id,DoctorRequest request);
    ResponseEntity<DoctorResponse> getDoctor(Long id);
    ResponseEntity<Void> deleteDoctor(Long id);
    ResponseEntity<List<DoctorResponse>> getAllDoctor();
}
