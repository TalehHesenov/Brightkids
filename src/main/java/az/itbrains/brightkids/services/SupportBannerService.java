package az.itbrains.brightkids.services;

import az.itbrains.brightkids.dtos.requset.SupportBannerRequest;
import az.itbrains.brightkids.dtos.response.SupportBannerResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

public interface SupportBannerService {
    ResponseEntity<SupportBannerResponse> createSupportBanner(@Valid SupportBannerRequest supportBannerRequest);

    ResponseEntity<SupportBannerResponse> getSupportBanner(Long id);

    ResponseEntity<SupportBannerResponse> updateSupportBanner(Long id, @Valid SupportBannerRequest supportBannerRequest);

    ResponseEntity<Void> deleteSupportBanner(Long id);
}
