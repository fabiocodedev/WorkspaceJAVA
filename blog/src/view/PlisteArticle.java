package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.Iterator;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;

import controller.ArticleController;
import model.Article;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PlisteArticle extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PlisteArticle() {
		setLayout(null);
		setBounds(0, 0, 600, 500);
		
		JPanel panelListeArticle = new JPanel();
		panelListeArticle.setBackground(new Color(100, 149, 237));
		panelListeArticle.setBounds(5, 5, 590, 490);
		add(panelListeArticle);
		panelListeArticle.setLayout(null);
		
		JLabel titre = new JLabel("LISTE DES ARTICLES");
		titre.setFont(new Font("Tahoma", Font.BOLD, 20));
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		titre.setBounds(183, 22, 243, 31);
		panelListeArticle.add(titre);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 74, 518, 387);
		panelListeArticle.add(scrollPane);
		
		table = new JTable();

		// MOUSE CLICKED -----------------------------------------------------------------------------------------------------------
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.err.println(table.getSelectedRow());
			}
		});
		table.setModel(listeArticle());
		scrollPane.setViewportView(table);

	}
	
	public DefaultTableModel listeArticle() {
		//Creation de la colonne
		String col[] = {"Titre","Resumer","Date","Auteur"};
		
		DefaultTableModel tableau = new DefaultTableModel(null, col);
		ArticleController articleDAO = new ArticleController();
		
		for (Article art : articleDAO.read()) {
			tableau.addRow(new Object[] {
					art.getTitre(),
					art.getResume(),
					art.getDate(),
					art.getAuteur().getPrenom(),
			});
		}
		
		return tableau;
	}
	
	
	
	
	
	
	
	
	
}
