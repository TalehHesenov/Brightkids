package az.itbrains.brightkids.mapper;

import az.itbrains.brightkids.dtos.requset.DoctorRequest;
import az.itbrains.brightkids.models.Doctor;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface VisitMapper {
    DoctorRequest toDto(Doctor doctor);

    Doctor toEntity(DoctorRequest dto);
    List<DoctorRequest> toDtoList(List<Doctor> doctorList);
}
