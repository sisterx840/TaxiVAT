package TaxiVAT;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;

public class Customer_App {

	private JFrame frame;
	private JTextField id;
	private JPasswordField ps;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_App window = new Customer_App();
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
	public Customer_App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		ImagePanel welcomePanel = new ImagePanel(new ImageIcon("C:/Users/user/eclipse-workspace/TaxiVAT/image/Welcome1.jpg").getImage());
			welcomePanel.setBounds(0, 0, 1488, 1004);
		frame.setSize(welcomePanel.getWidth(),welcomePanel.getHeight());
		frame.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBounds(0, 0, 1488, 965);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setVisible(false);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to This is Main Panel");
		lblNewLabel_2.setFont(new Font("Elephant", Font.PLAIN, 35));
		lblNewLabel_2.setBounds(501, 37, 901, 58);
		mainPanel.add(lblNewLabel_2);
		frame.getContentPane().add(welcomePanel);
		welcomePanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setBounds(448, 309, 201, 48);
		lblNewLabel.setFont(new Font("Elephant", Font.PLAIN, 30));
		welcomePanel.add(lblNewLabel);
		
		id = new JTextField();
		id.setBounds(447, 387, 212, 34);
		id.setFont(new Font("Dialog", Font.PLAIN, 20));
		id.setToolTipText("Enter ID");
		welcomePanel.add(id);
		id.setColumns(10);
		
		ps = new JPasswordField();
		ps.setBounds(447, 441, 212, 34);
		ps.setFont(new Font("Dialog", Font.PLAIN, 20));
		welcomePanel.add(ps);
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setBounds(369, 383, 128, 43);
		lblNewLabel_1.setFont(new Font("Elephant", Font.PLAIN, 30));
		welcomePanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PS :");
		lblNewLabel_1_1.setBounds(369, 440, 128, 43);
		lblNewLabel_1_1.setFont(new Font("Elephant", Font.PLAIN, 30));
		welcomePanel.add(lblNewLabel_1_1);
		
		JButton btnLogIn = new JButton("");
		btnLogIn.setBounds(826, 510, 55, 59);
		btnLogIn.setIcon(new ImageIcon("C:/Users/user/eclipse-workspace/TaxiVAT/image/» .gif"));
		btnLogIn.setPressedIcon(new ImageIcon("C:/Users/user/eclipse-workspace/TaxiVAT/image/¡øµ∆¥Ÿ.gif"));
		btnLogIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					System.out.println(id.getText());
					System.out.println(ps.getPassword());
				
					if(id.getText().equals("Danny")&&Arrays.equals(ps.getPassword(),"hello".toCharArray())) {
						System.out.println("Welcome Danny");
						welcomePanel.setVisible(false);
						mainPanel.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null,"You failed to log in");
						
					}
			}
				
			
		});
		
		
		
		welcomePanel.add(btnLogIn);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class ImagePanel extends JPanel{

	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
				
	}
	
	public int getWidth() {
		return img.getWidth(null);
	}	
		
	public int getHeight() {
		return img.getHeight(null);
	}
	
	
	
	public void paintComponent(Graphics g) {
	
		g.drawImage(img, 0, 0, null);
	}
}