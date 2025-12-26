package az.itbrains.brightkids.services;

import az.itbrains.brightkids.dtos.requset.QuickActionRequest;
import az.itbrains.brightkids.dtos.response.QuickActionResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuickActionService {

    ResponseEntity<QuickActionResponse> createQuickAction(QuickActionRequest request);
    ResponseEntity<QuickActionResponse> updateQuickAction(Long id,QuickActionRequest request);
    ResponseEntity<QuickActionResponse> getQuickAction(Long id);
    ResponseEntity<Void> deleteQuickAction(Long id);
    ResponseEntity<List<QuickActionResponse>> getAllQuickAction();
}
