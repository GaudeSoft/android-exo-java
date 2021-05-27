package src;
public class Animal {
	private double poids;
	private String couleur;
	private String type;
		
	public 	Animal() {
		this.poids=0.0;
		this.couleur="";
		this.type="";
	}
	public 	Animal(double poids,String couleur, String type) {
		this.poids=poids;
		this.couleur=couleur;
		this.type=type;
	}
	

	
	
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids=poids;
	}
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur=couleur;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	
	 public void modeDeplacement(String dr)
	    {
	    	System.out.println("Le moyen de déplacement est: " + dr );
	    }
	 public void crie(String cr)
	    {
	    	System.out.println("Le cri est:" + cr);
	    }
}
