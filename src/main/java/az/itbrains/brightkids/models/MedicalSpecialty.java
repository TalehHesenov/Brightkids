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

//!TODO Section3

    private String imgUrl;
    private String title;
    private String description;
    private String linkUrl;
    private String linkName;
}
