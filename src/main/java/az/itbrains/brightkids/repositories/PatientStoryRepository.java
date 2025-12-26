package az.itbrains.brightkids.repositories;

import az.itbrains.brightkids.models.PatientStory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientStoryRepository extends JpaRepository<PatientStory,Long> {
}
