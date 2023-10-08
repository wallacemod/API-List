package com.wallacemod.dslist.services;

import com.wallacemod.dslist.dto.GameListDTO;
import com.wallacemod.dslist.dto.GameMinDTO;
import com.wallacemod.dslist.entities.Game;
import com.wallacemod.dslist.entities.GameList;
import com.wallacemod.dslist.repositories.GameListRepository;
import com.wallacemod.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}
