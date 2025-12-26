package az.itbrains.brightkids.repositories;

import az.itbrains.brightkids.models.MedicalSpecialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalSpecialtyRepository extends JpaRepository<MedicalSpecialty,Long> {
}
