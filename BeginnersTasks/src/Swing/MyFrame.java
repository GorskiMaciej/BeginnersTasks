package Swing;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		super(" Not Hello World");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(625, 625);
		setSize(250, 250);
		setLayout(new FlowLayout());
		
		add(new JButton("+"));
		add(new JButton("-"));
		add(new JButton("*"));
		add(new JButton("/"));
		add(new JButton("√"));
		add(new JButton("I^II"));
		add(new JButton("pow"));
		add(new JButton("m%"));
		
		
		setVisible(true);
	}

}
