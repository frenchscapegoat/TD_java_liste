import javax.swing.*;

public class PanelSaisie extends JPanel{
    // Déclarer les composants du panel en tant  qu'attributs pour qu'ils soient accessibles par toutes les méthodes
    JLabel l ;
    JTextField t ; 
    
    PanelSaisie (String s) {
        // Créer les composants
        l = new JLabel (s);
        t = new JTextField (10); 
        
        // Ajouter les composants dans CE paneau : ceci est possible car ...
        add(l);
        add(t);
    }

    public static void main(String[] args) {
        // Creer une fenetre
    	JFrame fenetre = new JFrame ("Test de ma classe PanelSaisie");
        fenetre.setSize (400, 100);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creer une instance de ma classe
        PanelSaisie p = new PanelSaisie ("Nom");
        
        // Ajouter mon instance dans un des conteneurs de la fen?tre
        fenetre.getContentPane().add(p);
        
        // Afficher la fenetre
        fenetre.setVisible(true);
    }

}
