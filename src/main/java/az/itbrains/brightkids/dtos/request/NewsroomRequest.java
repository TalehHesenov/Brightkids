package az.itbrains.brightkids.dtos.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewsroomRequest {
    private String title;
    private String imageUrl;
    private String category;
    @NotNull(message = "Published date boş ola bilməz")
    private LocalDateTime publishedAt;
    private String actionText;
    private String actionUrl;
    private String buttonText;
    private String buttonUrl;
}
