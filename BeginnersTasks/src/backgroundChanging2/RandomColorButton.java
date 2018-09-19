package backgroundChanging2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RandomColorButton extends JButton implements ActionListener  {
	
	private JPanel buttonPanel;
	Random rand = new Random();
	private int randomNumber = rand.nextInt(2);
	
	public RandomColorButton(JPanel buttonPanel) {
		super("Random");
		this.buttonPanel = buttonPanel;
		addActionListener(this);
	}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			if (randomNumber == 0) {
				buttonPanel.setBackground(Color.RED);
			}
			else if (randomNumber == 1) {
				buttonPanel.setBackground(Color.GREEN);
			}
			else if (randomNumber == 2) {
				buttonPanel.setBackground(Color.BLUE);
			}
			
		}
	
	

}
