package com.ltts.Details.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.Details.model.Player;
import com.ltts.Details.model.Team;

@RestController
public class DetailController {


	@Autowired
	RestTemplate rt;
	
	@GetMapping("/Playerdetail")
	public  List<Player> getExternalPlayer(){
		
		
		ResponseEntity<Player[]> response=rt.getForEntity(
				  "http://Player/Players",
				  Player[].class);
				Player[] players = response.getBody();
				List<Player> pl=Arrays.asList(players);
				return pl;
	}
	
	/*@GetMapping("/TeamDetail")
	public List<Team> getExternalTeam(){
		
		
		ResponseEntity<Team[]> response =
				  rt.getForEntity(
				  "http://Team/teams/",
				  Team[].class);
				Team[] teams = response.getBody();
				List<Team> lt=Arrays.asList(teams);
				return lt;
	}*/
}
