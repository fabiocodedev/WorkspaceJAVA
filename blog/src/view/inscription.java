package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.UserController;
import model.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class inscription extends JFrame {

	private JPanel panelBase;
	private JTextField nomValue;
	private JTextField prenomValue;
	private JTextField emailValue;
	private JTextField telValue;
	private JPasswordField passwordValue;
	private JTextField emailCoValue;
	private JPasswordField passwordCoValue;

	
	UserController userDAO = new UserController();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inscription frame = new inscription();
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
	public inscription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		panelBase = new JPanel();
		panelBase.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelBase);
		panelBase.setBounds(100, 100, 590, 490);
		panelBase.setLayout(null);
		
		JPanel pannelCo = new JPanel();
		pannelCo.setBackground(new Color(30, 144, 255));
		pannelCo.setBounds(6, 6, 282, 451);
		panelBase.add(pannelCo);
		pannelCo.setLayout(null);
		
		JLabel titre1 = new JLabel("Connection");
		titre1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		titre1.setBounds(49, 22, 178, 52);
		pannelCo.add(titre1);
		
		JLabel pwdCo = new JLabel("Password");
		pwdCo.setBounds(50, 224, 64, 16);
		pannelCo.add(pwdCo);
		
		JLabel emailCo = new JLabel("Email");
		emailCo.setBounds(50, 166, 53, 16);
		pannelCo.add(emailCo);
		
		emailCoValue = new JTextField();
		emailCoValue.setBounds(143, 160, 102, 28);
		pannelCo.add(emailCoValue);
		emailCoValue.setColumns(10);
		
		passwordCoValue = new JPasswordField();
		passwordCoValue.setBounds(143, 218, 102, 28);
		pannelCo.add(passwordCoValue);
		
		
		//Evenement sur le bouton connection
		JButton btnCo = new JButton("CONNECTION");
		btnCo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				User us = userDAO.connectionUser(emailCoValue.getText(),String.valueOf(passwordCoValue.getPassword()));
				if(us != null) {
					System.out.println(us.getEmail());
					System.out.println(us.getNom());
					JOptionPane.showMessageDialog(null,"BRAVO","Connection",JOptionPane.INFORMATION_MESSAGE);
					
					//dispose(); //Ferme tout le frame
					panelBase.removeAll(); //Supprime le content pane mais laisse le frame !
					panelBase.add(new PaddArticle(us));
					
					panelBase.repaint(); //Supprime le content pane et le relance - MAJ !
					panelBase.revalidate();
					

				}else {
					System.out.println("KO");
					JOptionPane.showMessageDialog(null,"Oups !","Mauvais email ou pwd...",JOptionPane.ERROR_MESSAGE);					
				}
				
			}
		});
		btnCo.setFont(new Font("SansSerif", Font.BOLD, 16));
		btnCo.setVerticalTextPosition(SwingConstants.TOP);
		btnCo.setBounds(49, 360, 196, 58);
		pannelCo.add(btnCo);
		
		JPanel panelInscription = new JPanel();
		panelInscription.setBackground(new Color(147, 112, 219));
		panelInscription.setBounds(300, 6, 280, 451);
		panelBase.add(panelInscription);
		panelInscription.setLayout(null);
		
		JLabel titre2 = new JLabel("Inscription");
		titre2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		titre2.setBounds(43, 31, 194, 43);
		panelInscription.add(titre2);
		
		JLabel nom = new JLabel("Nom");
		nom.setBounds(43, 134, 49, 14);
		panelInscription.add(nom);
		
		JLabel prenom = new JLabel("Prenom");
		prenom.setBounds(43, 166, 49, 14);
		panelInscription.add(prenom);
		
		JLabel email = new JLabel("Email");
		email.setBounds(43, 198, 49, 14);
		panelInscription.add(email);
		
		JLabel password = new JLabel("Password");
		password.setBounds(43, 230, 63, 14);
		panelInscription.add(password);
		
		JLabel tel = new JLabel("Tel");
		tel.setBounds(43, 262, 49, 14);
		panelInscription.add(tel);
		
		nomValue = new JTextField();
		nomValue.setBounds(141, 131, 96, 20);
		panelInscription.add(nomValue);
		nomValue.setColumns(10);
		
		prenomValue = new JTextField();
		prenomValue.setColumns(10);
		prenomValue.setBounds(141, 163, 96, 20);
		panelInscription.add(prenomValue);
		
		emailValue = new JTextField();
		
		
		
		
		emailValue.setColumns(10);
		emailValue.setBounds(141, 195, 96, 20);
		panelInscription.add(emailValue);
		
		telValue = new JTextField();
		telValue.setColumns(10);
		telValue.setBounds(141, 259, 96, 20);
		panelInscription.add(telValue);
		
		passwordValue = new JPasswordField();
		passwordValue.setBounds(141, 227, 96, 20);
		panelInscription.add(passwordValue);
		
		// Evenement du boutton --------------------------------------------------------------------------
		JButton btnSubmit = new JButton("Je crée mon compte !");
		btnSubmit.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User user1 = new User(nomValue.getText(),prenomValue.getText(),emailValue.getText(),String.valueOf(passwordValue.getPassword()),Integer.parseInt(telValue.getText()));
				
				UserController userDAO = new UserController();
				
				//Creee un user en bdd sans aucun check
				//userDAO.create(user1);
				
				String regex = "^[A-Za-z0-9][A-Za-z0-9.-]+[A-Za-z0-9][@][A-Za-z0-9][A-Za-z0-9.-]+[A-Za-z0-9]?[.][A-Za-z0-9]{2,3}$";
				Pattern patternVerif = Pattern.compile(regex);
			
				
				//if (userDAO.isValid(emailValue.getText())) {
				

				
				//Check si le mail match avec la regex
				if (patternVerif.matcher(emailValue.getText()).matches()) {
					JOptionPane.showMessageDialog(null,"Check mail","Mail regex OK !",JOptionPane.INFORMATION_MESSAGE);
					//Check si le mail existe dans la BDD
					if (userDAO.isExist(emailValue.getText())) { 
						JOptionPane.showMessageDialog(null,"Oups","Mail existe deja...",JOptionPane.ERROR_MESSAGE);
					} else { 
					    //Cree l'user1 et envoi un msg bravo !
						if (userDAO.create(user1)) {
							JOptionPane.showMessageDialog(null,"Bravo","Inscrit !",JOptionPane.INFORMATION_MESSAGE);
						} else {
							//Si pas de creation, msg NOK
							JOptionPane.showMessageDialog(null,"Oups","Pas inscrit...",JOptionPane.ERROR_MESSAGE);
						}
					}
				} else {
					//MSG si mauvais format mail
					JOptionPane.showMessageDialog(null,"Oups","Mauvais format email...",JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		btnSubmit.setBounds(36, 355, 217, 71);
		panelInscription.add(btnSubmit);
	}
}


