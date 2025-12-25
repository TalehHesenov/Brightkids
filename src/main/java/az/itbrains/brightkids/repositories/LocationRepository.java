package az.itbrains.brightkids.repositories;

import az.itbrains.brightkids.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
