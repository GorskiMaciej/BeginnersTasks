package backgroundChanging2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DefinideByMe extends JButton implements ActionListener{
	
	private JPanel buttonPanel;
	private Color ChoosenColor = Color.PINK;
	
	public DefinideByMe(JPanel buttonPanel) {
		super("Definied by me.");
		this.buttonPanel = buttonPanel;
		addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		buttonPanel.setBackground(ChoosenColor);
		
	}

}
