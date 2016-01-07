import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculPerimetre {
	
    JLabel resulat = new JLabel("Résulat :");
    JLabel calculResulat = new JLabel("0");
    
    // Creer une fenetre
    JFrame fenetre = new JFrame ("Calcul Perimetre");
    // Mettre dans constructeur !
    fenetre.setSize (500, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Creer des instances PanelSaisie
    PanelSaisie plong = new PanelSaisie ("Longueur : ");
    PanelSaisie plarg = new PanelSaisie ("Largeur : ");
    
    // Les regrouper dans un 3ème JPanel
    JPanel panelGlobal = new JPanel();
    panelGlobal.add(plong);
    panelGlobal.add(plarg);
    
    JPanel presul = new JPanel();

    // Ajouter mon instance dans un des conteneurs de la fen?tre
    fenetre.getContentPane().add(panelGlobal);
    
    // Afficher la fenetre
    fenetre.setVisible(true);    }
	public static void main(String[] args) {

}
