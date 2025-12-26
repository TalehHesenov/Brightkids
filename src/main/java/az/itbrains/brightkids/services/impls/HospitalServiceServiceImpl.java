package az.itbrains.brightkids.services.impls;

import az.itbrains.brightkids.dtos.request.HospitalServiceRequest;
import az.itbrains.brightkids.dtos.response.HospitalServiceResponse;
import az.itbrains.brightkids.mapper.HospitalServiceMapper;
import az.itbrains.brightkids.models.HospitalService;
import az.itbrains.brightkids.repositories.HospitalServiceRepository;
import az.itbrains.brightkids.services.HospitalServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HospitalServiceServiceImpl implements HospitalServiceService {
    private final HospitalServiceRepository hospitalServiceRepository;
    private final HospitalServiceMapper hospitalServiceMapper;

    @Override
    public ResponseEntity<Void> deleteHospitalService(Long id) {
        HospitalService hospitalService = hospitalServiceRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "HospitalService tapılmadı"));
        hospitalServiceRepository.delete(hospitalService);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<HospitalServiceResponse> updateHospitalService(
            Long id, HospitalServiceRequest hospitalServiceRequest) {
        HospitalService hospitalService = hospitalServiceRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "HospitalService tapılmadı"));

        hospitalServiceMapper.updateEntityFromDto(hospitalServiceRequest, hospitalService);
        hospitalServiceRepository.save(hospitalService);
        return new ResponseEntity<>(hospitalServiceMapper.toDto(hospitalService), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HospitalServiceResponse> getHospitalService(Long id) {
        HospitalService hospitalService = hospitalServiceRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "HospitalService tapılmadı"));

        return new ResponseEntity<>(hospitalServiceMapper.toDto(hospitalService), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HospitalServiceResponse> createHospitalService(HospitalServiceService hospitalServiceService) {
        HospitalService hospitalService = hospitalServiceMapper.toEntity(new HospitalServiceRequest());
        hospitalServiceRepository.save(hospitalService);
        return new ResponseEntity<>(hospitalServiceMapper.toDto(hospitalService), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<HospitalServiceResponse>> getAllHospitalService() {
        List<HospitalService> hospitalServices=hospitalServiceRepository.findAll();
        if (hospitalServices.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(hospitalServiceMapper.toListDto(hospitalServices),HttpStatus.OK);
    }
}
