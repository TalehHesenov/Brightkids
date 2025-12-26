package az.itbrains.brightkids.services;

import az.itbrains.brightkids.dtos.request.NewsroomRequest;
import az.itbrains.brightkids.dtos.response.NewsroomResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface NewsroomService {
    ResponseEntity<NewsroomResponse> createNewsroom(@Valid NewsroomRequest newsroomRequest);

    ResponseEntity<NewsroomResponse> getNewsroom(Long id);

    ResponseEntity<NewsroomResponse> updateNewsroom(Long id, @Valid NewsroomRequest newsroomRequest);

    ResponseEntity<Void> deleteNewsroom(Long id);

    ResponseEntity<List<NewsroomResponse>> getAllNewsroomService();
}
