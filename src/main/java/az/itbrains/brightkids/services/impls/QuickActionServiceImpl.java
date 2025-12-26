package az.itbrains.brightkids.services.impls;

import az.itbrains.brightkids.dtos.requset.QuickActionRequest;
import az.itbrains.brightkids.dtos.requset.QuickActionRequest;
import az.itbrains.brightkids.dtos.response.QuickActionResponse;
import az.itbrains.brightkids.dtos.response.QuickActionResponse;
import az.itbrains.brightkids.mapper.QuickActionMapper;
import az.itbrains.brightkids.models.QuickAction;
import az.itbrains.brightkids.repositories.QuickActionRepository;
import az.itbrains.brightkids.services.QuickActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuickActionServiceImpl implements QuickActionService {
    private final QuickActionRepository quickActionRepository;
    private final QuickActionMapper quickActionMapper;

    @Override
    public ResponseEntity<QuickActionResponse> createQuickAction(QuickActionRequest request) {
        QuickAction quickAction = quickActionMapper.toEntity(request);
        quickActionRepository.save(quickAction);
        return new ResponseEntity<>(quickActionMapper.toDto(quickAction), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<QuickActionResponse> updateQuickAction(Long id, QuickActionRequest specialtyRequest) {
        QuickAction quickAction = quickActionRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuickAction tapılmadı"));

        quickActionMapper.updateEntityFromDto(specialtyRequest, quickAction);
        quickActionRepository.save(quickAction);
        return new ResponseEntity<>(quickActionMapper.toDto(quickAction), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<QuickActionResponse> getQuickAction(Long id) {
        QuickAction quickAction = quickActionRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuickAction tapılmadı"));

        return new ResponseEntity<>(quickActionMapper.toDto(quickAction), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteQuickAction(Long id) {
        QuickAction quickAction = quickActionRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuickAction tapılmadı"));
        quickActionRepository.delete(quickAction);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<QuickActionResponse>> getAllQuickAction() {
        List<QuickAction> quickAction = quickActionRepository.findAll();

        if (quickAction.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(quickActionMapper.toListDto(quickAction), HttpStatus.OK);
    }

}
