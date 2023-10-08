package com.wallacemod.dslist.repositories;

import com.wallacemod.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}