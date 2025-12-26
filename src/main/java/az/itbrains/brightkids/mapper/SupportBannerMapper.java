package az.itbrains.brightkids.mapper;

import az.itbrains.brightkids.dtos.request.SupportBannerRequest;
import az.itbrains.brightkids.dtos.response.SupportBannerResponse;
import az.itbrains.brightkids.models.SupportBanner;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")

public interface SupportBannerMapper {
    SupportBannerResponse toDto(SupportBanner supportBanner);
    SupportBanner toEntity(SupportBannerRequest supportBannerRequest);

    void updateEntityFromDto(SupportBannerRequest supportBannerRequest, @MappingTarget SupportBanner supportBanner);

}
