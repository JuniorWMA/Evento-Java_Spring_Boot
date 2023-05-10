package com.evento.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evento.projeto.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
