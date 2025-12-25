package az.itbrains.brightkids.services;

import az.itbrains.brightkids.dtos.requset.DoctorDto;

import java.util.List;

public interface DoctorService {
    List<DoctorDto> getAllDoctor();
}
