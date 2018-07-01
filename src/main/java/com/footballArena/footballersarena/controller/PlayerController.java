package com.footballArena.footballersarena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.footballArena.footballersarena.model.PlayerModel;
import com.footballArena.footballersarena.service.PlayerService;

@RestController
public class PlayerController {

	
	@Autowired
	private PlayerService playerService;
	
	@GetMapping("/players")
	private List<PlayerModel> getPlayer() {
		return this.playerService.getPlayers();

	}
	@GetMapping("/players/{name}")
	private PlayerModel getPlayerByName(@PathVariable String name) {
		return this.playerService.getPlayer(name);

	}
	@GetMapping("/playerSortByName")
	private List<PlayerModel> sortPlayerByName() {
		return this.playerService.sortByName();

	}
}
