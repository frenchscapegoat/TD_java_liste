import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class PanelSaisieBouton extends PanelSaisie {
	// Rajouter un composant
    JButton b ;
    
    PanelSaisieBouton(String s) {
        super (s);
        
        // Creer le bouton
        b = new JButton ("Valider");
        
        // Ajouter le bouton dans CE panel : ceci est possible car PanelSaisieBouton hérite de PanelSaisie 
        // qui hérite elle-même de Panel
        add (b);
    }

    public static void main(String[] args) {
        // Creer une fenetre
        JFrame fenetre = new JFrame ("Test de ma classe PanelSaisieBouton");
        fenetre.setSize (500, 100);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creer une instance de ma classe
        PanelSaisieBouton p = new PanelSaisieBouton ("Identifiant");
        
        // Ajouter mon instance dans un des conteneurs de la fen?tre
        fenetre.getContentPane().add(p);
        
        JProgressBar a = new JProgressBar();
        a.setSize(200, 10);
        fenetre.getContentPane().add(a);
        
        // Afficher la fenetre
        fenetre.setVisible(true);
    }
}

