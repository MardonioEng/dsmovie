package io.github.devmarodrigues.dsmovie.services;

import io.github.devmarodrigues.dsmovie.dto.MovieDTO;
import io.github.devmarodrigues.dsmovie.entities.Movie;
import io.github.devmarodrigues.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = movieRepository.findAll(pageable);
        return result.map(MovieDTO::new);
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Movie result = movieRepository.findById(id).get();
        return new MovieDTO(result);
    }

}
