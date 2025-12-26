package az.itbrains.brightkids.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientStoryRequest {
    private String title;
    private String description;
    private String buttonText;
    private String buttonUrl;
    private String imageUrl;
}
