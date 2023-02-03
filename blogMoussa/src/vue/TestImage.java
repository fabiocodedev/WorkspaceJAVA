package vue;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TestImage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestImage frame = new TestImage();
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
	public TestImage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 360, 539);
		
		ImageIcon image = new ImageIcon(getClass().getResource("/images/51LtEojMH7S.jpg"));
	     //  frame.setIconImage(image.getImage());
		JLabel lbl = new JLabel();
		lbl.setBounds(10, 11, 360, 539);
		lbl.setIcon(new ImageIcon(TestImage.class.getResource("/images/51LtEojMH7S.jpg")));
		panel.add(lbl);
		
		contentPane.add(panel);
		panel.setLayout(null);
	}
}
