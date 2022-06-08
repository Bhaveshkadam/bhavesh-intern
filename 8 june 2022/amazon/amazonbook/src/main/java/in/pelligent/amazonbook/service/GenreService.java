package in.pelligent.amazonbook.service;

import in.pelligent.amazonbook.persistance.POJO.GenreRequest;
import in.pelligent.amazonbook.persistance.entity.GenreEntity;
import in.pelligent.amazonbook.persistance.repository.GenreRepository;
import org.springframework.stereotype.Service;

@Service
public class GenreService {

    public GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public void addGenre(GenreRequest genreRequest) {
        genreRepository.save(GenreEntity.builder()
                .genre(genreRequest.getGenre())
                .build());

//        public LanguageResponse addLanguage(LanguageRequest languageRequest) {
//            LanguageEntity save = languageRepository.save(LanguageEntity.builder().language(languageRequest.getLanguageName()).build());
//            return LanguageResponse.builder()
//                    .id(save.getLanguageId())
//                    .name(save.getLanguage())
//                    .build();
//        }
    }
}
