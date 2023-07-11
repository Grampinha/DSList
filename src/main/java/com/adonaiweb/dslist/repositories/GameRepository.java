package com.adonaiweb.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adonaiweb.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
