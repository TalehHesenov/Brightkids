package az.itbrains.brightkids.dtos.response;

import az.itbrains.brightkids.dtos.requset.LocationRequest;
import az.itbrains.brightkids.models.Location;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VisitResponse {
    private String title;
    private String subTitle;
    private String mapUrl;
    private List<LocationResponse> locations;
}
