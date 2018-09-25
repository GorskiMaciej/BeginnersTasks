package mouse;

import java.awt.EventQueue;

import javax.swing.JFrame;

class Frame extends JFrame {
	public Frame() {
		super("MouseTest");
			
			add(new MouseTestPanel());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		
	}
}

public class MouseTestFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Frame();
			}
		});
	}

}
