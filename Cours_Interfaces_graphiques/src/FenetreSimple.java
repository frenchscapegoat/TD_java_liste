import javax.swing.JFrame;

public class FenetreSimple {
	public static void main(String[] args){
		JFrame fenetre;
		fenetre = new JFrame ("Vive les amphis");
		
		// Fixe la taille � 300px * 300px
		fenetre.setSize(300, 300);
		
		//Terminer programme
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Afficher la fenetre
		fenetre.setVisible(true);
		
		// Possibilit� de changer la taille de la fenetre
		fenetre.setResizable(false);
		
		// Affecter les coordonn�es de la fenetre ; remplace le setSize
		fenetre.setBounds(120, 10, 400, 400);
		
	}
}
