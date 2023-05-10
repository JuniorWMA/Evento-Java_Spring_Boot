package com.evento.projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evento.projeto.dto.GameDTO;
import com.evento.projeto.dto.GameListDTO;
import com.evento.projeto.entities.GameList;

import com.evento.projeto.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> gldto = result.stream().map(GameListDTO:: new).toList();
        return gldto;

    }
}
