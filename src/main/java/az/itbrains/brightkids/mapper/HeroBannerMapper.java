package az.itbrains.brightkids.mapper;

import az.itbrains.brightkids.dtos.request.HeroBannerRequest;
import az.itbrains.brightkids.dtos.response.HeroBannerResponse;
import az.itbrains.brightkids.models.HeroBanner;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface HeroBannerMapper {
    HeroBannerResponse toDto(HeroBanner heroBanner);
    HeroBanner toEntity(HeroBannerRequest heroBannerRequest);

    void updateEntityFromDto(HeroBannerRequest heroBannerRequest, @MappingTarget HeroBanner heroBanner);
}
