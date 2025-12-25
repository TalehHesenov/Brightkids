package az.itbrains.brightkids.services.impls;

import az.itbrains.brightkids.dtos.requset.DoctorDto;
import az.itbrains.brightkids.mapper.DoctorMapper;
import az.itbrains.brightkids.models.Doctor;
import az.itbrains.brightkids.repositories.DoctorRepository;
import az.itbrains.brightkids.services.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {
    private  final DoctorMapper doctorMapper;
    private final DoctorRepository doctorRepository;


    @Override
    public List<DoctorDto> getAllDoctor() {
        List<Doctor> doctors = doctorRepository.findAll();

        return doctorMapper.toDtoList(doctors);
    }
}
