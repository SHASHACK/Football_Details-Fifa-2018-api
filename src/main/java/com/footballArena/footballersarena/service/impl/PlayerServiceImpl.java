package com.footballArena.footballersarena.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footballArena.footballersarena.dao.PlayerRepository;
import com.footballArena.footballersarena.model.PlayerModel;
import com.footballArena.footballersarena.service.PlayerService;

@Service("playerService")
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	private PlayerRepository playerRepo;
	@Override
	public List<PlayerModel> getPlayers() {
		return this.playerRepo.findAll();
	}

	@Override
	public PlayerModel getPlayer(String name) {
		Optional<PlayerModel> player =  this.playerRepo.findById(name);
		if(player.isPresent()) {
			return player.get();
		}
		else {
			return null;
		}
	}
	
	@Override
	public List<PlayerModel> sortByName(){
		return this.playerRepo.findAllByOrderByName();
	}

}
