package editeurgraphique;

public class Rec extends FormeGeometrique{
	double longueur;
	double largeur;
	@Override
	double perimetre() {
		double p=longueur*2+largeur*2;// TODO Auto-generated method stub
		return p;
	}

	@Override
	double surface() {
		double s=longueur*largeur;
		// TODO Auto-generated method stub
		return s;
	}

}