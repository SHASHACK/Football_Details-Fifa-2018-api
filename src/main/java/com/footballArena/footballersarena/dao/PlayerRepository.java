package com.footballArena.footballersarena.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.footballArena.footballersarena.model.PlayerModel;

public interface PlayerRepository extends JpaRepository<PlayerModel, String> {
	List<PlayerModel> findAllByOrderByName();
}
