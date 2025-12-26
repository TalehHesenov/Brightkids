package az.itbrains.brightkids.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Location extends BaseEntity{
    private String address;
    private String detail;

    @ManyToOne
    @JoinColumn(name="visit_id")
    private Visit visit;
}
