package az.itbrains.brightkids.services;

import az.itbrains.brightkids.dtos.request.HeroBannerRequest;
import az.itbrains.brightkids.dtos.response.HeroBannerResponse;
import org.springframework.http.ResponseEntity;

public interface HeroBannerService {
    ResponseEntity<HeroBannerResponse> createHeroBanner(HeroBannerRequest request);
    ResponseEntity<HeroBannerResponse> updateHeroBanner(Long id,HeroBannerRequest request);
    ResponseEntity<HeroBannerResponse> getHeroBanner(Long id);
    ResponseEntity<Void> deleteHeroBanner(Long id);
}
