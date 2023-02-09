package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import controller.ArticleDao;
import model.Article;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class Accueil extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Accueil() {
		setLayout(null);
		setBounds(10, 112, 816, 362);
		
		JPanel Accueil = new JPanel();
		Accueil.setBounds(0, 0, 816, 362);
		add(Accueil);
		Accueil.setLayout(null);
		
		JPanel listing = new JPanel();
		listing.setBounds(10, 59, 781, 292);
		Accueil.add(listing);
		listing.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 74, 724, 218);
		listing.add(scrollPane);
		
		
		JButton btnInscrCo = new JButton("Se connecter / S'inscrire");
		btnInscrCo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accueil.removeAll();
				Accueil.add(new InscriptConnect());
				
				Accueil.repaint();
				Accueil.revalidate();
			}
		});
		btnInscrCo.setBackground(Color.RED);
		btnInscrCo.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnInscrCo.setBounds(580, 21, 173, 42);
		listing.add(btnInscrCo);

		table = new JTable();
		table.setModel(liste());
		
		JLabel isEmpty1 = new JLabel("Aucun article pour le moment...");
		JLabel isEmpty2 = new JLabel();
		if(articleDao.read().size()==0) {
			isEmpty1.setHorizontalAlignment(SwingConstants.CENTER);
			isEmpty1.setFont(new Font("Tahoma", Font.BOLD, 20));
			isEmpty2.setIcon(new ImageIcon("C:\\Users\\bourg\\OneDrive\\Bureau\\WorkspaceJAVA\\blogCorrection\\src\\ressources\\homer.jfif"));
			isEmpty1.setBounds(60, 10, 500, 100);
			isEmpty2.setBounds(160, 100, 500, 170);
			listing.add(isEmpty1);
			listing.add(isEmpty2);
			isEmpty1.setVisible(true);
			isEmpty2.setVisible(true);
			scrollPane.setVisible(false);
		} else {
			isEmpty1.setVisible(false);
			isEmpty2.setVisible(false);
			scrollPane.setVisible(true);
			scrollPane.setViewportView(table);
		}
		
		scrollPane.setViewportView(table);
	}
	
ArticleDao articleDao = new ArticleDao();
	
	//METHODE SUPP
	public DefaultTableModel liste() {
		String col[] = {"ID","Titre","Resume","Date de publication","auteur"};
		DefaultTableModel tableau = new DefaultTableModel(null,col);
		for (Article article : articleDao.read()) {
			tableau.addRow(new Object[] {
					article.getId(),
					article.getTitre(),
					article.getResume(),
					article.getDate(),
					article.getAuteur().getPrenom()
			});
			
		}
		return tableau;
	}
}
