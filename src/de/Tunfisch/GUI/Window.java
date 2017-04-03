package de.Tunfisch.GUI;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import de.Tunfisch.GUI.buttons.MathButtons;
import de.Tunfisch.GUI.buttons.NumberButtons;
import de.Tunfisch.GUI.buttons.OperatorButtons;
import de.Tunfisch.GUI.buttons.OtherButtons;
import de.Tunfisch.Themis2.ThemisSolver;
import de.Tunfisch.UserInput.Keylistener;

public class Window {

	//Version
	public JLabel lblVersion;
	
	//IsDegree
	public boolean isDegree = false;
	
	//Frame
	public JFrame frame;
	
	// Number-Fields
	public JTextField tfInput;
	public JLabel lblInput;
	
	// Ergebnisfeld
	public JTextField tfResult;
	public JLabel lblResult;
	
	//Buttons
	public JButton btnEnter, btnClearAll, btnANS;
		
	//Calculator
	ThemisSolver themis = new ThemisSolver();
	
	//Buttons
	NumberButtons numberbtns = new NumberButtons();
	OperatorButtons opbtns = new OperatorButtons();
	MathButtons mathbtns = new MathButtons();
	OtherButtons otherbtns = new OtherButtons();
	
	//Keylistener
	Keylistener klisten = new Keylistener();
	
	
	public void start() {
		Window window = new Window();
		window.frame.setVisible(true);
	}	
	public Window(){
		initialize("1.3-DE, DEBUG-EDITION");
		numberbtns.addNumberButtons(frame, tfInput);
		opbtns.addOperatorButtons(frame, tfInput);
		mathbtns.addMathButtons(frame, tfInput);
		otherbtns.addOtherButtons(frame, tfInput, tfResult);
		klisten.CalculatorKeys(frame, tfInput, tfResult);
		RadioButtons();
	}

	public void initialize(String versionnumber) {	
		
		//Frame
		frame = new JFrame("THEMISCALCULATOR " + versionnumber );
		frame.setBounds(0, 0, 500, 700);
		frame.setResizable(false);
		frame.setFocusable(true);
		frame.isAutoRequestFocus();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icon_new.png")));

		//Input-Field
		tfInput = new JTextField();
		tfInput.setBounds(100, 100, 300, 30);
		tfInput.setEditable(true);
		frame.requestFocus();
		
		//Result-Field
		tfResult = new JTextField();
		tfResult.setBounds(100, 160, 300, 30);
		frame.requestFocus();
		
		//Input-Label
		lblInput = new JLabel("Eingabefeld");
		lblInput.setBounds(100, 65, 100, 30);
		
		//Result-Label 
		lblResult = new JLabel("Ergebnisfeld");
		lblResult.setBounds(100, 130, 300, 30);
		
		//Version-Label
		lblVersion = new JLabel(versionnumber);
		lblVersion.setBounds(10, 640, 470, 40);
		
		//Buttons---------------------------------------------------------------------------------------------------------
		
		
		//BTN_ENTER============IMPORTANT
		btnEnter = new JButton("ENTER");
		btnEnter.setBounds(200, 480, 95, 45);
		btnEnter.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			
			themis.calculate(tfInput.getText(), isDegree);
			tfResult.setText(themis.getResult());
			frame.requestFocus();
			}	
		});
		btnEnter.setBackground(Color.orange);
		
		//BTN_DELALL
		//DELBTN
		btnClearAll = new JButton("DEL");
		btnClearAll.setBounds(350, 200, 65, 35);
		btnClearAll.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText("");
			tfResult.setText("");
			}	
		});
		btnClearAll.setBackground(Color.red);
		
		//BTN_ANS
		btnANS = new JButton("ANS");
		btnANS.setBounds(100, 240, 75, 35);
		btnANS.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfResult.getText());
			}	
		});
		btnANS.setBackground(Color.green);
		
//-------------------------------------------------------No more buttons-----------------------------------------------------------------
		//Adding of the components
		frame.add(tfInput);
		frame.add(tfResult);
		frame.add(lblInput);
		frame.add(lblResult);
		frame.add(lblVersion);
		frame.add(btnEnter);
		frame.add(btnClearAll);
		frame.add(btnANS);
	}
	
	public void RadioButtons(){
		JLabel askForCircleType = new JLabel("Radialmaﬂ oder Gradmaﬂ");
		
		JRadioButton radian = new JRadioButton("Radial", true);
		JRadioButton degree = new JRadioButton("Grad");
		
		radian.setBounds(100, 480, 100, 30);
		degree.setBounds(100, 505, 100, 30);
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(degree);
		group.add(radian);
		
		frame.add(askForCircleType);
		frame.add(degree);
		frame.add(radian);
		
		if (degree.isSelected() == true) {
			isDegree = true;
		}
		
	}
	
}
