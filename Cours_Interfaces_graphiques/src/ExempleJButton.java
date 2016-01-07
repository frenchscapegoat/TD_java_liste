import java.awt.*;
import javax.swing.*;
public class ExempleJButton {

    public static void main(String[] args) {
        // Creer une fenetre
        JFrame fenetre = new JFrame ("Swing");
        fenetre.setSize (300, 300);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        // Creer un JButton
        JButton b = new JButton ("LOLO");
            
        // Dire de changer l'icone quand le bouton est clique
        b.setPressedIcon(new ImageIcon ("java-design.jpeg"));
        
        // Changer le texte du label
        b.setText("<html>Choisir <p><b>Java</b> </html>"); 
        
        // Associer un raccourci clavier pour cliquer sur le bouton : Alt + n
        b.setMnemonic('n');
                
        // Changer le curseur quand la souris passe sur le bouton
        Cursor c = Cursor.getPredefinedCursor (Cursor.CROSSHAIR_CURSOR);
        b.setCursor (c);
        
        // Afficher une bulle d'aide quand la souris passe sur le bouton
        b.setToolTipText ("<html>Cliquez pour en savoir plus sur <p><b>Java</b></html>");
        
        // Specifier les couleurs du bouton
        b.setForeground(Color.blue); // ou new Color (int r, int g, int b);
        b.setBackground(new Color (200, 100, 0));
        b.setOpaque(true); // Pour que la couleur s'affiche par dessus celle du conteneur
        
        // Mettre une bordure
        //b.setBorder(BorderFactory.createLoweredBevelBorder());
        b.setBorder(BorderFactory.createTitledBorder("Partie JAVA"));
        
        // Ajouter le bouton dans un des conteneurs de la fenetre
        fenetre.getContentPane().add(b);
                
        // Afficher la fenetre
        fenetre.setVisible(true);

        // Afficher la taille actuelle du bouton dans la console
        Dimension d = b.getSize();
        System.out.println (d);
        
        // Afficher la taille preferee du bouton dans la console
        Dimension dp = b.getPreferredSize();
        System.out.println (dp);
    }
}
