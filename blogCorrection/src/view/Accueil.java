package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.ArticleDao;
import model.Article;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Accueil extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil frame = new Accueil();
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
	public Accueil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBounds(10, 28, 816, 73);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel titreHeader = new JLabel("SPEAR : Blog d'actualités");
		titreHeader.setFont(new Font("Tahoma", Font.ITALIC, 25));
		titreHeader.setHorizontalAlignment(SwingConstants.CENTER);
		titreHeader.setBounds(206, 24, 384, 38);
		header.add(titreHeader);
		
		JPanel body = new JPanel();
		body.setBounds(10, 112, 816, 362);
		contentPane.add(body);
		body.setLayout(null);
		
		JButton btnInscrCo = new JButton("Se connecter / S'inscrire");
		btnInscrCo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				body.removeAll();
				body.add(new InscriptionConnection());
				
				body.repaint();
				body.revalidate();
			}
		});
		btnInscrCo.setBackground(Color.RED);
		btnInscrCo.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnInscrCo.setBounds(632, 11, 174, 32);
		body.add(btnInscrCo);
		
		JPanel listing = new JPanel();
		listing.setBounds(10, 59, 781, 229);
		body.add(listing);
		listing.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 11, 724, 218);
		listing.add(scrollPane);
		
		table = new JTable();
		table.setModel(liste());
		
		JLabel isEmpty1 = new JLabel("Aucun article pour le moment...");
		JLabel isEmpty2 = new JLabel();
		if(articleDao.read().size()==0) {
			isEmpty1.setHorizontalAlignment(SwingConstants.CENTER);
			isEmpty1.setFont(new Font("Tahoma", Font.BOLD, 20));
			isEmpty2.setIcon(new ImageIcon("C:\\Users\\bourg\\OneDrive\\Bureau\\WorkspaceJAVA\\blogCorrection\\src\\ressources\\homer.jfif"));
			isEmpty1.setBounds(210, 10, 500, 100);
			isEmpty2.setBounds(250, 150, 500, 100);
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
