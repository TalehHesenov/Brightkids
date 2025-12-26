package az.itbrains.brightkids.services.impls;

import az.itbrains.brightkids.dtos.requset.DoctorRequest;
import az.itbrains.brightkids.dtos.requset.DoctorRequest;
import az.itbrains.brightkids.dtos.response.DoctorResponse;
import az.itbrains.brightkids.mapper.DoctorMapper;
import az.itbrains.brightkids.mapper.DoctorMapper;
import az.itbrains.brightkids.models.Doctor;
import az.itbrains.brightkids.models.Doctor;
import az.itbrains.brightkids.repositories.DoctorRepository;
import az.itbrains.brightkids.repositories.DoctorRepository;
import az.itbrains.brightkids.services.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;

    @Override
    public ResponseEntity<DoctorResponse> createDoctor(DoctorRequest request) {
        Doctor doctor = doctorMapper.toEntity(request);
        doctorRepository.save(doctor);
        return new ResponseEntity<>(doctorMapper.toDto(doctor), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<DoctorResponse> updateDoctor(Long id, DoctorRequest specialtyRequest) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Doctor tapılmadı"));

        doctorMapper.updateEntityFromDto(specialtyRequest, doctor);
        doctorRepository.save(doctor);
        return new ResponseEntity<>(doctorMapper.toDto(doctor), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<DoctorResponse> getDoctor(Long id) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Doctor tapılmadı"));

        return new ResponseEntity<>(doctorMapper.toDto(doctor), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteDoctor(Long id) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Doctor tapılmadı"));
        doctorRepository.delete(doctor);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<DoctorResponse>> getAllDoctor() {
        List<Doctor> doctor = doctorRepository.findAll();

        if (doctor.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(doctorMapper.toListDto(doctor), HttpStatus.OK);
    }
}
