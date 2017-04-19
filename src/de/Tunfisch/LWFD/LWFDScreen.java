package de.Tunfisch.LWFD;

import java.awt.Color;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LWFDScreen {

	public JPanel screen;
	public JTextField TFfunction, TFxmin, TFxmax, TFymin, TFymax;
	public JButton btnDraw;
	
	
	
	public void initialize(Window extWindow){
		
		screen = new JPanel();
		screen.setBounds(550, 50, 300, 300);
		screen.setBackground(Color.white);
		screen.setForeground(Color.white);

	}
	
}
