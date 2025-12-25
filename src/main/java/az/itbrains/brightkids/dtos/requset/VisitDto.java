package az.itbrains.brightkids.dtos.requset;

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
public class VisitDto {
    private String title;
    private String subTitle;
    private String mapUrl;
    private List<Location> locations;
}
