package editeurgraphique;

public class TestDupont {
	public static void main (String args[]){
		
		// M Dupont cr�e un rectangle
		Rec unRectangle = new Rec();
		unRectangle.largeur=10;
		unRectangle.longueur=5;
		
		// M Dupont  appelle les methodes developpees par Pasquier
		
		// Il est oblige de passer par la methode afficherStats un objet instance d'une classe implementant la classe abstraite FormeGeometrique
		Editeur ed = new Editeur();
		ed.afficherStats(unRectangle);
		
		// Idem avec un cercle
	}
}