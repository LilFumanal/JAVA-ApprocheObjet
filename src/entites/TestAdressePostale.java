package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adresse1 = new AdressePostale();
		adresse1.codePostal=34070;
		adresse1.numeroRue=5;
		adresse1.libelleRue="rue des Artichauts";
		adresse1.ville="Montpellier";
		
		AdressePostale adresse2 = new AdressePostale();
		adresse2.codePostal=34190;
		adresse2.numeroRue=4684;
		adresse2.libelleRue="rue des Crevettes";
		adresse2.ville="Castelnau-Le-Lez";
	}

}
