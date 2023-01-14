package com.movies.movies.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MoviesControler {

    @GetMapping
    public String getMovies() {
        return "movies";
    }
}
