package com.ltts.Player.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Player.DAO.PlayerDAO;
import com.ltts.Player.model.Player;

import java.util.List;

@RestController
public class PlayerController {
	@Autowired
	PlayerDAO td;
	
	@GetMapping(value="/Players")
	public List<Player>index(){
		List<Player> li=td.getAllPlayers();
		return li;
		
	}
	

}
