package de.Tunfisch.GUI.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class OtherButtons {
	
	JFrame frame;
	JTextField tfInput, tfResult;
	JButton btnBracketOpen, btnBracketClose; 
	JButton btnBackspace, btnShutdown;
	
	public void addOtherButtons(JFrame extFrame, JTextField extTfInput, JTextField extTfResult){
		frame = extFrame;
		tfInput = extTfInput;
		
		//BTN_OPENINGBRACKET
		btnBracketOpen = new JButton("(");
		btnBracketOpen.setBounds(180, 240, 45, 35);
		btnBracketOpen.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"(");
			}	
		});
		
		//BTN_CLOSINGBRACKET
		btnBracketClose = new JButton(")");
		btnBracketClose.setBounds(230, 240, 45, 35);
		btnBracketClose.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+")");
			}
		});
		
		//BTN_BACKSPACE
		btnBackspace = new JButton("<-");
		btnBackspace.setBounds(350, 240, 65, 35);
		btnBackspace.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					tfInput.setText(tfInput.getText().substring(0, tfInput.getText().length()-1));
				} catch (Exception e1) {
					System.out.println("No more characters to remove");
				}
			}
		});
		
		//BTN_SHUTDOWN
		btnShutdown = new JButton("OFF");
		btnShutdown.setBounds(350, 480, 65, 45);
		btnShutdown.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		//COLORING
		btnBracketClose.setBackground(Color.green);
		btnBracketOpen.setBackground(Color.green);
		btnBackspace.setBackground(Color.red);
		btnShutdown.setBackground(Color.darkGray);
		btnShutdown.setForeground(Color.white);
		
		frame.add(btnBackspace);
		frame.add(btnBracketOpen);
		frame.add(btnBracketClose);
		frame.add(btnShutdown);
	}

}
