package az.itbrains.brightkids.services;

import az.itbrains.brightkids.dtos.requset.HospitalServiceRequest;
import az.itbrains.brightkids.dtos.response.HospitalServiceResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface HospitalServiceService {
    ResponseEntity<Void> deleteHospitalService(Long id);

    ResponseEntity<HospitalServiceResponse> updateHospitalService(Long id, @Valid HospitalServiceRequest hospitalServiceRequest);

    ResponseEntity<HospitalServiceResponse> getHospitalService(Long id);

    ResponseEntity<HospitalServiceResponse> createHospitalService(HospitalServiceService hospitalServiceService);

    ResponseEntity<List<HospitalServiceResponse>> getAllHospitalService();
}
