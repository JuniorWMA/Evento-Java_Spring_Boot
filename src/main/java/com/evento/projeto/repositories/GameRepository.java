package com.evento.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evento.projeto.entities.Games;

public interface GameRepository extends JpaRepository<Games, Long> {
    
}
