package az.itbrains.brightkids.dtos.request;

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
public class MedicalSpecialtyRequest {

    @NotBlank(message = "imgUrl boş ola bilməz")
    private String imgUrl;

    @NotBlank(message = "title boş ola bilməz")
    @Size(min = 20, max = 40, message = "Title minumum 20 maksimum 40 simvol ola bilər")
    private String title;

    @NotBlank(message = "description boş ola bilməz")
    private String description;

    @NotBlank(message = "linkUrl boş ola bilməz")
    private String linkUrl;

    @NotBlank(message = "linkName boş ola bilməz")
    private String linkName;
}
