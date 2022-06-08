package in.pelligent.amazonbook.service;

import in.pelligent.amazonbook.persistance.POJO.LanguageRequest;
import in.pelligent.amazonbook.persistance.POJO.LanguageResponse;
import in.pelligent.amazonbook.persistance.entity.LanguageEntity;
import in.pelligent.amazonbook.persistance.repository.LanguageRepository;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {

    private LanguageRepository languageRepository;


    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
    public LanguageResponse addLanguage(LanguageRequest languageRequest) {
        LanguageEntity save = languageRepository.save(LanguageEntity.builder().language(languageRequest.getLanguageName()).build());
        return LanguageResponse.builder()
                .id(save.getLanguageId())
                .name(save.getLanguage())
                .build();
    }

    public LanguageResponse showLanguage(String languageName) {
        LanguageEntity language = languageRepository.findByLanguage(languageName);
        return new LanguageResponse(language.getLanguageId(), language.getLanguage());
    }

}




