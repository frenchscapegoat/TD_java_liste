
public class CabinetAssurance {
	final int NB_MAX = 10;
	
	Voiture [] tabVoitures;
	int nbVoitures;
	
	// Je cr�e un constructeur de tabVoitures !!
	CabinetAssurance (){
		tabVoitures = new Voiture [NB_MAX];
	}
	
	void  ajouterVoiture (Voiture v1) {
		tabVoitures[nbVoitures] = v1;
		nbVoitures++;
	}
	
	public static void main(String[] args) {
		CabinetAssurance macif = new CabinetAssurance();
		
		Voiture durand = new Voiture();
		durand.annee = 1999;
		
		macif.ajouterVoiture(durand);
	}

}
