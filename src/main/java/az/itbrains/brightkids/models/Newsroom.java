package az.itbrains.brightkids.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Newsroom extends BaseEntity{

    //!TODO Section 7

    private String title;
    private String imageUrl;
    private String category;
    private String date;
    private String actionText;
    private String actionUrl;
    private String buttonText;
    private String buttonUrl;
}
