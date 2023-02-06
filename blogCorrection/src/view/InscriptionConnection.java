package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.UserDao;
import model.User;

public class InscriptionConnection extends JPanel {

	private JPanel contentPane;
	private JTextField nomField;
	private JTextField prenomField;
	private JTextField emailField;
	private JTextField passwordField;
	private JTextField emailFieldCo;
	private JPasswordField passwordFieldCo;
	
	/**
	 * Create the panel.
	 */
	public InscriptionConnection() {
		
		setBounds(0, 0, 816, 362);
		setLayout(null);
		
		JPanel duo = new JPanel();
		duo.setBounds(0, 0, 816, 362);
		add(duo);
		duo.setLayout(null);
		//duo.add(new inscription());
		//duo.add(new connection());
		
		JPanel inscription = new JPanel();
		inscription.setBounds(10, 11, 384, 340);
		add(inscription);
		inscription.setLayout(null);
		
		JLabel nom = new JLabel("Nom");
		nom.setHorizontalAlignment(SwingConstants.CENTER);
		nom.setFont(new Font("Tahoma", Font.BOLD, 15));
		nom.setBounds(30, 49, 97, 25);
		inscription.add(nom);
		
		JLabel prenom = new JLabel("Prenom");
		prenom.setHorizontalAlignment(SwingConstants.CENTER);
		prenom.setFont(new Font("Tahoma", Font.BOLD, 15));
		prenom.setBounds(30, 99, 97, 25);
		inscription.add(prenom);
		
		JLabel email = new JLabel("Email");
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setFont(new Font("Tahoma", Font.BOLD, 15));
		email.setBounds(30, 146, 97, 25);
		inscription.add(email);
		
		JLabel password = new JLabel("Password");
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setFont(new Font("Tahoma", Font.BOLD, 15));
		password.setBounds(30, 200, 97, 25);
		inscription.add(password);
		
		nomField = new JTextField();
		nomField.setBounds(173, 53, 154, 21);
		inscription.add(nomField);
		nomField.setColumns(10);
		
		prenomField = new JTextField();
		prenomField.setColumns(10);
		prenomField.setBounds(173, 103, 154, 21);
		inscription.add(prenomField);
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(173, 150, 154, 21);
		inscription.add(emailField);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(173, 204, 154, 21);
		inscription.add(passwordField);
		
		JButton btnInscription = new JButton("INSCRIPTION");
		btnInscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSTANCIER
				User user = new User(nomField.getText(),prenomField.getText(),emailField.getText(),passwordField.getText());
				//Create - INSERT dans la bdd
				UserDao userDao = new UserDao();
				
				if (userDao.isExist(email.getText())) {
					JOptionPane.showMessageDialog(null, email.getText()+" existe deja...");
				} else {
					if(userDao.create(user)) {
						JOptionPane.showMessageDialog(null,("Bravo, compte crée !"));
						
						//Redirection vers la page d'accueil
						inscription.removeAll();
						
					}
					else {
						JOptionPane.showMessageDialog(null,("Oups, le compte n'est pas crée..."));
					}
				}
			}
		});
		btnInscription.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnInscription.setBounds(67, 272, 245, 57);
		inscription.add(btnInscription);
		
		JLabel titreInscription = new JLabel("S'INSCRIRE");
		titreInscription.setFont(new Font("Tahoma", Font.BOLD, 16));
		titreInscription.setHorizontalAlignment(SwingConstants.CENTER);
		titreInscription.setBounds(55, 11, 272, 27);
		inscription.add(titreInscription);
		
		JPanel connection = new JPanel();
		connection.setBounds(414, 11, 392, 340);
		add(connection);
		connection.setLayout(null);
		
		JLabel emailCo = new JLabel("Email");
		emailCo.setHorizontalAlignment(SwingConstants.CENTER);
		emailCo.setFont(new Font("Tahoma", Font.BOLD, 15));
		emailCo.setBounds(59, 103, 97, 25);
		connection.add(emailCo);
		
		JLabel passwordCo = new JLabel("Password");
		passwordCo.setHorizontalAlignment(SwingConstants.CENTER);
		passwordCo.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordCo.setBounds(59, 157, 97, 25);
		connection.add(passwordCo);
		
		emailFieldCo = new JTextField();
		emailFieldCo.setColumns(10);
		emailFieldCo.setBounds(202, 107, 154, 21);
		connection.add(emailFieldCo);
		
		passwordFieldCo = new JPasswordField();
		passwordFieldCo.setColumns(10);
		passwordFieldCo.setBounds(202, 161, 154, 21);
		connection.add(passwordFieldCo);
		
		JButton btnConnection = new JButton("CONNECTION");
		btnConnection.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnConnection.setBounds(86, 272, 245, 57);
		connection.add(btnConnection);
		
		JLabel titreConnection = new JLabel("SE CONNECTER");
		titreConnection.setHorizontalAlignment(SwingConstants.CENTER);
		titreConnection.setFont(new Font("Tahoma", Font.BOLD, 16));
		titreConnection.setBounds(70, 11, 272, 27);
		connection.add(titreConnection);
		
	}

}
