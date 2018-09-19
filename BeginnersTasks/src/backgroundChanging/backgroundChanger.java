package backgroundChanging;

import java.awt.EventQueue;

public class backgroundChanger  {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ActionFrame();
			}
		});

	}

}
