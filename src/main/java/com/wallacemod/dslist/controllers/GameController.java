package com.wallacemod.dslist.controllers;

import com.wallacemod.dslist.dto.GameDTO;
import com.wallacemod.dslist.dto.GameMinDTO;
import com.wallacemod.dslist.entities.Game;
import com.wallacemod.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;
    }
    @GetMapping
    public List<GameMinDTO> listar(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}