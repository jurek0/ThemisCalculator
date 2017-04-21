package de.Tunfisch.GUI.buttons;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButtons {

	public JRadioButton radian = new JRadioButton("Radial");
	public JRadioButton degree = new JRadioButton("Grad");
	public ButtonGroup group = new ButtonGroup();
	
	public void createRadioButtons(JFrame frame){
		JLabel askForCircleType = new JLabel("Radialmaﬂ oder Gradmaﬂ");
		radian.setSelected(true);
		
		radian.setBounds(100, 480, 100, 30);
		degree.setBounds(100, 505, 100, 30);
		
		degree.setBackground(Color.gray);
		radian.setBackground(Color.gray);
		degree.setForeground(Color.white);
		radian.setForeground(Color.white);
		
		group.add(degree);
		group.add(radian);
		
		frame.add(askForCircleType);
		frame.add(degree);
		frame.add(radian);
	}
}
