package com.footballArena.footballersarena.service;

import java.util.List;

import com.footballArena.footballersarena.model.PlayerModel;

public interface PlayerService {
	
	List<PlayerModel> getPlayers();
	
	PlayerModel getPlayer(String name);

	List<PlayerModel> sortByName();
}
