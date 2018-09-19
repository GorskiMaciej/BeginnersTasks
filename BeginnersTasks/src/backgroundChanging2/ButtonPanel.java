package backgroundChanging2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel  {
	
	public static final int HEIGHT = 100;
	public static final int WEIHGT = 300;
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton;
	
	public ButtonPanel() {
		firstButton = new RandomColorButton(this);
		secondButton = new DefinideByMe(this);
		thirdButton = new Down();
		
		/*Actions
		RandomColorButton randomColorListener = new RandomColorButton(this);
		firstButton.addActionListener(randomColorListener);
		DefinideByMe definiedByMeListener = new DefinideByMe(this);
		secondButton.addActionListener(definiedByMeListener);
		Down downListener = new Down();
		thirdButton.addActionListener(downListener);
		*/
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(WEIHGT, HEIGHT));
		add(firstButton);
		add(secondButton);
		add(thirdButton);
	}
}
