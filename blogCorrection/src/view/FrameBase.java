package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FrameBase extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameBase frame = new FrameBase();
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
	public FrameBase() {
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
		
		body.removeAll();
		Accueil accueil = new Accueil();
		accueil.setLocation(0, 0);
		body.add(accueil);
		
		body.repaint();
		body.revalidate();
	}

}
