package az.itbrains.brightkids.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientStoryResponse {
    private String title;
    private String description;
    private String buttonText;
    private String buttonUrl;
    private String imageUrl;
}
