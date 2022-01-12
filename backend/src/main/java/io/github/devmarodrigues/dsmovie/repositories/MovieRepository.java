package io.github.devmarodrigues.dsmovie.repositories;

import io.github.devmarodrigues.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
