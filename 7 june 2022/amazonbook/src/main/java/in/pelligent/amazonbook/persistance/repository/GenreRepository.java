package in.pelligent.amazonbook.persistance.repository;

import in.pelligent.amazonbook.persistance.entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<GenreRepository, Integer> {
    GenreEntity findByType(String type);


}
