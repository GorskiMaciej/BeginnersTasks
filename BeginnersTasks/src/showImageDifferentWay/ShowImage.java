package showImageDifferentWay;

import java.awt.EventQueue;

public class ShowImage {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ImageFrame();
			}
		});
	}
}
