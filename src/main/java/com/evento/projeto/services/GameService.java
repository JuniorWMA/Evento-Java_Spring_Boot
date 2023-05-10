package com.evento.projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evento.projeto.dto.GameDTO;
import com.evento.projeto.dto.GameMinDTO;
import com.evento.projeto.entities.Games;
import com.evento.projeto.repositories.GameRepository;



@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
      Games result = gameRepository.findById(id).get();
      GameDTO dto = new GameDTO(result);
      return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
      List<Games> result =  gameRepository.findAll();
      List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
      return dto;
    }
}
