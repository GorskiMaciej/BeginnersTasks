package showImageDifferentWay;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageFrame extends JFrame {
	
	public ImageFrame() {
		super("Image");
		
		setLayout(new FlowLayout());
		
		JPanel ImagePanel = new ImagePanel();
		add(ImagePanel);
		JPanel ImagePanelFromNet = new ImagePanelFromNet();
		add(ImagePanelFromNet);
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

}
