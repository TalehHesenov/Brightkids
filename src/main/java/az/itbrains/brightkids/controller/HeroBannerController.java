package az.itbrains.brightkids.controller;

import az.itbrains.brightkids.dtos.requset.HeroBannerRequest;
import az.itbrains.brightkids.dtos.response.HeroBannerResponse;
import az.itbrains.brightkids.services.HeroBannerService;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HeroBannerController {
    private final HeroBannerService heroBannerService;

    @PostMapping("/hero-banners")
    public ResponseEntity<HeroBannerResponse> createHeroBanner(@Valid @RequestBody HeroBannerRequest request) {
        return heroBannerService.createHeroBanner(request);
    }

    @GetMapping("/hero-banners/{id}")
    public ResponseEntity<HeroBannerResponse> getHeroBanner(@PathVariable Long id) {
        return heroBannerService.getHeroBanner(id);
    }

    @PutMapping("/hero-banners/{id}")
    public ResponseEntity<HeroBannerResponse> updateHeroBanner(@Valid @RequestBody HeroBannerRequest request, @PathVariable Long id) {
        return heroBannerService.updateHeroBanner(id, request);
    }

    @DeleteMapping("/hero-banners/{id}")
    public ResponseEntity<Void> deleteHeroBanner(@PathVariable Long id) {
        heroBannerService.deleteHeroBanner(id);
        return ResponseEntity.noContent().build();
    }

}


