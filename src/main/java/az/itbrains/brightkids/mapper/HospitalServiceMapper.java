package az.itbrains.brightkids.mapper;

import az.itbrains.brightkids.dtos.requset.HospitalServiceRequest;
import az.itbrains.brightkids.dtos.requset.PatientStoryRequest;
import az.itbrains.brightkids.dtos.response.HospitalServiceResponse;
import az.itbrains.brightkids.dtos.response.PatientStoryResponse;
import az.itbrains.brightkids.models.HospitalService;
import az.itbrains.brightkids.models.PatientStory;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")

public interface HospitalServiceMapper { PatientStoryResponse toDto(PatientStory patientStory);
    HospitalServiceResponse toDto(HospitalService hospitalService);
    HospitalService toEntity(HospitalServiceRequest hospitalServiceRequest);
    List<HospitalServiceResponse> toListDto(List<HospitalService> hospitalServices);
    void updateEntityFromDto(HospitalServiceRequest hospitalServiceRequest,
                             @MappingTarget HospitalService hospitalService);
}
