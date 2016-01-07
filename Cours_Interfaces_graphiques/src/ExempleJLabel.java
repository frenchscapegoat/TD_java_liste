import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ExempleJLabel {

	public static void main(String[] args) {
		// Creer fenetre
	JFrame fenetre = new JFrame ("Swing");
	fenetre.setSize(600, 700);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	// Créer un JLabel
	JLabel label = new JLabel ("Du texte");
	
	// Ajouter une icone au label
	label.setIcon(new ImageIcon ("java.jpeg")); // il faut que l'iamge soit dans le meme dossier que eclipse
	
	
	// Changer le texte du label
	label.setText ("<html> Vive <b> JAVA </b> </html>");
	// Chaner l'alignement (default : Centre vertical)
	label.setVerticalTextPosition(SwingConstants.TOP);
	// Ajouter label dans un des conteneurs de la fenetre
	fenetre.getContentPane().add(label);
	// Afficher fenetre
	fenetre.setVisible(true);
	
	}

}
