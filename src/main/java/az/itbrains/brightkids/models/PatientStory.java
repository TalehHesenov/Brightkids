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
public class PatientStory extends BaseEntity {
//    Daniel Plays and Grows with World-Class Care

    private String title;
    private String description;
    private String buttonText;
    private String buttonUrl;
    private String imageUrl;
}
