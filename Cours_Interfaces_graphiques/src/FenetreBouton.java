import javax.swing.JButton;
import javax.swing.JFrame;

public class FenetreBouton {

	public static void main(String[] args) {

		// Creer une fenetre
		JFrame fenetre = new JFrame ("le soleil brille");
		fenetre.setSize(400, 400);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// cr�er un bouton
		JButton bouton = new JButton("Bonjour !");
		
		// Ajouter � la fenetre
		fenetre.add(bouton); // Ou fenetre.getContentPane().add(bouton);
		
		// Afficher la fenetre
		fenetre.setVisible(true);
	}

}
