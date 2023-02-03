package vue;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.ArticleDao;
import model.User;

public class AjoutArticle extends JPanel {
	private JTextField titre;
	private JTextField resume;
	
	/**
	 * Create the panel.
	 */
	public AjoutArticle(User user) {
		setBounds(0, 0, 1149, 804);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 938, 731);
		add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel_3 = new JLabel("Compte: " +user.getPrenom() + " " +user.getNom());
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(660, 11, 444, 40);
		panel.add(lblNewLabel_3);
		
		JLabel ltitre = new JLabel("Titre");
		ltitre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		ltitre.setBounds(10, 89, 82, 37);
		panel.add(ltitre);
		
		JLabel lresume = new JLabel("R\u00E9sum\u00E9");
		lresume.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lresume.setBounds(527, 89, 82, 37);
		panel.add(lresume);
		
		JLabel lcontenu = new JLabel("Contenu");
		lcontenu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lcontenu.setBounds(23, 209, 82, 37);
		panel.add(lcontenu);
		
		titre = new JTextField();
		titre.setBounds(10, 123, 364, 61);
		panel.add(titre);
		titre.setColumns(10);
		
		resume = new JTextField();
		resume.setColumns(10);
		resume.setBounds(527, 123, 364, 61);
		panel.add(resume);
		
		JTextArea contenu = new JTextArea();
		contenu.setBounds(20, 240, 505, 134);
		panel.add(contenu);
		
		JButton ajoutPost = new JButton("Ajouter");
		ajoutPost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(titre.getText().equals("") || resume.getText().equals("") || contenu.equals("")) {
					JOptionPane.showMessageDialog(ajoutPost, "Veuillez remplir les champs");
				}else {
					/*
					 * Recuperation des saisis(titre,resume et contenu)
					 */
					//String titre_saisi = titre.getText(); 
					model.Article article = new model.Article (titre.getText(), resume.getText(),contenu.getText(),user);
					ArticleDao articleDao = new ArticleDao();
					
					
					
					if (articleDao.create(article)) {
						
						JOptionPane.showMessageDialog(null,"BRAVO","Insertion OK",JOptionPane.INFORMATION_MESSAGE);
						Accueil ac = new Accueil();
						
						ac.dispose();
						Accueil list = new Accueil();
						list.setVisible(true);
						/*
						panel.removeAll();
						panel.add(new Accueil());
						panel.repaint();
						panel.revalidate();*/
						
						//retour automatique liste articles
					
						
					} else {
						JOptionPane.showMessageDialog(null,"OUPS","Insertion KO",JOptionPane.ERROR_MESSAGE);

					}
					
				}
			}
		});
		ajoutPost.setBounds(436, 416, 247, 42);
		panel.add(ajoutPost);
		

	}

	

}
