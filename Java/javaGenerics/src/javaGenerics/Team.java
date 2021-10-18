package javaGenerics;
import java.util.*;
public class Team<T extends Player> implements Comparable<Team<T>>{
	// T is for team, to make specific players to that particular team
	//implementing comparable to compare the teams
private String name;
int played=0;
int won=0;
int tied=0;
int lost=0;
private ArrayList<T> members = new ArrayList<>();
//player is abstract class where other 3 extends

public Team(String name) {
	super();
	this.name = name;
}
public String getName() {
	return name;
}
public boolean addPlayer(T player) {
if(members.contains(player)) {
	System.out.println(player.getName()+"is already in team");
	return false;
}
else {
	members.add(player);
	System.out.println(player.getName()+  "picked for this team"  +this.name);
	return true;
}
}
public int numPlayers() {
	return this.members.size();
}
public void matchResult(Team opponent,int ourScore, int theirScore) {
	String message;
	if(ourScore>theirScore) {
		won++;
		message= "beat";
		
	}
	else if (ourScore==theirScore) {
		tied++;
		message= "drew with";
	}
	else {
		lost++;
		message= "lost to";
	}
	played++;
	if(opponent!=null) {
		System.out.println(this.getName() +message+ opponent.getName());
		opponent.matchResult(null, theirScore, ourScore);
	}
}
public int ranking() {
	return (won*2)+tied;
}
@Override
public int compareTo(Team<T> team ) {
	if(this.ranking()>team.ranking()) {
		return -1;
	}
	else if(this.ranking()<team.ranking()) {
		return 1;
	}
	return 0;
	
}
}
