package io.github.devmarodrigues.dsmovie.controllers;

import io.github.devmarodrigues.dsmovie.dto.MovieDTO;

import io.github.devmarodrigues.dsmovie.dto.ScoreDTO;
import io.github.devmarodrigues.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        return scoreService.saveScore(dto);
    }

}
