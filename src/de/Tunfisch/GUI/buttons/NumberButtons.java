package de.Tunfisch.GUI.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class NumberButtons {

	JFrame frame;
	JTextField tfInput;
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;	
	
	
	public void addNumberButtons(JFrame extFrame, JTextField extTfInput, Color defaultColor){
		
		tfInput = extTfInput;
		frame = extFrame;
		
		
		//BTN_SEVEN
				btn7 = new JButton("7");
				btn7.setBounds(100, 280, 45, 45);
				btn7.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"7");			
					}	
				});
				
				//BTN_EIGHT
				btn8 = new JButton("8");
				btn8.setBounds(150, 280, 45, 45);
				btn8.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"8");
					}	
				});
				
				//BTN_NINE
				btn9 = new JButton("9");
				btn9.setBounds(200, 280, 45, 45);
				btn9.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"9");
					}	
				});
				
				//BTN_FOUR
				btn4 = new JButton("4");
				btn4.setBounds(100, 330, 45, 45);
				btn4.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"4");
					}	
				});
				
				//BTN_FIVE
				btn5 = new JButton("5");
				btn5.setBounds(150, 330, 45, 45);
				btn5.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"5");
					}	
				});
				
				//BTN_SIX
				btn6 = new JButton("6");
				btn6.setBounds(200, 330, 45, 45);
				btn6.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"6");
					}
				});
				
				//BTN_ONE
				btn1 = new JButton("1");
				btn1.setBounds(100, 380, 45, 45);
				btn1.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"1");
					}	
				});
				
				//BTN_TWO
				btn2 = new JButton("2");
				btn2.setBounds(150, 380, 45, 45);
				btn2.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"2");
					}	
				});
				
				//BTN_THREE
				btn3 = new JButton("3");
				btn3.setBounds(200, 380, 45, 45);
				btn3.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"3");
					}	
				});
				
				//BTN_ZERO
				btn0 = new JButton("0");
				btn0.setBounds(150, 430, 45, 45);
				btn0.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"0");
					}	
				});
				
				btn0.setBackground(defaultColor);
				btn1.setBackground(defaultColor);
				btn2.setBackground(defaultColor);
				btn3.setBackground(defaultColor);
				btn4.setBackground(defaultColor);
				btn5.setBackground(defaultColor);
				btn6.setBackground(defaultColor);
				btn7.setBackground(defaultColor);
				btn8.setBackground(defaultColor);
				btn9.setBackground(defaultColor);
		
				frame.add(btn1);
				frame.add(btn2);
				frame.add(btn3);
				frame.add(btn4);
				frame.add(btn5);
				frame.add(btn6);
				frame.add(btn7);
				frame.add(btn8);
				frame.add(btn9);
				frame.add(btn0);
		
		
	}
	
}
