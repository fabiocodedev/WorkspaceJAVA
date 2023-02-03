package vue;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.ArticleDao;
import controller.UserDao;
import model.User;

public class Accueil extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel_4;

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
		setBounds(100, 100, 1149, 804);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("SPEAR:  blog d'actualités");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(55, 11, 1007, 69);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 255, 250));
		panel.setBounds(10, 147, 1113, 607);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Last news");
		lblNewLabel_1.setFont(new Font("Caveat", Font.ITALIC, 40));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(184, 11, 791, 57);
		panel.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 79, 1053, 372);
		panel.add(scrollPane);
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(UserDao.currentUser == null) {
					JOptionPane.showMessageDialog(null,"Vous devez vous connecter avant d'ajouter un post","OUPS",JOptionPane.ERROR_MESSAGE);
				}else {
					contentPane.removeAll();
					System.out.println("--------------" + UserDao.currentUser);
					contentPane.add(new AjoutArticle(UserDao.currentUser));
					contentPane.repaint();
					contentPane.revalidate();
				}
			}
		});
		
		btnNewButton.setEnabled(false);
		btnNewButton.setToolTipText("Ajout article");
		btnNewButton.setBackground(new Color(255, 250, 250));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon(Accueil.class.getResource("/resources/add.png")));
		btnNewButton.setBounds(132, 462, 137, 128);
		panel.add(btnNewButton);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(703, 91, 388, 45);
		JLabel  lblNewLabel_4 = new JLabel("Sign in / Sign up");
		
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.removeAll();
				panel.add(new Acces());
				panel.repaint();
				panel.revalidate();
			}
		});
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lblNewLabel_4.setBounds(57, 0, 275, 51);
		panel_1.add(lblNewLabel_4);
		
		
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int id = table.getSelectedRow();
				// Pour id
				int article_titre =  (int) table.getModel().getValueAt(id, 0);

				//String article_titre =   (String) table.getModel().getValueAt(id, 0);
				System.out.println(table.getModel().getValueAt(id, 0));
				
				
				contentPane.removeAll();
				contentPane.add(new ShowPost(article_titre));

				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		
		scrollPane.setViewportView(table);
		table.setRowHeight(50);
		table.setModel(listeArticle());
		if (table.getRowCount() > 0) {
			
		}else {
			JLabel lblNewLabel_2 = new JLabel("Pas d'articles");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			scrollPane.setColumnHeaderView(lblNewLabel_2);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon(Accueil.class.getResource("/resources/listeEmpty.png")));
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			scrollPane.setViewportView(lblNewLabel_3);
			
		}
	}
	
	public Accueil(User user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1149, 804);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("SPEAR:  blog d'actualités");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(55, 11, 522, 69);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 255, 250));
		panel.setBounds(10, 106, 1113, 648);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Last news");
		lblNewLabel_1.setFont(new Font("Caveat", Font.ITALIC, 40));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(184, 11, 791, 57);
		panel.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 102, 1053, 372);
		panel.add(scrollPane);
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(UserDao.currentUser == null) {
					JOptionPane.showMessageDialog(null,"Vous devez vous connecter avant d'ajouter un post","OUPS",JOptionPane.ERROR_MESSAGE);
				}else {
					contentPane.removeAll();
					System.out.println("--------------" + UserDao.currentUser);
					contentPane.add(new AjoutArticle(UserDao.currentUser));
					contentPane.repaint();
					contentPane.revalidate();
				}
			}
		});
		
		btnNewButton.setEnabled(false);
		btnNewButton.setToolTipText("Ajout article");
		btnNewButton.setBackground(new Color(255, 250, 250));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon(Accueil.class.getResource("/resources/add.png")));
		btnNewButton.setBounds(133, 485, 137, 128);
		panel.add(btnNewButton);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(701, 26, 388, 56);
		JLabel lblNewLabel_4 = new JLabel("Sign in / Sign up");
		
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.removeAll();
				panel.add(new Acces());
				panel.repaint();
				panel.revalidate();
			}
		});
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lblNewLabel_4.setBounds(57, 0, 275, 51);
		panel_1.add(lblNewLabel_4);
		
		
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int id = table.getSelectedRow();
				// Pour id
				int article_titre =  (int) table.getModel().getValueAt(id, 0);

				//String article_titre =   (String) table.getModel().getValueAt(id, 0);
				System.out.println(table.getModel().getValueAt(id, 0));
				
				
				contentPane.removeAll();
				contentPane.add(new ShowPost(article_titre));

				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		
		scrollPane.setViewportView(table);
		table.setRowHeight(50);
		table.setModel(listeArticle());
		if (table.getRowCount() > 0) {
			
		}else {
			JLabel lblNewLabel_2 = new JLabel("Pas d'articles");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			scrollPane.setColumnHeaderView(lblNewLabel_2);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon(Accueil.class.getResource("/resources/listeEmpty.png")));
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			scrollPane.setViewportView(lblNewLabel_3);
			
		}
	}

	public DefaultTableModel listeArticle() {
		//Création de la colonne
		String col [] =  {"ID","Titre", "Résume", "Date ", "Auteur"};
		
		DefaultTableModel tableau = new DefaultTableModel(null, col);
		ArticleDao articleDao = new ArticleDao();
		
		for (model.Article art : articleDao.read()) {
			tableau.addRow(new Object[] {
					art.getId(),
					art.getTitre(),
					art.getResume(),
					art.getDate(),
					art.getAuteur().getPrenom()
			});
		}
		return tableau;
		
	}
}
