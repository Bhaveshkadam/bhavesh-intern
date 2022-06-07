package in.pelligent.amazonbook.controller;


import in.pelligent.amazonbook.persistance.POJO.LanguageRequest;
import in.pelligent.amazonbook.persistance.POJO.LanguageResponse;
import in.pelligent.amazonbook.service.LanguageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
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

    @ApiOperation("To show a language")
    @GetMapping
    public void showLanguage(LanguageRequest languageRequest) {
        languageService.ShowLanguage(languageRequest);
    }
}
//    @PostMapping("/v1/listLanguage")
//    public l<String>
//}

//    @PostMapping("/v1/listLanguage")
//    public LanguageResponse<String> showLanguage(@Valid @RequestBody final ShortlistRequest shortlistRequest) {
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(shortlistService.shortlist(shortlistRequest));
//}
