import javax.swing.JFrame;
import javax.swing.JPanel;

public class SaisieMultiple {
    public static void main(String[] args) {
        // Creer une fenetre
        JFrame fenetre = new JFrame ("Création de plusieurs instances de PanelSaisie");
        fenetre.setSize (500, 100);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creer des instances PanelSaisie
        PanelSaisie pn = new PanelSaisie ("Nom : ");
        PanelSaisie pp = new PanelSaisie ("Prenom : ");
        
        // Les regrouper dans un 3ème JPanel
        JPanel panelGlobal = new JPanel();
        panelGlobal.add(pn);
        panelGlobal.add(pp);
        
        // Ajouter mon instance dans un des conteneurs de la fen?tre
        fenetre.getContentPane().add(panelGlobal);
        
        // Afficher la fenetre
        fenetre.setVisible(true);    }
}