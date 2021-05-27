package src;

public abstract class Oiseaux extends Animal implements Methode {
	private  String deplacement;
	private String parlement;
	
	public 	Oiseaux(String deplacement, String parlement) {
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
