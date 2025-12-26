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

    private String iconImg;
    private String title;
    private String linkUrl;
    private String linkName;
}
