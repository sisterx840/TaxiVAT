import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Lesson06 {

	private static final ActionListener ActionListener = null;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson06 window = new Lesson06();
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
	public Lesson06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Lesson06");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		
		
		JPanel startPage = new JPanel();
		startPage.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(startPage);
		startPage.setLayout(null);
		
		JButton btnNext = new JButton("GO TO NEXT");
		btnNext.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNext.setBounds(75, 83, 224, 374);
		startPage.add(btnNext);
		
		
	
		
		
		JPanel endPage = new JPanel();
		
		
		endPage.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(endPage);
		endPage.setLayout(null);
		
		JButton btnBefore = new JButton("GO TO LAST");
		btnBefore.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnBefore.setBounds(485, 83, 224, 374);
		endPage.add(btnBefore);
		
		
		
	endPage.setVisible(false);
		
		btnBefore.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				endPage.setVisible(false);
				startPage.setVisible(true   );
				
			}
			
		});
	
	btnNext.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
		
			
		
		
		startPage.setVisible(false);
		endPage.setVisible(true);

		}	
	
});
	
	}
}
