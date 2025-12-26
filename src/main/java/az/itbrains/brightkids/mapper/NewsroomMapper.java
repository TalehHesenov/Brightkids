package az.itbrains.brightkids.mapper;

import az.itbrains.brightkids.dtos.requset.NewsroomRequest;
import az.itbrains.brightkids.dtos.requset.PatientStoryRequest;
import az.itbrains.brightkids.dtos.response.NewsroomResponse;
import az.itbrains.brightkids.dtos.response.PatientStoryResponse;
import az.itbrains.brightkids.models.Newsroom;
import az.itbrains.brightkids.models.PatientStory;
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