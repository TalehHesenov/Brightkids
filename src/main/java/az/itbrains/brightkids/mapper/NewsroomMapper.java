package az.itbrains.brightkids.mapper;

import az.itbrains.brightkids.dtos.request.NewsroomRequest;
import az.itbrains.brightkids.dtos.response.NewsroomResponse;
import az.itbrains.brightkids.models.Newsroom;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")

public interface NewsroomMapper {
    NewsroomResponse toDto(Newsroom newsroom);

    Newsroom toEntity(NewsroomRequest newsroomRequest);

    List<NewsroomResponse> toListDto(List<Newsroom> newsrooms);

    void updateEntityFromDto(NewsroomRequest newsroomRequest, @MappingTarget Newsroom newsroom);
}