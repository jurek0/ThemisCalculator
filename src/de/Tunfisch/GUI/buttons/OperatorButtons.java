package de.Tunfisch.GUI.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class OperatorButtons {

	JTextField tfInput;
	JFrame frame;
	JButton btnMultiply, btnDivide, btnPlus, btnMinus, btnNegate, btnComma, btnPercentage;
	
	public void addOperatorButtons(JFrame extFrame, JTextField extTfInput){
		tfInput = extTfInput;
		frame = extFrame;
		
		
				//BTN_PLUS
				btnPlus = new JButton("+");
				btnPlus.setBounds(250, 280, 45, 45);
				btnPlus.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"+");
					}	
				});
				
				//BTN_MINUS
				btnMinus = new JButton("-");
				btnMinus.setBounds(250, 330, 45, 45);
				btnMinus.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"-");
					}	
				});
				
				//BTN_MULTIPLY
				btnMultiply = new JButton("*");
				btnMultiply.setBounds(250, 380, 45, 45);
				btnMultiply.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"*");
					}	
				});
				
				//BTN_DIVIDE
				btnDivide = new JButton("/");
				btnDivide.setBounds(250, 430, 45, 45);
				btnDivide.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"/");
					}	
				});
				
				//BTN_NEGATE
				btnNegate = new JButton(".-");
				btnNegate.setBounds(200, 430, 45, 45);
				btnNegate.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+"neg");
					}	
				});
				
				//BTN_COMMA
				btnComma = new JButton(".");
				btnComma.setBounds(100, 430, 45, 45);
				btnComma.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
					tfInput.setText(tfInput.getText()+".");
					}	
				});
				
				//BTN_N_PERCENTAGE_X
				btnPercentage = new JButton("%");
				btnPercentage.setBounds(300, 280, 45, 45);
				btnPercentage.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						tfInput.setText(tfInput.getText()+"%");
					}
				});
				
				//COLORING
				btnPlus.setBackground(Color.orange);
				btnMinus.setBackground(Color.orange);
				btnMultiply.setBackground(Color.orange);
				btnDivide.setBackground(Color.orange);
				btnComma.setBackground(Color.white);
				btnNegate.setBackground(Color.white);
				btnPercentage.setBackground(Color.green);
				
				
				//ADDING OF THE COMPONENTS
				frame.add(btnPlus);
				frame.add(btnMinus);
				frame.add(btnMultiply);
				frame.add(btnDivide);
				frame.add(btnNegate);
				frame.add(btnComma);
				frame.add(btnPercentage);
				
		
	}
}
