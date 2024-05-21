package com.lab;


class Sport {

	String name;
	String sport_name;
	

	public Sport(String name, String sport_name) {
		super();
		this.name = name;
		this.sport_name = sport_name;
	}
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSport_name() {
		return sport_name;
	}



	public void setSport_name(String sport_name) {
		this.sport_name = sport_name;
	}



	public String play() {

		
		return getName()+" playing "+getSport_name();
	}
}

class Football extends Sport {

	int foot_score;
	

	public Football(String name, String sport_name, int foot_score) {
		super(name, sport_name);
		this.foot_score = foot_score;
	}
	

	public int getFoot_score() {
		return foot_score;
	}


	public void setFoot_score(int foot_score) {
		this.foot_score = foot_score;
	}


	public String play() {
		return getName()+" is playing a Football";
          
	}
	
	public void footScore() {
		System.out.println(getName()+ " is playing  "+getSport_name()+" and its score is "+getFoot_score());
	}
}

class Basketball extends Sport {
    
	String team_name;
public Basketball(String name, String sport_name, String team_name) {
		super(name, sport_name);
		this.team_name = team_name;
	}
//	public Basketball(String name, String sport_name, int foot_score) {
//		super(name, sport_name, foot_score);
//		// TODO Auto-generated constructor stub
//	}

	public String play() {
		return getName()+ " is team member of "+getTeam_name()+ " and he is playing "+getSport_name();

	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	
	public void team_Name() {
		System.out.println("team name is :"+team_name);
	}
}

class Rugby extends Sport {

	public Rugby(String name, String sport_name) {
		super(name, sport_name);
		// TODO Auto-generated constructor stub
	}

	public String play() {
		return getName()+" is playing "+getSport_name();

	}
}

public class Problem1 {

	public static void main(String[] args) {

		Sport s = new Sport("Amit", "Cricket");
		Football f = new Football("datta", "football", 4);
		
		Basketball b = new Basketball("sagar",  "basketball", "pune warriers");
		
		Rugby r = new Rugby("vijay", "Rugby");
		
		System.out.println(s.play());
		System.out.println(f.play());
		System.out.println(b.play());
		System.out.println(r.play());
		
		f.footScore();
		b.team_Name();
		
	}
}

