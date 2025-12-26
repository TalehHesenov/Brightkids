package az.itbrains.brightkids.mapper;

import az.itbrains.brightkids.dtos.requset.LocationRequest;
import az.itbrains.brightkids.dtos.response.LocationResponse;
import az.itbrains.brightkids.models.Location;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")

public interface LocationMapper {
    LocationResponse toDto(Location location);
    Location toEntity(LocationRequest locationRequest);
    List<LocationResponse> toListDto(List<Location> locations);
    void updateEntityFromDto(LocationRequest locationRequest, @MappingTarget Location location);
}
