package az.itbrains.brightkids.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SupportBannerResponse {
    private String title;
    private String description;
    private String firstButtonText;
    private String firstButtonUrl;
    private String secondButtonText;
    private String secondButtonUrl;
    private String imageUrl;
}
