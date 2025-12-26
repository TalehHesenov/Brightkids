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
public class HospitalService {

//    Why Families Trust Us

    private String title;
    private String description;
    private String imageUrl;
    private String actionText;
    private String actionUrl;
}
