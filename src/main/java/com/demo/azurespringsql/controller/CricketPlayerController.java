package com.demo.azurespringsql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.azurespringsql.entity.CricketPlayer;
import com.demo.azurespringsql.repository.CricketPlayerRepository;



@RestController
public class CricketPlayerController {
	@Autowired
	private CricketPlayerRepository cricketPlayerRepository;
	
	
	@GetMapping("/all")
	public List<CricketPlayer> getAllCricketPlayers(){
		return cricketPlayerRepository.findAll();
	}
	@PostMapping("/save")
	public  CricketPlayer addCricketPlayer(@RequestBody CricketPlayer cricketPlayer) {
		return cricketPlayerRepository.save(cricketPlayer);
	}

}
