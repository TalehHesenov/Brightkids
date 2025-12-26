package az.itbrains.brightkids.mapper;

import az.itbrains.brightkids.dtos.request.PatientStoryRequest;
import az.itbrains.brightkids.dtos.response.PatientStoryResponse;
import az.itbrains.brightkids.models.PatientStory;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")

public interface PatientStoryMapper {
//    response- musteri goren
//    request -backend gporen

    PatientStoryResponse toDto(PatientStory patientStory);
    PatientStory toEntity(PatientStoryRequest patientStoryRequest);

    void updateEntityFromDto(PatientStoryRequest patientStoryRequest, @MappingTarget PatientStory patientStory);
}
