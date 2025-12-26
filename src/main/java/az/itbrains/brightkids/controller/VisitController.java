package az.itbrains.brightkids.controller;

import az.itbrains.brightkids.dtos.requset.VisitRequest;
import az.itbrains.brightkids.dtos.response.VisitResponse;
import az.itbrains.brightkids.services.VisitService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/visit")
@RequiredArgsConstructor
public class VisitController {
    private final VisitService visitService;

    @PostMapping
    public ResponseEntity<VisitResponse> createVisit(@Valid @RequestBody
                                                               VisitRequest visitRequest) {
        return visitService.createVisit(visitRequest);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VisitResponse> getVisit(@PathVariable Long id) {
        return visitService.getVisit(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VisitResponse> updateVisit(@Valid @RequestBody
                                                               VisitRequest visitRequest,
                                                               @PathVariable Long id) {
        return visitService.updateVisit(id, visitRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVisit(@PathVariable Long id) {
        visitService.deleteVisit(id);
        return ResponseEntity.noContent().build();
    }
}
