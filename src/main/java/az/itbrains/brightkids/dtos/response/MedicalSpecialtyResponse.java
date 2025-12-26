package az.itbrains.brightkids.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MedicalSpecialtyResponse {

    private String imgUrl;
    private String title;
    private String description;
    private String linkUrl;
    private String linkName;
}
