package az.itbrains.brightkids.services;

import az.itbrains.brightkids.dtos.requset.DoctorRequest;

import java.util.List;

public interface DoctorService {
    List<DoctorRequest> getAllDoctor();
}
