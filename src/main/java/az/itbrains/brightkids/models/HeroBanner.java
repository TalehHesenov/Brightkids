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
public class HeroBanner extends BaseEntity {

    //!TODO Section1

    private String title;
    private String description;
    private String imageUrl;
    private String linkButtonOneUrl;
    private String linkButtonOneName;
    private String linkButtonTwoUrl;
    private String linkButtonTwoName;
    private String linkTagUrl;
    private String linkTagName;


}
