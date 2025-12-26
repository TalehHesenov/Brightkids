package az.itbrains.brightkids.controller;

import az.itbrains.brightkids.dtos.request.QuickActionRequest;
import az.itbrains.brightkids.dtos.response.QuickActionResponse;
import az.itbrains.brightkids.services.QuickActionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/quick-action")
@RequiredArgsConstructor
public class QuickActionController {
    private final QuickActionService quickActionService;

    @PostMapping
    public ResponseEntity<QuickActionResponse> createQuickAction(@Valid @RequestBody QuickActionRequest request) {
        return quickActionService.createQuickAction(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuickActionResponse> getQuickAction(@PathVariable Long id) {
        return quickActionService.getQuickAction(id);
    }

    @GetMapping("/all")
    public ResponseEntity<List<QuickActionResponse>> getAllQuickAction() {
        return quickActionService.getAllQuickAction();
    }

    @PutMapping("/{id}")
    public ResponseEntity<QuickActionResponse> updateQuickAction(@Valid @RequestBody QuickActionRequest request, @PathVariable Long id) {
        return quickActionService.updateQuickAction(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuickAction(@PathVariable Long id) {
        quickActionService.deleteQuickAction(id);
        return ResponseEntity.noContent().build();
    }

}
