package javaGenerics;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main (String[] args) {
		FootballPlayer joe=new FootballPlayer("joe");
		BaseballPlayer pat=new BaseballPlayer("pat");
		SoccerPlayer beckam =new SoccerPlayer("beckam");
		Team<FootballPlayer> heroes= new Team<> ("heroes");
		heroes.addPlayer(joe);
		
		
		System.out.println(heroes.numPlayers());
		Team<BaseballPlayer> baseballTeam=new Team<>("chicago");
		baseballTeam.addPlayer(pat);
		
		Team<SoccerPlayer> brokenTeam=new Team<>("hurray");
		brokenTeam.addPlayer(beckam);
		
		
		Team<FootballPlayer> marines= new Team<> ("marines");
		FootballPlayer banks=new FootballPlayer("george");
		marines.addPlayer(banks);
		Team<FootballPlayer> hawthorn= new Team<> ("Hawthorn");
		Team<FootballPlayer> fremantle= new Team<> ("fremantle");
		hawthorn.matchResult(fremantle,1,0);
		hawthorn.matchResult(heroes,1,0);
		heroes.matchResult(fremantle,1,2);
		heroes.matchResult(baseballTeam,1,0);
		
		System.out.println("Rankings");
		System.out.println(heroes.getName()+ ":" +heroes.ranking());
		System.out.println(marines.getName()+ ":" +marines.ranking());
		System.out.println(fremantle.getName()+ ":" +fremantle.ranking());
		System.out.println(hawthorn.getName()+ ":" +hawthorn.ranking());
	
		System.out.println(heroes.compareTo(marines));
		System.out.println(heroes.compareTo(hawthorn));
		System.out.println(hawthorn.compareTo(heroes));
		System.out.println(marines.compareTo(fremantle));
		
		//ArrayList<Team> teams;
		//Collections.sort(teams);
		
	
	
	}
}
