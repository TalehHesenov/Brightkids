package az.itbrains.brightkids.controller;

import az.itbrains.brightkids.dtos.request.HeroBannerRequest;
import az.itbrains.brightkids.dtos.response.HeroBannerResponse;
import az.itbrains.brightkids.services.HeroBannerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hero-banners")
@RequiredArgsConstructor
public class HeroBannerController {
    private final HeroBannerService heroBannerService;

    @PostMapping
    public ResponseEntity<HeroBannerResponse> createHeroBanner(@Valid @RequestBody HeroBannerRequest request) {
        return heroBannerService.createHeroBanner(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HeroBannerResponse> getHeroBanner(@PathVariable Long id) {
        return heroBannerService.getHeroBanner(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HeroBannerResponse> updateHeroBanner(@Valid @RequestBody HeroBannerRequest request, @PathVariable Long id) {
        return heroBannerService.updateHeroBanner(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHeroBanner(@PathVariable Long id) {
        heroBannerService.deleteHeroBanner(id);
        return ResponseEntity.noContent().build();
    }

}


