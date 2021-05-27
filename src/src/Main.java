package src;

public class Main {

	public static void main(String[] args) {
		Serpent Cobra = new Serpent();
		Cobra.setPoids(2.5);
		Cobra.setCouleur("Noir");
		Cobra.setType("Venimeux");
		
		Cobra.modeDeplacement("Rampe");
		Cobra.crie("Siffle");
	}

}
