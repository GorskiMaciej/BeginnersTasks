package backgroundChanging2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Down extends JButton implements ActionListener{
	
	private static String buttonText = "?";
	private boolean keyDown = false;
	
	Down() {
		super(buttonText);
		addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(keyDown) {
			setText("Button down");
		}
		else {
			setText("Button up");
			keyDown = !keyDown;
		}
	}

}
