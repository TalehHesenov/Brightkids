package az.itbrains.brightkids.services.impls;

import az.itbrains.brightkids.dtos.requset.SupportBannerRequest;
import az.itbrains.brightkids.dtos.response.HeroBannerResponse;
import az.itbrains.brightkids.services.SupportBannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupportBannerServiceImpl implements SupportBannerService {
    @Override
    public ResponseEntity<HeroBannerResponse> createSupportBanner(SupportBannerRequest supportBannerRequest) {
        return null;
    }

    @Override
    public ResponseEntity<HeroBannerResponse> getSupportBanner(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<HeroBannerResponse> updateSupportBanner(Long id, SupportBannerRequest supportBannerRequest) {
        return null;
    }

    @Override
    public void deleteSupportBanner(Long id) {

    }
}
