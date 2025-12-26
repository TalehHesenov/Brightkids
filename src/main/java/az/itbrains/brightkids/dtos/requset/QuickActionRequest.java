package az.itbrains.brightkids.dtos.requset;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuickActionRequest {

    @NotBlank(message = "iconImg boş ola bilməz")
    private String iconImg;

    @NotBlank(message = "title boş ola bilməz")
    private String title;

    @NotBlank(message = "linkUrl boş ola bilməz")
    private String linkUrl;

    @NotBlank(message = "linkName boş ola bilməz")
    private String linkName;
}
