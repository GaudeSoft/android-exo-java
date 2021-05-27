package src;

public class Serpent extends Animal implements Methode {
	private String deplacement;
	private String parlement;
	
	public 	Serpent() {
		this.deplacement="";
		this.parlement="";
	}
	public 	Serpent(String deplacement, String parlement) {
		this.deplacement=deplacement;
		this.parlement=parlement;
	}
		
	public String getParlement() {
		return parlement;
	}
	public void setParlement(String parlement) {
		this.parlement=parlement;
	}
	
	public String getDeplacemente() {
		return deplacement;
	}
	public void setDeplacement(String deplacement) {
		this.deplacement=deplacement;
	}
}
