package view;

import javax.swing.JPanel;

import model.Article;
import model.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;

import controller.ArticleController;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class PaddArticle extends JPanel {
	private JTextField fieldTitre;
	private JTextField fieldResume;

	/**
	 * Create the panel.
	 */
	public PaddArticle(User user) {
		setLayout(null);
		setBounds(0, 0, 600, 500);
		JPanel panelCo = new JPanel();
		panelCo.setBackground(new Color(100, 149, 237));
		panelCo.setBounds(5, 5, 590, 490);
		add(panelCo);
		panelCo.setLayout(null);
		
		
		//Affiche dans le label les infos (prenom, nom)de l'user qui vien de se connecter
		JLabel labelCo = new JLabel("Bienvenue " + user.getPrenom() + " " + user.getNom() );
		labelCo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelCo.setHorizontalAlignment(SwingConstants.CENTER);
		labelCo.setBounds(172, 30, 380, 50);
		panelCo.add(labelCo);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panelCo.removeAll(); //Supprime le content pane mais laisse le frame !
				panelCo.add(new inscription());
				
				panelCo.repaint(); //Supprime le content pane et le relance - MAJ !
				panelCo.revalidate();
				
			}
		});
		btnHome.setBackground(new Color(255, 0, 0));
		btnHome.setForeground(new Color(0, 0, 0));
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnHome.setBounds(43, 39, 104, 32);
		panelCo.add(btnHome);
		
		JPanel formArticle = new JPanel();
		formArticle.setBackground(new Color(255, 127, 80));
		formArticle.setBounds(17, 92, 566, 387);
		panelCo.add(formArticle);
		formArticle.setLayout(null);
		
		JLabel titrePanel = new JLabel("AJOUTER UN ARTICLE");
		titrePanel.setFont(new Font("SansSerif", Font.BOLD, 20));
		titrePanel.setHorizontalAlignment(SwingConstants.CENTER);
		titrePanel.setBounds(159, 18, 259, 26);
		formArticle.add(titrePanel);
		
		JLabel titre = new JLabel("Titre");
		titre.setFont(new Font("SansSerif", Font.BOLD, 15));
		titre.setBounds(59, 101, 87, 16);
		formArticle.add(titre);
		
		JLabel resume = new JLabel("Résumé");
		resume.setFont(new Font("SansSerif", Font.BOLD, 15));
		resume.setBounds(59, 156, 87, 16);
		formArticle.add(resume);
		
		JLabel contenu = new JLabel("Contenu");
		contenu.setFont(new Font("SansSerif", Font.BOLD, 15));
		contenu.setBounds(59, 225, 87, 16);
		formArticle.add(contenu);
		
		fieldTitre = new JTextField();
		fieldTitre.setBounds(186, 89, 340, 28);
		formArticle.add(fieldTitre);
		fieldTitre.setColumns(10);
		
		fieldResume = new JTextField();
		fieldResume.setColumns(10);
		fieldResume.setBounds(186, 151, 340, 54);
		formArticle.add(fieldResume);
		
		JTextArea textContenu = new JTextArea();
		textContenu.setBounds(186, 225, 340, 125);
		formArticle.add(textContenu);
		
		JButton btnPublier = new JButton("Publier !");
		btnPublier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Instancier un article
				Article article1 = new Article(fieldTitre.getText(),fieldResume.getText(),textContenu.getText(),user);
				
				//Instancier l'articleController (la requete)
				ArticleController articleDAO = new ArticleController();
				
				//Appeler la methode creation d'article instancier au dessus
				if (articleDAO.create(article1)) {
					JOptionPane.showMessageDialog(null,"BRAVO","Article publier !",JOptionPane.INFORMATION_MESSAGE);
					
					
					panelCo.removeAll(); //Supprime le content pane mais laisse le frame !
					panelCo.add(new PlisteArticle());
					
					panelCo.repaint(); //Supprime le content pane et le relance - MAJ !
					panelCo.revalidate();
					
					
					
					
				} else {
					JOptionPane.showMessageDialog(null,"Oups","Article non publier !",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnPublier.setBackground(new Color(34, 139, 34));
		btnPublier.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnPublier.setBounds(37, 303, 117, 47);
		formArticle.add(btnPublier);

	}
}
