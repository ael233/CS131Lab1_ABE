import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	
	private boolean active;
	private String intelligenceType;
		
	public NonPlayerCharacter() {
		super();
		setActive(false);
		setIntelligenceType("AVERAGE");
	}//end empty-argument constructor
	
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		super();
		//setUniqueID(id); the super constructor does this, right?
		//setPersonality(personality); //the super constructor does this, right?
		setActive(true);
		setIntelligenceType(intelligenceType);
	}//end preferred constructor
	
	public String reportStructure() { //I'm instantiating a new variable that will use but override the superclass variable
		StringBuilder sb = new StringBuilder(super.reportStructure()); //this calls the superclass reportStructure method
		sb.append("Active: " + isActive() + "\n");
		sb.append("Intelligence: " + getIntelligenceType() + "\n");
		sb.append("==================================\n");
		
		return sb.toString();
	}//end reportStructure method

	public String introduce() { //This is set up exactly like reportStructures().
		StringBuilder intro = new StringBuilder();
		intro.append("Hello, my name is " + uniqueID);
		return intro.toString();
	}//end introduce
	
	public String exclaim() { 
		String[] exclamationArray = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		String exclamation = exclamationArray[(int)(Math.random() * exclamationArray.length)];
		return exclamation;
	}//end exclaim
		
	public boolean isActive() {
		return active;
	}//end getActive

	public void setActive(boolean active) {
		this.active = active;
	}//end setActive

	public String getIntelligenceType() {
		return intelligenceType;
	}//end getIntelligenceType

	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}//end setIntelligenceType
	
	
}//end class
