package az.itbrains.brightkids.mapper;
import az.itbrains.brightkids.dtos.requset.DoctorDto;
import az.itbrains.brightkids.models.Doctor;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

    DoctorDto toDto(Doctor doctor);

    Doctor toEntity(DoctorDto dto);
    List<DoctorDto> toDtoList(List<Doctor> doctorList);
}
