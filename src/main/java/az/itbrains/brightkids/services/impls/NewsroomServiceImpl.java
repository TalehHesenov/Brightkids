package az.itbrains.brightkids.services.impls;

import az.itbrains.brightkids.dtos.requset.NewsroomRequest;
import az.itbrains.brightkids.dtos.response.NewsroomResponse;
import az.itbrains.brightkids.mapper.NewsroomMapper;
import az.itbrains.brightkids.models.Newsroom;
import az.itbrains.brightkids.repositories.NewsroomRepository;
import az.itbrains.brightkids.services.NewsroomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsroomServiceImpl implements NewsroomService {
    private final NewsroomMapper newsroomMapper;
    private final NewsroomRepository newsroomRepository;

    @Override
    public ResponseEntity<NewsroomResponse> createNewsroom(NewsroomRequest newsroomRequest) {
        Newsroom newsroom = newsroomMapper.toEntity(newsroomRequest);
        newsroomRepository.save(newsroom);
        return new ResponseEntity<>(newsroomMapper.toDto(newsroom), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<NewsroomResponse> getNewsroom(Long id) {
        Newsroom newsroom = newsroomRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Newsroom tapılmadı"));

        return new ResponseEntity<>(newsroomMapper.toDto(newsroom), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<NewsroomResponse> updateNewsroom(Long id, NewsroomRequest newsroomRequest) {
        Newsroom newsroom = newsroomRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Newsroom tapılmadı"));

        newsroomMapper.updateEntityFromDto(newsroomRequest, newsroom);
        newsroomRepository.save(newsroom);
        return new ResponseEntity<>(newsroomMapper.toDto(newsroom), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteNewsroom(Long id) {
        Newsroom newsroom = newsroomRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Newsroom tapılmadı"));
        newsroomRepository.delete(newsroom);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<NewsroomResponse>> getAllNewsroomService() {
        List<Newsroom> newsrooms = newsroomRepository.findAll();

        if (newsrooms.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(newsroomMapper.toListDto(newsrooms), HttpStatus.OK);
    }
}
