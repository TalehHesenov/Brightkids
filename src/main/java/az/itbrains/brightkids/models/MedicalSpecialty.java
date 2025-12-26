package az.itbrains.brightkids.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MedicalSpecialty extends BaseEntity {
    private String iconImg;
    private String title;
    private String linkUrl;
    private String linkName;
}
