package az.itbrains.brightkids.services.impls;

import az.itbrains.brightkids.dtos.request.HeroBannerRequest;
import az.itbrains.brightkids.dtos.response.HeroBannerResponse;
import az.itbrains.brightkids.mapper.HeroBannerMapper;
import az.itbrains.brightkids.models.HeroBanner;
import az.itbrains.brightkids.repositories.HeroBannerRepository;
import az.itbrains.brightkids.services.HeroBannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class HeroBannerServiceImpl implements HeroBannerService {
    private final HeroBannerRepository heroBannerRepository;
    private final HeroBannerMapper heroBannerMapper;

    @Override
    public ResponseEntity<HeroBannerResponse> createHeroBanner(HeroBannerRequest request) {
        HeroBanner heroBanner = heroBannerMapper.toEntity(request);
        heroBannerRepository.save(heroBanner);
        return new ResponseEntity<>(heroBannerMapper.toDto(heroBanner), HttpStatus.CREATED);
    }


    @Override
    public ResponseEntity<HeroBannerResponse> updateHeroBanner(Long id, HeroBannerRequest heroBannerRequest) {
        HeroBanner heroBanner = heroBannerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "HeroBanner tapılmadı"));

        heroBannerMapper.updateEntityFromDto(heroBannerRequest, heroBanner);
        heroBannerRepository.save(heroBanner);
        return new ResponseEntity<>(heroBannerMapper.toDto(heroBanner), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HeroBannerResponse> getHeroBanner(Long id) {
        HeroBanner heroBanner = heroBannerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "HeroBanner tapılmadı"));
        return new ResponseEntity<>(heroBannerMapper.toDto(heroBanner), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteHeroBanner(Long id) {
        HeroBanner heroBanner = heroBannerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "HeroBanner tapılmadı"));

        heroBannerRepository.delete(heroBanner);

        return ResponseEntity.noContent().build();

    }
}
