package az.itbrains.brightkids.mapper;

import az.itbrains.brightkids.dtos.request.LocationRequest;
import az.itbrains.brightkids.dtos.response.LocationResponse;
import az.itbrains.brightkids.models.Location;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LocationMapper {


    @Mapping(source = "visit.id", target = "visitId")
    LocationResponse toDto(Location location);

    @Mapping(source = "visitId", target = "visit.id")
    Location toEntity(LocationRequest locationRequest);


    List<LocationResponse> toListDto(List<Location> locations);


    void updateEntityFromDto(LocationRequest locationRequest,
                             @MappingTarget Location location);
}
