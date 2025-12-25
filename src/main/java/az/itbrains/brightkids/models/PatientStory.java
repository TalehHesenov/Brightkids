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
    private String title;
    private String description;
    private String buttonText;
    private String buttonUrl;
    private String imageUrl;
}
