package backgroundChanging;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ActionFrame extends JFrame {
	
	public ActionFrame(){
		super("Action test");
		
		JPanel buttonPanel = new ButtonPanel();
		add(buttonPanel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

}
