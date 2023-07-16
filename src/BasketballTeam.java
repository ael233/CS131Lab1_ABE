
public class BasketballTeam extends SportsTeam {
	
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	
	public BasketballTeam() {
		super(); //does what specs says by setting all String instance variables to ""
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}//end empty-argument constructor
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		super(); //the super constructor sets the provided parameters.
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}//end preferred constructor
	
	public double fieldGoalPercentage() {
		return (fieldGoals/fieldGoalsAttempted);
	}//end fieldGoalPercentage
	
	public double freeThrowPercentage() {
		return (freeThrows/freeThrowsAttempted);
	}//end freeThrowPercentage
	
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		setWins(wins);
		setLosses(losses);
		setFieldGoals(fieldGoals);
		setFieldGoalsAttempted(fieldGoalsAttempted);
		setFreeThrows(freeThrows);
		setFreeThrowsAttempted(freeThrowsAttempted);
	}//end setStats
	
	public double[] getStats() {
		double winPercentage = getWinPercentage();
		double fieldGoalPercentage = fieldGoalPercentage();
		double freeThrowPercentage = freeThrowPercentage();
		
		double[] stats = new double[3];
		stats[0] = winPercentage;
		stats[1] = fieldGoalPercentage;
		stats[2] = freeThrowPercentage;
		
		return stats;
	}//end getStats

	public int getFieldGoals() {
		return fieldGoals;
	}

	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}

	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}

	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}

	public int getFreeThrows() {
		return freeThrows;
	}

	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}

	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}

	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}
	
	
	
}//end class
