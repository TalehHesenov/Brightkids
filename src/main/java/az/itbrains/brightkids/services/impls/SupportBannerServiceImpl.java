package az.itbrains.brightkids.services.impls;

import az.itbrains.brightkids.dtos.request.SupportBannerRequest;
import az.itbrains.brightkids.dtos.response.SupportBannerResponse;
import az.itbrains.brightkids.mapper.SupportBannerMapper;
import az.itbrains.brightkids.models.SupportBanner;
import az.itbrains.brightkids.repositories.SupportBannerRepository;
import az.itbrains.brightkids.services.SupportBannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class SupportBannerServiceImpl implements SupportBannerService {
    private final SupportBannerMapper supportBannerMapper;
    private final SupportBannerRepository supportBannerRepository;

    @Override
    public ResponseEntity<SupportBannerResponse> createSupportBanner(SupportBannerRequest supportBannerRequest) {
        SupportBanner supportBanner=supportBannerMapper.toEntity(supportBannerRequest);
        supportBannerRepository.save(supportBanner);
        return new ResponseEntity<>(supportBannerMapper.toDto(supportBanner), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<SupportBannerResponse> getSupportBanner(Long id) {
        SupportBanner supportBanner = supportBannerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SupportBanner tapılmadı"));
        return new ResponseEntity<>(supportBannerMapper.toDto(supportBanner), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<SupportBannerResponse> updateSupportBanner(
            Long id, SupportBannerRequest supportBannerRequest){

        SupportBanner supportBanner = supportBannerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SupportBanner tapılmadı"));

        supportBannerMapper.updateEntityFromDto(supportBannerRequest, supportBanner);
        supportBannerRepository.save(supportBanner);
        return new ResponseEntity<>(supportBannerMapper.toDto(supportBanner), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteSupportBanner(Long id) {
        SupportBanner supportBanner = supportBannerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SupportBanner tapılmadı"));

        supportBannerRepository.delete(supportBanner);

        return ResponseEntity.noContent().build();

    }
}
