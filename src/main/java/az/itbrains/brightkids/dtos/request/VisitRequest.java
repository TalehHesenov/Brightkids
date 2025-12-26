package az.itbrains.brightkids.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VisitRequest {
    private String title;
    private String subTitle;
    private String mapUrl;
    private List<LocationRequest> locations;
}
