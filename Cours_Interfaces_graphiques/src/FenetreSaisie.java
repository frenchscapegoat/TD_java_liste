import javax.swing.*;
public class FenetreSaisie {
    public static void main(String[] args) {
        // Creer une fenetre
        JFrame fenetre = new JFrame ("Saisie");
    
        // Lui donner sa taille
        fenetre.setSize (300, 100);
        // Lui dire de terminer le programme quand on clique sur la petite croix
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Créer un JPanel 
        JPanel p = new JPanel ();
        
        // Ajouter un label et un champ de texte
        JLabel l = new JLabel("Nom :");
        JTextField t = new JTextField (15); 

        // Ajouter les composants au panel
        p.add(l);
        p.add(t);
        
        // Ajouter le panel à la fenêtre
        fenetre.getContentPane().add(p);

        // Afficher la fenetre
        fenetre.setVisible(true);
    }
}
