package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class InscriptConnect extends JPanel {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_3;
	private JPasswordField passwordField_1;
	
	/**
	 * Create the panel.
	 */
	public InscriptConnect() {
		setBounds(0, 0, 816, 362);
		//setLayout(null);
		
		JPanel duo = new JPanel();
		//duo.setBounds(0, 0, 816, 362);
		add(duo);
		duo.setLayout(null);
		
		
		
		
		JPanel inscription = new JPanel();
		inscription.setBounds(10, 11, 384, 340);
		inscription.setLayout(null);
		duo.add(inscription);
		
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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(173, 53, 154, 21);
		inscription.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(173, 103, 154, 21);
		inscription.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(173, 150, 154, 21);
		inscription.add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(173, 204, 154, 21);
		inscription.add(passwordField);
		
		JButton btnInscription = new JButton("INSCRIPTION");
		btnInscription.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnInscription.setBounds(67, 272, 245, 57);
		inscription.add(btnInscription);
		
		JLabel titreInscription = new JLabel("S'INSCRIRE");
		titreInscription.setHorizontalAlignment(SwingConstants.CENTER);
		titreInscription.setFont(new Font("Tahoma", Font.BOLD, 16));
		titreInscription.setBounds(55, 11, 272, 27);
		inscription.add(titreInscription);
		
		JPanel connection = new JPanel();
		connection.setBounds(0, 0, 392, 340);
		connection.setLayout(null);
		duo.add(connection);
		
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
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(202, 107, 154, 21);
		connection.add(textField_3);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setColumns(10);
		passwordField_1.setBounds(202, 161, 154, 21);
		connection.add(passwordField_1);
		
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
