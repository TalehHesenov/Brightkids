package az.itbrains.brightkids.services;

import az.itbrains.brightkids.dtos.requset.SupportBannerRequest;
import az.itbrains.brightkids.dtos.response.HeroBannerResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

public interface SupportBannerService {
    ResponseEntity<HeroBannerResponse> createSupportBanner(@Valid SupportBannerRequest supportBannerRequest);

    ResponseEntity<HeroBannerResponse> getSupportBanner(Long id);

    ResponseEntity<HeroBannerResponse> updateSupportBanner(Long id, @Valid SupportBannerRequest supportBannerRequest);

    void deleteSupportBanner(Long id);
}
