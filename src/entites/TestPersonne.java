package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne personne1 = new Personne();
		Personne personne2= new Personne();
		
		personne1.nom = "Dunant";
		personne1.prenom = "Henri";
		personne1.adresse = new AdressePostale();
		personne1.adresse.codePostal = 34107;
		personne1.adresse.libelleRue = "Rue des Pouets";
		personne1.adresse.numeroRue = 78;
		personne1.adresse.ville= "Nice";
		
		personne2.nom = "Patrick";
		personne2.prenom = "Pierre";
		personne2.adresse = new AdressePostale();
		personne2.adresse.codePostal = 34000;
		personne2.adresse.libelleRue = "Rue des Gnocchis";
		personne2.adresse.numeroRue = 4784;
		personne2.adresse.ville= "Montpellier";
	}

}
