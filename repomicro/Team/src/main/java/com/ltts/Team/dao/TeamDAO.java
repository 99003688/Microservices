package com.ltts.Team.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.Team.model.Team;
@Repository
public class TeamDAO 
{
	public List<Team> putlist()
	{
		List<Team> pl=new ArrayList<Team>();
		pl.add(new Team(1,"anil","lc"));
		pl.add(new Team(1,"jui","mc"));
		pl.add(new Team(1,"gty","bc"));
		pl.add(new Team(1,"der","gc"));
		return pl;
	}
}
