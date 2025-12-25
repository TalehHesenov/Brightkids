package az.itbrains.brightkids.dtos.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HeroBannerResponse {

    private String title;
    private String description;
    private String imageUrl;
    private String linkButtonOneUrl;
    private String linkButtonOneName;
    private String linkButtonTwoUrl;
    private String linkButtonTwoName;
    private String linkTagUrl;
    private String linkTagName;
}
