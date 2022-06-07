package in.pelligent.amazonbook.controller;

import in.pelligent.amazonbook.persistance.POJO.GenreRequest;
import in.pelligent.amazonbook.service.GenreService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/genre")
public class GenreController {
    public GenreService genreService;

    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }
    @ApiOperation("To add a genre")
    @PostMapping
    public void addGenre(GenreRequest genreRequest) {
        genreService.addGenre(genreRequest);

    }

}



