package az.itbrains.brightkids.dtos.requset;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewsroomDto {
    private String title;
    private String imageUrl;
    private String category;
    private String date;
    private String actionText;
    private String actionUrl;
    private String buttonText;
    private String buttonUrl;
}
