import javax.swing.JFrame;

public class FenetreSimple {
	public static void main(String[] args){
		JFrame fenetre;
		fenetre = new JFrame ("Vive les amphis");
		
		// Fixe la taille à 300px * 300px
		fenetre.setSize(300, 300);
		
		//Terminer programme
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Afficher la fenetre
		fenetre.setVisible(true);
		
		// Possibilité de changer la taille de la fenetre
		fenetre.setResizable(false);
		
		// Affecter les coordonnées de la fenetre ; remplace le setSize
		fenetre.setBounds(120, 10, 400, 400);
		
	}
}
