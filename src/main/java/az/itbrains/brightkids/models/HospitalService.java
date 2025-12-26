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
public class HospitalService extends BaseEntity {

//!TODO Section 6

    private String title;
    private String description;
    private String imageUrl;
    private String actionText;
    private String actionUrl;
}
