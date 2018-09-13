package showImage;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	
	private BufferedImage image;
	private BufferedImage imageFromNet;
	
	private int panelWidth;
	private int panelHight;
	
	public ImagePanel() {
		super();
		
		
		try {
			
			URL imageUrl = new URL("http://cdn.benchmark.pl/uploads/backend_img/b/fotki_newsy/2016-01/WK/java.jpg");
			imageFromNet = ImageIO.read(imageUrl);
			
			File imageFile = new File("E:/EclipseWorkspaces/git/BeginnersTasksRepository/BeginnersTasks/src/graphic/ja.jpg");
			image = ImageIO.read(imageFile);
		} catch (IOException e) {
			System.err.println("Load image error");
			e.printStackTrace();
		}
		
		panelWidth = image.getWidth() + imageFromNet.getWidth();
		
		if (image.getHeight()>imageFromNet.getHeight()) {
			panelHight = image.getHeight();
		}
		else {
			panelHight = imageFromNet.getHeight();
		}
		
		Dimension dimension = new Dimension(panelWidth, panelHight);
		setPreferredSize(dimension);
		
		
		}
		@Override
		public void paintComponent(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawImage(image, 0, 0, this);
			g2d.drawImage(imageFromNet, image.getWidth(), 0, null);
	}

}
