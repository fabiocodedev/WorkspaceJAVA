package swingBase;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import java.awt.Canvas;

public class Frame1 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField emailValue;
	private JTextField prenomValue;
	private JTextField nomValue;
	private JPasswordField passwordValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 50, 793, 414);
		getContentPane().setLayout(null);
		
		JPanel main = new JPanel();
		main.setBackground(new Color(255, 0, 0));
		main.setBounds(0, 0, 295, 379); // X,Y,largeur,hauteur, gere la position + la taille
		getContentPane().add(main);
		main.setLayout(null);
		
		JLabel img = new JLabel("New label");
		img.setIcon(new ImageIcon("C:\\Users\\bourg\\OneDrive\\Bureau\\WorkspaceJAVA\\swing\\src\\HomerCulNu.png"));
		img.setBounds(47, 66, 184, 252);
		main.add(img);
		
		JPanel header = new JPanel();
		header.setBackground(new Color(154, 205, 50));
		header.setBounds(293, 0, 489, 135);
		getContentPane().add(header);
		header.setLayout(null);
		
		JLabel titre = new JLabel("INTERFACE GRAPHIQUE");
		titre.setForeground(new Color(255, 0, 0));
		titre.setFont(new Font("Tahoma", Font.BOLD, 25));
		titre.setBounds(64, 25, 351, 81);
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		header.add(titre);
		
		JPanel formulaire = new JPanel();
		formulaire.setBackground(new Color(255, 228, 196));
		formulaire.setBounds(293, 136, 489, 243);
		getContentPane().add(formulaire);
		formulaire.setLayout(null);
		
		JLabel email = new JLabel("EMAIL :");
		email.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setBounds(132, 98, 79, 23);
		formulaire.add(email);
		
		JLabel password = new JLabel("PASSWORD :");
		password.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setBounds(115, 132, 96, 23);
		formulaire.add(password);
		
		emailValue = new JTextField();
		emailValue.setBounds(260, 99, 96, 20);
		formulaire.add(emailValue);
		emailValue.setColumns(10);
		
		JButton btnConnection = new JButton("CONNECTION !");
		btnConnection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.err.println(nomValue.getText());
				System.err.println(prenomValue.getText());
				System.err.println(emailValue.getText());
				//System.err.println(passwordValue.getText());
				// POPUP AFFICHAGE ------------------------------------------------------------------------------------------
				JOptionPane.showMessageDialog(null,"INFO TEST","Information", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null,"WARNING TEST","Warning", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showConfirmDialog(null,"CONFIRM TEST","Continuer ?", JOptionPane.YES_NO_CANCEL_OPTION);
				int reponse = JOptionPane.showConfirmDialog(null,"CONFIRM TEST","Continuer ?", JOptionPane.YES_NO_OPTION);
				System.err.println(reponse);
				String nom = JOptionPane.showInputDialog(null,"Entrez votre nom");
				System.err.println(nom);
			}
		});
		btnConnection.setBackground(new Color(30, 144, 255));
		btnConnection.setForeground(new Color(138, 43, 226));
		btnConnection.setFont(new Font("Rockwell", Font.BOLD, 22));
		btnConnection.setBounds(115, 166, 253, 66);
		formulaire.add(btnConnection);
		
		
		
		prenomValue = new JTextField();
		prenomValue.setColumns(10);
		prenomValue.setBounds(260, 65, 96, 20);
		formulaire.add(prenomValue);
		
		nomValue = new JTextField();
		nomValue.setColumns(10);
		nomValue.setBounds(260, 31, 96, 20);
		formulaire.add(nomValue);
		
		JLabel prenom = new JLabel("PRENOM :");
		prenom.setHorizontalAlignment(SwingConstants.CENTER);
		prenom.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		prenom.setBounds(132, 64, 79, 23);
		formulaire.add(prenom);
		
		JLabel nom = new JLabel("NOM :");
		nom.setHorizontalAlignment(SwingConstants.CENTER);
		nom.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 15));
		nom.setBounds(132, 30, 79, 23);
		formulaire.add(nom);
		
		passwordValue = new JPasswordField();
		passwordValue.setBounds(260, 129, 96, 23);
		formulaire.add(passwordValue);
	}
}
