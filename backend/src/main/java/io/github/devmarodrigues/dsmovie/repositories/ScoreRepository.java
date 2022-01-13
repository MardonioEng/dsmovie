package io.github.devmarodrigues.dsmovie.repositories;

import io.github.devmarodrigues.dsmovie.entities.Score;
import io.github.devmarodrigues.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
