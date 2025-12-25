package az.itbrains.brightkids.dtos.requset;
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
public class HeroBannerRequest {

    @NotBlank(message = "Title boş ola bilməz")
    @Size(min = 20, max = 40, message = "Title minumum 20 maksimum 40 simvol ola bilər")
    private String title;

    @Size(min = 50, max = 100, message = "Description miumum 50 maksimum 100 simvol ola bilər")
    private String description;

    @NotBlank(message = "Image URL boş ola bilməz")
    private String imageUrl;

    @NotBlank(message = "ButtonOneUrl URL boş ola bilməz")
    private String linkButtonOneUrl;

    @NotBlank(message = "ButtonOneName boş ola bilməz")
    private String linkButtonOneName;

    @NotBlank(message = "ButtonTwoUrl boş ola bilməz")
    private String linkButtonTwoUrl;

    @NotBlank(message = "ButtonTwoName boş ola bilməz")
    private String linkButtonTwoName;

    @NotBlank(message = "TagUrl boş ola bilməz")
    private String linkTagUrl;

    @NotBlank(message = "TagName boş ola bilməz")
    private String linkTagName;
}
