package com.ltts.Team.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Team.dao.TeamDAO;
import com.ltts.Team.model.Team;

@RestController
public class TeamController 
{	
	TeamDAO td = new TeamDAO();

	  @GetMapping(value="/teams")
	    public List<Team> index() {
		  
	        return td.putlist();
	    }
}
