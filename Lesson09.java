package TaxiVAT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lesson09 {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private final JButton btnNewButton = new JButton("New button");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson09 window = new Lesson09();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lesson09() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 523);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\\uB9C8\uB3C4\uC694\\\uD30C\uC77C\\\uC774\uBAA8\uD2F0\uCF58\\\uD558\uD558.gif"));
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\\uB9C8\uB3C4\uC694\\\uD30C\uC77C\\\uC774\uBAA8\uD2F0\uCF58\\\uD558\uD558.gif"));
		btnNewButton.setBounds(105, 122, 144, 99);
		btnNewButton.setPressedIcon(new ImageIcon("C:\\\uB9C8\uB3C4\uC694\\\uD30C\uC77C\\\uC774\uBAA8\uD2F0\uCF58\\\uC886\uB410\uB2E4.gif"));
		panel.add(btnNewButton);
	}
}
