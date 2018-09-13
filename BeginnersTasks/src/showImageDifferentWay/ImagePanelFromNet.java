package showImageDifferentWay;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanelFromNet extends JPanel {
	
	private BufferedImage imageFromNet;

	
	public ImagePanelFromNet() {
		super();
		
		
		try {
			
			URL imageUrl = new URL("http://cdn.benchmark.pl/uploads/backend_img/b/fotki_newsy/2016-01/WK/java.jpg");
			imageFromNet = ImageIO.read(imageUrl);
			
		} catch (IOException e) {
			System.err.println("Load image error");
			e.printStackTrace();
		}

		
		Dimension dimension = new Dimension(imageFromNet.getWidth(), imageFromNet.getHeight());
		setPreferredSize(dimension);
		
		
		}
		@Override
		public void paintComponent(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawImage(imageFromNet, 0, 0, null);
	}

}
