package az.itbrains.brightkids.dtos.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorRequest {

    @NotBlank(message = "name boş ola bilməz")
    private String name;

    @NotBlank(message = "imgUrl boş ola bilməz")
    private String imgUrl;

    @NotBlank(message = "department boş ola bilməz")
    private String department;

    @NotBlank(message = "urlLink boş ola bilməz")
    private String urlLink;

    @NotBlank(message = "urlName boş ola bilməz")
    private String urlName;
}
