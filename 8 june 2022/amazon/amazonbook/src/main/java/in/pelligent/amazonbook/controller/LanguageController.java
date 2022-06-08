package in.pelligent.amazonbook.controller;


import in.pelligent.amazonbook.persistance.POJO.LanguageRequest;
import in.pelligent.amazonbook.persistance.POJO.LanguageResponse;
import in.pelligent.amazonbook.service.LanguageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/language")
public class LanguageController {
    public LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @ApiOperation("To add a language")
    @PostMapping
    public ResponseEntity<LanguageResponse> addLanguage(@RequestBody LanguageRequest languageRequest) {

        return ResponseEntity.ok(languageService.addLanguage(languageRequest));
    }

    @ApiOperation("To show a language")
    @GetMapping("/{languageName}")
    public ResponseEntity<LanguageResponse> showLanguage(@PathVariable String languageName ) {
        LanguageResponse response = languageService.showLanguage(languageName);
        return ResponseEntity.ok(response);
    }
}
//    @PostMapping("/v1/listLanguage")
//    public l<String>
//}

//
//}
