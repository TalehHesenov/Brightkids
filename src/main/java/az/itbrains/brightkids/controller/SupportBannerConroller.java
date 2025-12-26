package az.itbrains.brightkids.controller;

import az.itbrains.brightkids.dtos.requset.HeroBannerRequest;
import az.itbrains.brightkids.dtos.requset.SupportBannerRequest;
import az.itbrains.brightkids.dtos.response.HeroBannerResponse;
import az.itbrains.brightkids.services.SupportBannerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/support-banners")
@RequiredArgsConstructor
public class SupportBannerConroller {
    private final SupportBannerService supportBannerService;
    @PostMapping
    public ResponseEntity<HeroBannerResponse> createHeroBanner(@Valid @RequestBody SupportBannerRequest supportBannerRequest) {
        return supportBannerService.createSupportBanner(supportBannerRequest);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HeroBannerResponse> getSupportBanner(@PathVariable Long id) {
        return supportBannerService.getSupportBanner(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HeroBannerResponse> updateHeroBanner(@Valid @RequestBody SupportBannerRequest supportBannerRequest, @PathVariable Long id) {
        return supportBannerService.updateSupportBanner(id, supportBannerRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSupportBanner(@PathVariable Long id) {
        supportBannerService.deleteSupportBanner(id);
        return ResponseEntity.noContent().build();
    }
}

