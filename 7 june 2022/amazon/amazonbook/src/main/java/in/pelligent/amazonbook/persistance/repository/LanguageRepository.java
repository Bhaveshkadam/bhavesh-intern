package in.pelligent.amazonbook.persistance.repository;

import in.pelligent.amazonbook.persistance.entity.LanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<LanguageEntity, Integer> {
    LanguageEntity findByLanguage(String language);



}
