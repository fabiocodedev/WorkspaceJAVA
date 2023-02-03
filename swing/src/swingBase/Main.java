/**
 * 
 */
package swingBase;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JWindow;

/**
 * @author fabio
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("OK");
		//Instancier un JFrame + import
		//Cree un container -------------------------------------------------------------------
		JFrame frame1 = new JFrame("Desktop 1");
		//Ne stop pas le process a la fermeture de la fenetre !
		//frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Stop le process a la fermeture de la fenetre !
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Resize le container, a faire avant le setLocationRelativeTo !
		frame1.setSize(500, 500);	
		//Perturbe le flux et met la fenetre au milieu
		frame1.setLocationRelativeTo(null);
		
		
		//Cree un Jpanel (= div de contenue du frame) -------------------------------------------------------------------
		JPanel panel = new JPanel();
		//Mettre de la couleur
		panel.setBackground(Color.red);
		//Ajouter le panel au frame pour l'afficher
		frame1.getContentPane().add(panel);
		
		//Cree des composants -------------------------------------------------------------------
		// tous les composant sont a ajouter au panel pour etre afficher dans le frame 
		//Cree un label (du text)
		JLabel label = new JLabel("Je suis le label !");
		//Ajouter le label au panel
		panel.add(label);		
		
		//Cree un bouton
		JButton bouton1 = new JButton("Connection");
		//Ajouter le bouton au panel
		panel.add(bouton1);
		
		//Cree une zone texte
		JTextField text1 = new JTextField("exemple");
		//Ajouter le bouton au panel
		panel.add(text1);
		
		//Cree une zone password
		JPasswordField pwd = new JPasswordField("mdp");
		//Ajouter le bouton au panel
		panel.add(pwd);
		
		
		
//		//JWindow
//		JWindow jw = new JWindow();
//		jw.setVisible(true);
//		jw.setSize(300,200);
//		
//		try { 
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {}
// 
//		System.exit(0);
		
		//JDialogue
		JDialog jd = new JDialog();
		jd.setVisible(true);
		jd.setSize(300,200);
		jd.setTitle("Première fenêtre"); //On lui donne un titre
		
		
		
		
		
		
		
		
		
		//Demander a ce que le frame soit visible
		frame1.setVisible(true);
		
	}

}
