package az.itbrains.brightkids.services;

import az.itbrains.brightkids.dtos.requset.VisitRequest;
import az.itbrains.brightkids.dtos.response.VisitResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

public interface VisitService {
    ResponseEntity<Void> deleteVisit(Long id);

    ResponseEntity<VisitResponse> updateVisit(Long id, @Valid VisitRequest visitRequest);

    ResponseEntity<VisitResponse> getVisit(Long id);

    ResponseEntity<VisitResponse> createVisit(@Valid VisitRequest visitRequest);
}
