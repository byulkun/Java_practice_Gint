package gint;

public class Member {
	private String name;
	private String team;
	private String rank;

	public Member(String name, String team, String rank) {
		this.name= name;
		this.team = team;
		this.rank = rank;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getTeam() {return team;}
	public void setTeam(String team) {this.team = team;}
	
	public String getRank( ) {return rank;}
	public void setRank(String rank) {this.rank = rank;}
}
