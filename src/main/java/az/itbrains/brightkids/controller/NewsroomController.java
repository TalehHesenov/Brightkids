package az.itbrains.brightkids.controller;

import az.itbrains.brightkids.dtos.requset.NewsroomRequest;
import az.itbrains.brightkids.dtos.response.HospitalServiceResponse;
import az.itbrains.brightkids.dtos.response.NewsroomResponse;
import az.itbrains.brightkids.services.NewsroomService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/newsroom")
@RequiredArgsConstructor
public class NewsroomController {
    private final NewsroomService newsroomService;

    @PostMapping
    public ResponseEntity<NewsroomResponse> createNewsroom(
            @Valid @RequestBody NewsroomRequest newsroomRequest) {
        return newsroomService.createNewsroom(newsroomRequest);
    }

    @GetMapping("/{id}")
    public ResponseEntity<NewsroomResponse> getNewsroom(@PathVariable Long id) {
        return newsroomService.getNewsroom(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<NewsroomResponse> updateNewsroom(
            @Valid @RequestBody NewsroomRequest newsroomRequest, @PathVariable Long id) {
        return newsroomService.updateNewsroom(id, newsroomRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNewsroom(@PathVariable Long id) {
        newsroomService.deleteNewsroom(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/all")
    public ResponseEntity<List<NewsroomResponse>> getAllNewsroomService() {
        return newsroomService.getAllNewsroomService();
    }
}
