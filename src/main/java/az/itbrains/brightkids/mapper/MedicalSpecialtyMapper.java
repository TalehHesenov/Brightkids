package az.itbrains.brightkids.mapper;

import az.itbrains.brightkids.dtos.requset.HeroBannerRequest;
import az.itbrains.brightkids.dtos.requset.MedicalSpecialtyRequest;
import az.itbrains.brightkids.dtos.response.HeroBannerResponse;
import az.itbrains.brightkids.dtos.response.MedicalSpecialtyResponse;
import az.itbrains.brightkids.models.HeroBanner;
import az.itbrains.brightkids.models.MedicalSpecialty;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MedicalSpecialtyMapper {
    MedicalSpecialtyResponse toDto(MedicalSpecialty medicalSpecialty);
    MedicalSpecialty toEntity(MedicalSpecialtyRequest medicalSpecialtyRequest);
    List<MedicalSpecialtyResponse> toListDto(List<MedicalSpecialty> medicalSpecialties);

    void updateEntityFromDto(MedicalSpecialtyRequest medicalSpecialtyRequest, @MappingTarget MedicalSpecialty medicalSpecialty);
}
