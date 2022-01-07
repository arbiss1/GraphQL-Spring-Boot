package arbis.example.graphql.repository;

import arbis.example.graphql.domain.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial,Long> {
}
