package az.itbrains.brightkids.mapper;

import az.itbrains.brightkids.dtos.requset.VisitRequest;
import az.itbrains.brightkids.dtos.response.VisitResponse;
import az.itbrains.brightkids.models.Location;
import az.itbrains.brightkids.models.Visit;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring", uses = {LocationMapper.class})
public abstract class VisitMapper {

    @Autowired
    protected LocationMapper locationMapper;

    public VisitResponse toDto(Visit visit) {
        if (visit == null) return null;

        VisitResponse response = new VisitResponse();
        response.setTitle(visit.getTitle());
        response.setSubTitle(visit.getSubTitle());
        response.setMapUrl(visit.getMapUrl());

        if (visit.getLocations() != null) {
            response.setLocations(locationMapper.toListDto(visit.getLocations()));
        } else {
            response.setLocations(new ArrayList<>());
        }

        return response;
    }

    public Visit toEntity(VisitRequest visitRequest) {
        if (visitRequest == null) return null;

        Visit visit = new Visit();
        visit.setTitle(visitRequest.getTitle());
        visit.setSubTitle(visitRequest.getSubTitle());
        visit.setMapUrl(visitRequest.getMapUrl());

        if (visitRequest.getLocations() != null) {
            List<Location> locations = new ArrayList<>();
            visitRequest.getLocations().forEach(locReq -> {
                Location loc = locationMapper.toEntity(locReq);
                loc.setVisit(visit);
                locations.add(loc);
            });
            visit.setLocations(locations);
        } else {
            visit.setLocations(new ArrayList<>());
        }

        return visit;
    }

    public void updateEntityFromDto(VisitRequest visitRequest, @MappingTarget Visit visit) {
        if (visitRequest == null) return;

        visit.setTitle(visitRequest.getTitle());
        visit.setSubTitle(visitRequest.getSubTitle());
        visit.setMapUrl(visitRequest.getMapUrl());

        if (visitRequest.getLocations() != null) {
            List<Location> locations = new ArrayList<>();
            visitRequest.getLocations().forEach(locReq -> {
                Location loc = locationMapper.toEntity(locReq);
                loc.setVisit(visit);
                locations.add(loc);
            });
            visit.setLocations(locations);
        }
    }
}
