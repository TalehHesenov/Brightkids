package az.itbrains.brightkids.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewsroomResponse {
    private Long id;
    private String title;
    private String imageUrl;
    private String category;
    private String publishedAt;
    private String actionText;
    private String actionUrl;
    private String buttonText;
    private String buttonUrl;
}