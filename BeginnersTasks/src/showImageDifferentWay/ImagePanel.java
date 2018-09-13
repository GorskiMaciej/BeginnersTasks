package showImageDifferentWay;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	
	private BufferedImage image;
	
	public ImagePanel() {
		super();
		
		
		try {
			File imageFile = new File("E:/EclipseWorkspaces/git/BeginnersTasksRepository/BeginnersTasks/src/graphic/ja.jpg");
			image = ImageIO.read(imageFile);
		} catch (IOException e) {
			System.err.println("Load image error");
			e.printStackTrace();
		}
		
		
		Dimension dimension = new Dimension(image.getWidth(), image.getHeight());
		setPreferredSize(dimension);
		
		
		}
		@Override
		public void paintComponent(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawImage(image, 0, 0, this);
	}

}
