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
public class SupportBanner {

//    Give Families Hope and Healing

    private String title;
    private String description;
    private String firstButtonText;
    private String firstButtonUrl;
    private String secondButtonText;
    private String secondButtonUrl;
    private String imageUrl;
}
