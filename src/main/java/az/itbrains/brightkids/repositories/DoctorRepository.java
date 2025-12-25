package az.itbrains.brightkids.repositories;

import az.itbrains.brightkids.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
