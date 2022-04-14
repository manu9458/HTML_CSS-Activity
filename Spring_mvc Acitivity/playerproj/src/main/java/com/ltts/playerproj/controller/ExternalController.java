package com.ltts.playerproj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.playerproj.bo.playerbo;
import com.ltts.playerproj.model.player;

@RestController

public class ExternalController {
	@Autowired
	playerbo pb;
	@GetMapping("ex_players")
	public List<player> getplayers() {
		return pb.findAll();
	}
	
	@GetMapping("ex_player/{Id}")
	public player getPlayerById(@PathVariable int id)
	{
		return pb.getById(id);
	}

}
