
public abstract class SportsTeam {
	
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	
	public SportsTeam() {
		teamName = "";
		teamMascot = "";
		headCoach = "";
		wins = 0;
		losses = 0;
	}//end empty-argument constructor
	
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		setTeamName(teamName); //specs said to set all instance fields to 0, but the method passes in variables for teamName, teamMascot, and headCoach, so have to set those, right?
		setTeamMascot(teamMascot);
		setHeadCoach(headCoach);
		wins = 0;
		losses = 0;
	}//end preferred constructor
	
	public double getWinPercentage() {
		return (wins/(wins + losses));
	}//end getWinPercentage

	public String getTeamName() {
		return teamName;
	}//end getTeamName

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}//end setTeamName

	public String getTeamMascot() {
		return teamMascot;
	}//end getTeamMascot

	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}//end setTeamMascot

	public String getHeadCoach() {
		return headCoach;
	}//end getHeadCoach

	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}//end setHeadCoach

	public int getWins() {
		return wins;
	}//end getWins

	public void setWins(int wins) {
		this.wins = wins;
	}//end setWins

	public int getLosses() {
		return losses;
	}//end getLosses

	public void setLosses(int losses) {
		this.losses = losses;
	}//end setLosses
	
	//specs say not to implement getStats, so my understanding is I do nothing with it.

}//end class
