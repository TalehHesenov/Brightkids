package az.itbrains.brightkids.mapper;

import az.itbrains.brightkids.dtos.requset.MedicalSpecialtyRequest;
import az.itbrains.brightkids.dtos.requset.QuickActionRequest;
import az.itbrains.brightkids.dtos.response.MedicalSpecialtyResponse;
import az.itbrains.brightkids.dtos.response.QuickActionResponse;
import az.itbrains.brightkids.models.MedicalSpecialty;
import az.itbrains.brightkids.models.QuickAction;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import java.util.List;


@Mapper(componentModel = "spring")
public interface QuickActionMapper {

    QuickActionResponse toDto(QuickAction quickAction);
    QuickAction toEntity(QuickActionRequest quickActionRequest);
    List<QuickActionResponse> toListDto(List<QuickAction> quickActions);
    void updateEntityFromDto(QuickActionRequest quickActionRequest, @MappingTarget QuickAction quickAction);
}
