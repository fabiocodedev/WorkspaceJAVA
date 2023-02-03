package vue;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.UserDao;
import model.User;

public class Acces extends JPanel {

	private JPanel contentPane;
	private JTextField nom_saisi;
	private JTextField prenom_saisi;
	private JTextField email_saisi;
	private JPasswordField pwd_saisi;
	private JTextField email_log;
	private JPasswordField pwd_log;
	
	
	UserDao userDao = new UserDao();
	/**
	 * Create the panel.
	 */
	public Acces() {
		setBounds(0, 0, 1149, 804);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1139, 804);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(53, 42, 473, 631);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Connection");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 440, 60);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(22, 169, 123, 40);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mot de passe");
		lblNewLabel_2_1.setBounds(22, 273, 123, 40);
		panel_1.add(lblNewLabel_2_1);
		
		email_log = new JTextField();
		email_log.setBounds(188, 153, 238, 40);
		panel_1.add(email_log);
		email_log.setColumns(10);
		
		pwd_log = new JPasswordField();
		pwd_log.setColumns(10);
		pwd_log.setBounds(188, 251, 238, 40);
		panel_1.add(pwd_log);
		
		JButton btnNewButton = new JButton("Je me connecte");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User us = userDao.connection(email_log.getText(),String.valueOf(pwd_log.getPassword()));
				if(us != null) {
					JOptionPane.showMessageDialog(null,"BRAVO","Inscription",JOptionPane.INFORMATION_MESSAGE);
					
					/*contentPane.removeAll();
					
					 * Recuperation du User connecté
					 *
					
					
					/* OPTION 1 - FERMER LE FRAME POUR EN CREER un autre
					dispose();
					Test frame = new Test();
					frame.setVisible(true);*/
					
					
					
					/*
					 * Supprimer tous les composants du contentPane
					 * puis rajouter un nouveau panel
					 */
					System.out.println("--saazazazazazz-----------" + UserDao.currentUser);
											
					panel.removeAll();
					//contentPane.add(new Article(us));
					panel.add(new AjoutArticle(us));
					panel.repaint();
					panel.revalidate();
					
					
				}else {
					System.out.println("KO");
					JOptionPane.showMessageDialog(null,"Oups ! \n Mail existe deja","Inscription",JOptionPane.ERROR_MESSAGE);					
				}
				
				
				
				/*if (userDao.isExist(email_saisi.getText())) {
					JOptionPane.showMessageDialog(null,"Oups ! \n Mail existe deja","Inscription",JOptionPane.ERROR_MESSAGE);	
				}else {
				}*/
				
			}
		});
		btnNewButton.setBounds(77, 396, 321, 60);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(536, 42, 569, 631);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblInscription = new JLabel("Inscription");
		lblInscription.setHorizontalAlignment(SwingConstants.CENTER);
		lblInscription.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblInscription.setBounds(10, 11, 453, 60);
		panel_2.add(lblInscription);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(27, 157, 144, 38);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Prénom");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(27, 229, 144, 38);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBounds(27, 317, 144, 38);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Mot de passe");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setBounds(27, 407, 144, 38);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		nom_saisi = new JTextField();
		nom_saisi.setBounds(181, 145, 284, 38);
		panel_2.add(nom_saisi);
		nom_saisi.setColumns(10);
		
		prenom_saisi = new JTextField();
		prenom_saisi.setColumns(10);
		prenom_saisi.setBounds(179, 213, 284, 38);
		panel_2.add(prenom_saisi);
		
		email_saisi = new JTextField();
		email_saisi.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("Focuced");
			}
		});
		email_saisi.setColumns(10);
		email_saisi.setBounds(181, 298, 284, 38);
		panel_2.add(email_saisi);
		
		pwd_saisi = new JPasswordField();
		pwd_saisi.setColumns(10);
		pwd_saisi.setBounds(181, 392, 284, 38);
		panel_2.add(pwd_saisi);
		
		JButton submit = new JButton("Je crée mon compte !");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				/*
				 * Parser en INT -- Forcer(Caster) une chaine en Integer(nombre)
				 * Integer.parseInt(tel_saisi.getText());
				 */
				
				/*
				 * TODO: .LES ETAPES A REALISER
				 * 	1- regex de verif mail -- Pattern Ex: chaine@chaine.chaine
				 * 		FORMAT ATTENDU: exemple@mail.com
				 *  2- If exist (check if mail exist) dans la base de données afin de garantir unicité !
				 */
				//REGEX pour le mail: ^[A-Za-z0-9][A-Za-z0-9.-]+[A-Za-z0-9][@][A-Za-z0-9][A-Za-z0-9.-]+[A-Za-z0-9][.][A-Za-z0-9]{2,3}$
				//REGEX pour le PWD: Pattern.compile("^(?=.?[A-Z])(?=.?[a-z])(?=.?[0-9])(?=.?[#?!@$%^&*-]).{8,}$");
				String regex = "^[A-Za-z0-9][A-Za-z0-9.-]+[A-Za-z0-9][@][A-Za-z0-9][A-Za-z0-9.-]+[A-Za-z0-9][.][A-Za-z0-9]{2,3}$";
				Pattern patternAVerif = Pattern.compile(regex);
				
				/*
				 * Check si le regex(Ligne 148) a le mm FORMAT que le mail saisi par le user 
				 * Exmple: format@mail.com --- chaine@chaine.com/fr
				 */
				Matcher matcher = patternAVerif.matcher(email_saisi.getText());
				
				/*
				 * Check le format du mail saisi 
				 */
				// Si le format match avec chaine@chaine.fr/com
				if (matcher.matches()) {
					User user = new User(nom_saisi.getText(),prenom_saisi.getText(),email_saisi.getText(),String.valueOf(pwd_saisi.getPassword()));
					
					
					
					/*
					 * Verification si le mail exite deja
					 */
					if (userDao.isExist(email_saisi.getText())) {
						JOptionPane.showMessageDialog(null,"Oups ! \n Mail existe deja","Inscription",JOptionPane.ERROR_MESSAGE);	
					} 
					//Sinon (Ligne 175) qui va avec le if de isExist ==> Ligne 171
					else {
						/*
						 * Si le mail n'existe pas dans la BDD, on crée le user - Ligne 174
						 */
						if (userDao.create(user)) {
							JOptionPane.showMessageDialog(null,"Bravo " +user.getPrenom()+ " \n"
									+ "ton compte a été bien créé !" ,"Inscription",JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null,"Oups ! \n Compte pas créer","Inscription",JOptionPane.ERROR_MESSAGE);
						}
					}
				} 
				// Le else ci-dessous est pour le regex: Ligne 158
				else {
					JOptionPane.showMessageDialog(null,"Oups ! \n Format non valide","Inscription",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		submit.setBounds(90, 484, 330, 60);
		panel_2.add(submit);
		
		
		
		
		
	}
}
