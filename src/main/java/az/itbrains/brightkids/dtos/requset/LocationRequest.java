package az.itbrains.brightkids.dtos.requset;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LocationRequest {

    private String address;
    private String detail;
    private Integer visitId;
}
