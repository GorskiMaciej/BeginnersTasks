package Swing;


import java.awt.EventQueue;

public class KeyTestProgram {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new KeyTest();
			}
		});
	}
}