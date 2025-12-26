package az.itbrains.brightkids.controller;

import az.itbrains.brightkids.dtos.request.SupportBannerRequest;
import az.itbrains.brightkids.dtos.response.SupportBannerResponse;
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
    public ResponseEntity<SupportBannerResponse> createHeroBanner(
            @Valid @RequestBody SupportBannerRequest supportBannerRequest) {
        return supportBannerService.createSupportBanner(supportBannerRequest);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupportBannerResponse> getSupportBanner(@PathVariable Long id) {
        return supportBannerService.getSupportBanner(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SupportBannerResponse> updateHeroBanner(
            @Valid @RequestBody SupportBannerRequest supportBannerRequest,
                                                               @PathVariable Long id) {
        return supportBannerService.updateSupportBanner(id, supportBannerRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSupportBanner(@PathVariable Long id) {
        supportBannerService.deleteSupportBanner(id);
        return ResponseEntity.noContent().build();
    }
}

