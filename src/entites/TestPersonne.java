package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale addresse1= new AdressePostale(78, "Rue des Pouets", 34170, "Castelnau");
		AdressePostale adresse2 = new AdressePostale(4784, "Rue des Gnocchis", 34000, "Montpellier");
		Personne personne1 = new Personne("Dunant","Henri", addresse1);
		Personne personne2= new Personne("Patrick", "Pierre", adresse2);
	}

}
