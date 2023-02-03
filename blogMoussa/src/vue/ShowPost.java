package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import controller.ArticleDao;
import controller.CommDAO;
import controller.UserDao;
import model.Article;
import model.Commentaire;
import model.User;

public class ShowPost extends JPanel {
	
	private JLabel llogged;
	JPanel panel_2 = new JPanel();
	private JTable table;
	private JTextField fieldAuteur;
	private JTextField fieldComm;
	private JTextField fieldTitre;
	private JTextField fieldDate;

	/**
	 * Create the panel.
	 */
	public ShowPost(int article_titre) {
		setBackground(new Color(204, 255, 204));
		setBounds(0, 0, 1263, 602);
		setLayout(null);
		
		JPanel panel_show = new JPanel();
		panel_show.setBounds(0, 0, 1263, 598);
		add(panel_show);
		panel_show.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(204, 255, 204));
		panel.setBounds(0, 0, 719, 343);
		panel_show.add(panel);
		
		JLabel lresume_show = new JLabel("R\u00E9sum\u00E9 de l'article");
		lresume_show.setHorizontalAlignment(SwingConstants.CENTER);
		lresume_show.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lresume_show.setBounds(20, 67, 176, 28);
		panel.add(lresume_show);
		
		JLabel lContenu_show = new JLabel("Contenu");
		lContenu_show.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lContenu_show.setHorizontalAlignment(SwingConstants.CENTER);
		lContenu_show.setBounds(53, 206, 133, 28);
		panel.add(lContenu_show);
		
		JLabel titre_show = new JLabel();
		titre_show.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		titre_show.setBounds(206, 11, 472, 37);
		panel.add(titre_show);
		
		JLabel resume_show = new JLabel("");
		resume_show.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		resume_show.setBounds(206, 54, 472, 45);
		panel.add(resume_show);
		
		JLabel contenu_show = new JLabel("");
		contenu_show.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contenu_show.setBounds(206, 206, 472, 104);
		panel.add(contenu_show);
		
		JLabel ltitre = new JLabel("Titre de l'article");
		ltitre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		ltitre.setHorizontalAlignment(SwingConstants.CENTER);
		ltitre.setBounds(22, 11, 164, 37);
		panel.add(ltitre);
		
		JLabel lauteur = new JLabel("Nom de l'auteur");
		lauteur.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lauteur.setHorizontalAlignment(SwingConstants.CENTER);
		lauteur.setBounds(30, 106, 164, 37);
		panel.add(lauteur);
		
		JLabel date_pub = new JLabel("");
		date_pub.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		date_pub.setBounds(206, 158, 472, 37);
		panel.add(date_pub);
		
		JLabel auteur_pub = new JLabel("");
		auteur_pub.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		auteur_pub.setHorizontalAlignment(SwingConstants.CENTER);
		auteur_pub.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		auteur_pub.setBounds(206, 110, 472, 37);
		panel.add(auteur_pub);
		
		JLabel ldate = new JLabel("Date de cr\u00E9ation");
		ldate.setHorizontalAlignment(SwingConstants.CENTER);
		ldate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		ldate.setBounds(34, 160, 162, 28);
		panel.add(ldate);
		
		
		ArticleDao articleDao = new ArticleDao();
		
		
		Article arti = articleDao.findById(article_titre);
		
		
		//for (int i = 0; i < articleDao.findById(article_titre).size(); i++) {
			
			titre_show.setText(arti.getTitre());
			resume_show.setText(arti.getResume());
			contenu_show.setText(arti.getContenu());
			date_pub.setText(arti.getDate().toString());
			auteur_pub.setText(arti.getAuteur().getPrenom());
			
			JPanel panelShowCom = new JPanel();
			panelShowCom.setBounds(718, 0, 254, 598);
			panel_show.add(panelShowCom);
			panelShowCom.setLayout(null);
			
