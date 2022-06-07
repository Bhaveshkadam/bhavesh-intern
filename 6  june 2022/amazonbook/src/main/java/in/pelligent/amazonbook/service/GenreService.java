package in.pelligent.amazonbook.service;

import in.pelligent.amazonbook.persistance.POJO.GenreRequest;
import in.pelligent.amazonbook.persistance.entity.GenreEntity;
import in.pelligent.amazonbook.persistance.repository.GenreRepository;

public class GenreService {

    public GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

//    public void addGenre(GenreRequest genreRequest) {
//        genreRepository.save(GenreEntity.builder().(genreRequest.getType());
//    }
}
