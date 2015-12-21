package editeurgraphique;
import java.awt.*;

public class Editeur {
	public void afficherStats (FormeGeometrique f){
		// Déclarer une référence vers une fenetre indépendante
		Frame frame;
		
		// Creer un objet de type fenetre indépendante
		frame = new Frame ("Statistiuqes sur une forme graphique");
		
		// Délcarer une référence vers une étiquette
		Label labelNom;
		
		// Créer ybe etiquette avec toutes les informations sur la forme
		String classe = f.getClass().getName();
		
		labelNom = new Label (classe +" , x = " +f.getX()+ " , y = " +f.getY()+" , Surface = " +f.surface() +" ,Périmètre = " +f.perimetre());
		
		// Ajouter l'étiquette dans la frame
		frame.add(labelNom);
		
		// Fixer la taille de la fenetre
		frame.setSize(300,200);
		
		// Afficher la fenetre 
		frame.setVisible(true);
	}
}