			table = new JTable();
			table.setBounds(127, 5, 0, 0);
			panelShowCom.add(table);
			
			JPanel panelCom = new JPanel();
			panelCom.setBounds(0, 343, 719, 255);
			panel_show.add(panelCom);
			panelCom.setLayout(null);
			
			JLabel titreCom = new JLabel("COMMENTAIRE");
			titreCom.setFont(new Font("Tahoma", Font.PLAIN, 20));
			titreCom.setHorizontalAlignment(SwingConstants.CENTER);
			titreCom.setBounds(274, 11, 152, 24);
			panelCom.add(titreCom);
			
			JLabel labelAuteur = new JLabel("Auteur");
			labelAuteur.setHorizontalAlignment(SwingConstants.CENTER);
			labelAuteur.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelAuteur.setBounds(113, 42, 66, 24);
			panelCom.add(labelAuteur);
			
			JLabel labelCom = new JLabel("Commentaires");
			labelCom.setHorizontalAlignment(SwingConstants.CENTER);
			labelCom.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelCom.setBounds(80, 122, 99, 24);
			panelCom.add(labelCom);
			
			fieldAuteur = new JTextField();
			fieldAuteur.setFont(new Font("Tahoma", Font.BOLD, 12));
			fieldAuteur.setHorizontalAlignment(SwingConstants.CENTER);
			fieldAuteur.setBounds(210, 46, 468, 20);
			panelCom.add(fieldAuteur);
			fieldAuteur.setColumns(10);
			
			fieldComm = new JTextField();
			fieldComm.setBounds(210, 119, 468, 106);
			panelCom.add(fieldComm);
			fieldComm.setColumns(10);
			
			JButton btnCom = new JButton("AJOUTER COMMENTAIRE");
			btnCom.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
					//Instancier un user, un article et un commentaire
					//User user = new User();
					//Article arti = new Article();
					Commentaire commentaire = new Commentaire(fieldTitre.getText(),fieldComm.getText(),arti,UserDao.currentUser);
					//Instancier l'articleController (la requete)
					CommDAO commDAO = new CommDAO();
					
					
					//Appeler la methode creation d'article instancier au dessus
					if (commDAO.create(commentaire)) {
						JOptionPane.showMessageDialog(null,"BRAVO","Commentaire publier !",JOptionPane.INFORMATION_MESSAGE);
						
						
//						panelCo.removeAll(); //Supprime le content pane mais laisse le frame !
//						panelCo.add(new PlisteArticle());
//						
//						panelCo.repaint(); //Supprime le content pane et le relance - MAJ !
//						panelCo.revalidate();
//						

						
					} else {
						JOptionPane.showMessageDialog(null,"Oups","Commentaire non publier !",JOptionPane.ERROR_MESSAGE);
					}
					

					
				}
			});
			btnCom.setBounds(25, 168, 161, 57);
			panelCom.add(btnCom);
			
			fieldTitre = new JTextField();
			fieldTitre.setColumns(10);
			fieldTitre.setBounds(210, 83, 468, 20);
			panelCom.add(fieldTitre);
			
			JLabel labelTitre = new JLabel("Titre");
			labelTitre.setHorizontalAlignment(SwingConstants.CENTER);
			labelTitre.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelTitre.setBounds(113, 77, 66, 24);
			panelCom.add(labelTitre);
			
			JLabel labelDate = new JLabel("Date");
			labelDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelDate.setHorizontalAlignment(SwingConstants.CENTER);
			labelDate.setBounds(25, 25, 66, 24);
			panelCom.add(labelDate);
			
			fieldDate = new JTextField();
			fieldDate.setHorizontalAlignment(SwingConstants.CENTER);
			fieldDate.setBounds(10, 60, 93, 35);
			panelCom.add(fieldDate);
			fieldDate.setColumns(10);
		
			fieldDate.setText(arti.getDate().toString());
			fieldAuteur.setText(arti.getAuteur().getPrenom());
	}
}