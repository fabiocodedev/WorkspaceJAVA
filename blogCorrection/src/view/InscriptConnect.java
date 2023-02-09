package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import controller.UserDao;
import model.User;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InscriptConnect extends JPanel {
	private JTextField nomField;
	private JTextField prenomField;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JTextField emailFieldCo;
	private JPasswordField passwordFieldCo;

	/**
	 * Create the panel.
	 */
	public InscriptConnect() {
		setLayout(null);
		setBounds(0, 0, 816, 362);
		
		JPanel InscriptionConnection = new JPanel();
		InscriptionConnection.setBounds(0, 0, 816, 362);
		add(InscriptionConnection);
		InscriptionConnection.setLayout(null);
		
		JPanel Inscript = new JPanel();
		Inscript.setBounds(10, 11, 384, 340);
		InscriptionConnection.add(Inscript);
		Inscript.setLayout(null);
		
		JLabel titreInscript = new JLabel("INSCRIPTION");
		titreInscript.setFont(new Font("Tahoma", Font.BOLD, 20));
		titreInscript.setHorizontalAlignment(SwingConstants.CENTER);
		titreInscript.setBounds(99, 11, 167, 27);
		Inscript.add(titreInscript);
		
		JLabel nom = new JLabel("Nom");
		nom.setHorizontalAlignment(SwingConstants.CENTER);
		nom.setBounds(66, 79, 85, 14);
		Inscript.add(nom);
		
		JLabel prenom = new JLabel("Prenom");
		prenom.setHorizontalAlignment(SwingConstants.CENTER);
		prenom.setBounds(66, 118, 85, 14);
		Inscript.add(prenom);
		
		JLabel email = new JLabel("Email");
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setBounds(66, 157, 85, 14);
		Inscript.add(email);
		
		JLabel password = new JLabel("Password");
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setBounds(66, 202, 85, 14);
		Inscript.add(password);
		
		nomField = new JTextField();
		nomField.setBounds(232, 76, 96, 20);
		Inscript.add(nomField);
		nomField.setColumns(10);
		
		prenomField = new JTextField();
		prenomField.setColumns(10);
		prenomField.setBounds(232, 115, 96, 20);
		Inscript.add(prenomField);
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(232, 154, 96, 20);
		Inscript.add(emailField);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(232, 199, 96, 20);
		Inscript.add(passwordField);
		
		JButton btnInscription = new JButton("INSCRIPTION");
		btnInscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSTANCIER
				User user = new User(nomField.getText(),prenomField.getText(),emailField.getText(),passwordField.getText());
				//Create - INSERT dans la bdd
				UserDao userDao = new UserDao();
				
				if (userDao.isExist(emailField.getText())) {
					JOptionPane.showMessageDialog(null, emailField.getText()+" existe deja...");
				} else {
					if(userDao.create(user)) {
						JOptionPane.showMessageDialog(null,("Bravo, compte crée !"));
						
						//Redirection vers la page d'accueil
						InscriptionConnection.removeAll();
						InscriptionConnection.add(new Accueil());
						
						InscriptionConnection.repaint();
						InscriptionConnection.revalidate();
						
					}
					else {
						JOptionPane.showMessageDialog(null,("Oups, le compte n'est pas crée..."));
					}
				}
			}
		});
		btnInscription.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnInscription.setBounds(93, 252, 216, 48);
		Inscript.add(btnInscription);
		
		JPanel Connect = new JPanel();
		Connect.setBounds(414, 11, 392, 340);
		InscriptionConnection.add(Connect);
		Connect.setLayout(null);
		
		JLabel emailCo = new JLabel("Email");
		emailCo.setHorizontalAlignment(SwingConstants.CENTER);
		emailCo.setBounds(80, 118, 85, 14);
		Connect.add(emailCo);
		
		JLabel passwordCo = new JLabel("Password");
		passwordCo.setHorizontalAlignment(SwingConstants.CENTER);
		passwordCo.setBounds(80, 163, 85, 14);
		Connect.add(passwordCo);
		
		emailFieldCo = new JTextField();
		emailFieldCo.setColumns(10);
		emailFieldCo.setBounds(246, 115, 96, 20);
		Connect.add(emailFieldCo);
		
		passwordFieldCo = new JPasswordField();
		passwordFieldCo.setColumns(10);
		passwordFieldCo.setBounds(246, 160, 96, 20);
		Connect.add(passwordFieldCo);
		
		JButton btnConnection = new JButton("CONNECTION");
		btnConnection.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnConnection.setBounds(109, 255, 216, 48);
		Connect.add(btnConnection);
		
		JLabel titreConnect = new JLabel("CONNECTION");
		titreConnect.setHorizontalAlignment(SwingConstants.CENTER);
		titreConnect.setFont(new Font("Tahoma", Font.BOLD, 20));
		titreConnect.setBounds(115, 11, 167, 27);
		Connect.add(titreConnect);

	}
}
