package mouse;


import java.awt.EventQueue;
import javax.swing.JFrame;

public class FrameM extends JFrame {
	public FrameM() {
		super("MouseTest");

		add(new DrawingPointsWithMousePanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new FrameM();
			}
		});
	}
}