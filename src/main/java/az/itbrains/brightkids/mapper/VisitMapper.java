package az.itbrains.brightkids.mapper;

import az.itbrains.brightkids.dtos.requset.DoctorRequest;
import az.itbrains.brightkids.dtos.requset.VisitRequest;
import az.itbrains.brightkids.dtos.response.VisitResponse;
import az.itbrains.brightkids.models.Doctor;
import az.itbrains.brightkids.models.Visit;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")

public interface VisitMapper {
    VisitResponse toDto(Visit visit);
    Visit toEntity(VisitRequest visitRequest);

    void updateEntityFromDto(VisitRequest visitRequest, @MappingTarget Visit visit);
}
