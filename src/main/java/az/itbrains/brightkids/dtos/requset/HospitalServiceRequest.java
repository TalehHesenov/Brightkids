package az.itbrains.brightkids.dtos.requset;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HospitalServiceRequest {
    private String title;
    private String description;
    private String imageUrl;
    private String actionText;
    private String actionUrl;
}
