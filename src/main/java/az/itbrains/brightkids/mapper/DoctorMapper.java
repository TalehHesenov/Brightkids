package az.itbrains.brightkids.mapper;
import az.itbrains.brightkids.dtos.request.DoctorRequest;
import az.itbrains.brightkids.dtos.response.DoctorResponse;
import az.itbrains.brightkids.models.Doctor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

    DoctorResponse toDto(Doctor doctor);
    Doctor toEntity(DoctorRequest doctorRequest);
    List<DoctorResponse> toListDto(List<Doctor> doctors);
    void updateEntityFromDto(DoctorRequest doctorRequest, @MappingTarget Doctor doctor);
}
