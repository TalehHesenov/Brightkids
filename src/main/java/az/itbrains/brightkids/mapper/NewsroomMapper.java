package az.itbrains.brightkids.mapper;

import az.itbrains.brightkids.dtos.request.NewsroomRequest;
import az.itbrains.brightkids.dtos.response.NewsroomResponse;
import az.itbrains.brightkids.models.Newsroom;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
@Mapper(componentModel = "spring")
public interface NewsroomMapper {

    @Mapping(source = "publishedAt", target = "publishedAt", qualifiedByName = "formatDate")
    NewsroomResponse toDto(Newsroom newsroom);

    Newsroom toEntity(NewsroomRequest newsroomRequest);

    List<NewsroomResponse> toListDto(List<Newsroom> newsrooms);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    void updateEntityFromDto(NewsroomRequest newsroomRequest, @MappingTarget Newsroom newsroom);

    @Named("formatDate")
    default String formatDate(LocalDateTime dateTime) {
        if (dateTime == null) return null;
        return dateTime.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
    }
}
