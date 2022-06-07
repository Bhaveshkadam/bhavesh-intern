package in.pelligent.amazonbook.controller;


import in.pelligent.amazonbook.persistance.POJO.LanguageRequest;
import in.pelligent.amazonbook.service.LanguageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/language")
public class LanguageController {
    public LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @ApiOperation("To add a language")
    @PostMapping
    public void addLanguage(LanguageRequest languageRequest) {
        languageService.addLanguage(languageRequest);
    }
}
