package az.itbrains.brightkids.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Visit extends BaseEntity{

    //!TODO Section 8

    private String title;
    private String subTitle;
    private String mapUrl;

    @OneToMany(mappedBy = "visit")
    private List<Location> locations =new ArrayList<>();
}
