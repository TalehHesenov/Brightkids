package az.itbrains.brightkids.repositories;

import az.itbrains.brightkids.models.Newsroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsroomRepository extends JpaRepository<Newsroom,Long> {
}
