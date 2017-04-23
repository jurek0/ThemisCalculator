package de.Tunfisch.GUI.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MathButtons {

	JTextField tfInput;
	JFrame frame;
	JButton btnLN, btnLOG, btnPOW, btnX, btnSIN, btnCOS, btnTAN, btnE, btnPI, btnSQRT, btnCBRT, btnFaculty;
	
	public void addMathButtons(JFrame extFrame, JTextField extTfInput){
		tfInput = extTfInput;
		frame = extFrame;
		
		//BTN_NATURAL_LOG
		btnLN = new JButton("ln");
		btnLN.setBounds(300, 330, 45, 45);
		btnLN.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"ln(");
			}	
		});
		
		//BTN_LOG
		btnLOG = new JButton("lg");
		btnLOG.setBounds(300, 380, 45, 45);
		btnLOG.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"log(");
			}	
		});
		
		//BTN_POWER
		btnPOW = new JButton("^");
		btnPOW.setBounds(300, 430, 45, 45);
		btnPOW.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"^(");
			}	
		});
		
		//BTN_X
		btnX = new JButton("X");
		btnX.setBounds(300, 480, 45, 45);
		btnX.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"X");
			}	
		});		
		
		//Buttons in row at top ==============================
		
		//BTN_SINUS
		btnSIN = new JButton("sin");
		btnSIN.setBounds(100, 200, 55, 35);
		btnSIN.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"sin(");
			}	
		});
		
		//BTN_COSINUS
		btnCOS = new JButton("cos");
		btnCOS.setBounds(160, 200, 55, 35);
		btnCOS.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"cos(");
			}	
		});
		
		//BTN_TANGENS
		btnTAN = new JButton("tan");
		btnTAN.setBounds(220, 200, 55, 35);
		btnTAN.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"tan(");
			}	
		});
		
		
		
		//BTN_PI
		btnPI = new JButton("PI");
		btnPI.setBounds(280, 240, 65, 35);
		btnPI.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"PI");
			}	
		});
		
		//BTN_E
		btnE = new JButton("e");
		btnE.setBounds(280, 200, 65, 35);
		btnE.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"e");
			}	
		});

		//BTN_SQRT
		btnSQRT = new JButton("2 \u221a");
		btnSQRT.setBounds(350, 280, 65, 45);
		btnSQRT.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"sqrt(");
			}
		});
		
		//BTN_CUBICROOT
		btnCBRT = new JButton("3 \u221a");
		btnCBRT.setBounds(350, 330, 65, 45);
		btnCBRT.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				tfInput.setText(tfInput.getText()+"cbrt(");
			}
		});
		
		//BTN_FACULTY
		btnFaculty = new JButton("!");
		btnFaculty.setBounds(350, 380, 65, 45);
		btnFaculty.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfInput.setText(tfInput.getText()+"!(");
			}
		});
		
		//COLORING
		btnSIN.setBackground(Color.green);
		btnCOS.setBackground(Color.green);
		btnTAN.setBackground(Color.green);
		btnLOG.setBackground(Color.green);
		btnLN.setBackground(Color.green);
		btnPOW.setBackground(Color.green);
		btnE.setBackground(Color.green);
		btnPI.setBackground(Color.green);
		btnSQRT.setBackground(Color.green);
		btnCBRT.setBackground(Color.green);
		btnX.setBackground(Color.green);
		btnFaculty.setBackground(Color.green);
		
		
		frame.add(btnLN);
		frame.add(btnLOG);
		frame.add(btnPOW);
		frame.add(btnX);
		frame.add(btnSQRT);
		frame.add(btnCBRT);
		frame.add(btnSIN);
		frame.add(btnCOS);
		frame.add(btnTAN);
		frame.add(btnPI);
		frame.add(btnE);
		frame.add(btnFaculty);
	}
}