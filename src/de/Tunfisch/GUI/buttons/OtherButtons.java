package de.Tunfisch.GUI.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import de.Tunfisch.GUI.VersionInfo;

public class OtherButtons {
	
	JFrame frame;
	JTextField tfInput, tfResult;
	JButton btnBracketOpen, btnBracketClose; 
	JButton btnBackspace, btnShutdown;
	JButton btnInfo;
	
	public JButton btnRad, btnDeg;
	public JTextField hiddenTF;
	
	public boolean isDegree;
	VersionInfo vinfo = new VersionInfo();
	
	public void addOtherButtons(JFrame extFrame, JTextField extTfInput, JTextField extTfResult){
		frame = extFrame;
		tfInput = extTfInput;
		
		hiddenTF = new JTextField();
		hiddenTF.setBounds(0, 0, 80, 30);
		hiddenTF.setVisible(false);
		hiddenTF.setText("rad");
		hiddenTF.setEditable(false);
		
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
		
		//BTN_INFO
		btnInfo = new JButton("i");
		btnInfo.setBounds(745, 10, 45, 45);
		btnInfo.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				vinfo.start();
			}
		});
		
		//BTN_RAD
		btnRad = new JButton("RAD");
		btnRad.setBounds(100, 480, 95, 45);
		btnRad.setVisible(true);
		btnRad.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				btnRad.setVisible(false);
				btnDeg.setVisible(true);
				hiddenTF.setText("deg");
				System.out.println(hiddenTF.getText());
			}
		});
		
		//BTN_DEG
		btnDeg = new JButton("DEG");
		btnDeg.setBounds(100, 480, 95, 45);
		btnDeg.setVisible(false);
		btnDeg.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				btnDeg.setVisible(false);
				btnRad.setVisible(true);
				hiddenTF.setText("rad");
				System.out.println(hiddenTF.getText());
			}
		});		
		
		//COLORING
		btnBracketClose.setBackground(Color.green);
		btnBracketOpen.setBackground(Color.green);
		btnBackspace.setBackground(Color.red);
		btnShutdown.setBackground(Color.darkGray);
		btnShutdown.setForeground(Color.white);
		btnInfo.setBackground(Color.gray);
		btnInfo.setForeground(Color.white);
		btnDeg.setBackground(Color.darkGray);
		btnRad.setBackground(Color.darkGray);
		btnDeg.setForeground(Color.white);
		btnRad.setForeground(Color.white);
		
		frame.add(btnBackspace);
		frame.add(btnBracketOpen);
		frame.add(btnBracketClose);
		frame.add(btnShutdown);
		frame.add(btnInfo);
		frame.add(btnRad);
		frame.add(btnDeg);
	}
	
	public boolean degreeIsSelected(){
		
		return isDegree;
	}

}