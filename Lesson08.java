package TaxiVAT;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel{

	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	public void paintComponent(Graphics g) {
	
		g.drawImage(img, 0, 0, null);
}
}

public class Lesson08 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Lesson 09");
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		ImagePanel panel = new ImagePanel(new ImageIcon("./image/image.jpg").getImage());
		frame.add(panel);
		frame.pack();
		
		File f = new File("./image/image.jpg");
		System.out.println(f.exists()?"Exists":"doesnt exists");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
		
		
		
}
