package in.pelligent.amazonbook.persistance.repository;

import in.pelligent.amazonbook.persistance.entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<GenreEntity, Integer> {
    GenreEntity findByGenre(String Genre);


}
