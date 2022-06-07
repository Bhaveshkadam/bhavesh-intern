package in.pelligent.amazonbook.service;

import in.pelligent.amazonbook.persistance.POJO.LanguageRequest;
import in.pelligent.amazonbook.persistance.entity.LanguageEntity;
import in.pelligent.amazonbook.persistance.repository.LanguageRepository;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {

    private LanguageRepository languageRepository;


    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
    public void addLanguage(LanguageRequest languageRequest) {
        languageRepository.save(LanguageEntity.builder().language(languageRequest.getLanguageName()).build());
    }

    public void ShowLanguage(LanguageRequest languageRequest) {
        languageRepository.save(LanguageEntity.builder().language(languageRequest.getLanguageName()).build());
    }

}
