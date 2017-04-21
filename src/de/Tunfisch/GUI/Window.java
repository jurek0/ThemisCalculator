package de.Tunfisch.GUI;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import de.Tunfisch.EvalTable.EvalTable;
import de.Tunfisch.GUI.buttons.MathButtons;
import de.Tunfisch.GUI.buttons.NumberButtons;
import de.Tunfisch.GUI.buttons.OperatorButtons;
import de.Tunfisch.GUI.buttons.OtherButtons;
import de.Tunfisch.GUI.buttons.RadioButtons;
import de.Tunfisch.Themis2.ThemisParenthesesExtractor;
import de.Tunfisch.Themis2.ThemisSolver;
import de.Tunfisch.UserInput.Keylistener;

public class Window {

	//Version
	public JLabel lblVersion;
	
	//Frame
	public JFrame frame;
	
	//Number-Fields
	public JTextField tfInput;
	public JLabel lblInput;
	
	//Evaluation-Table
	public JTextField tfXMin, tfXMax, tfRes;
	public JLabel lblXMin, lblXMax, lblRes;
	public JTextArea evaluationTable;
	public JScrollPane scrollpane;
	
	//Ergebnisfeld
	public JTextField tfResult;
	public JLabel lblResult;
	
	//Buttons
	public JButton btnEnter, btnClearAll, btnANS, btnRESET, btnToggleGraph;
	
	//Version
	ApplicationVersion version = new ApplicationVersion();
	//Calculator
	ThemisSolver themis = new ThemisSolver();
	//Extractor
	ThemisParenthesesExtractor themisXtr = new ThemisParenthesesExtractor();
	//Radio Buttons
	RadioButtons rbuttons = new RadioButtons();
	//Evaluation Table
	EvalTable evtbl = new EvalTable();
	
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
		initialize();
		numberbtns.addNumberButtons(frame, tfInput, Color.white);
		opbtns.addOperatorButtons(frame, tfInput);
		mathbtns.addMathButtons(frame, tfInput);
		otherbtns.addOtherButtons(frame, tfInput, tfResult);
		klisten.CalculatorKeys(frame, tfInput, tfResult);
		rbuttons.createRadioButtons(frame);
	}

	public void initialize() {	
		
		//Frame
		frame = new JFrame("THEMISCALCULATOR " + version.getVersionnumber() + " " + version.getLang());
		frame.setBounds(0, 0, 800, 700);
		frame.setResizable(false);
		frame.setFocusable(true);
		frame.isAutoRequestFocus();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icon_new.png")));
		frame.getContentPane().setBackground(Color.gray);
		frame.getContentPane().setForeground(Color.gray);

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
		lblInput.setForeground(Color.white);
		
		//Result-Label 
		lblResult = new JLabel("Ergebnisfeld");
		lblResult.setBounds(100, 130, 300, 30);
		lblResult.setForeground(Color.white);
		
		//Version-Label
		lblVersion = new JLabel(version.getVersionnumber() + " " + version.getLang());
		lblVersion.setBounds(10, 620, 470, 40);
		lblVersion.setForeground(Color.white);
		
		//Xmin and Xmax
		tfXMin = new JTextField("-10");
		tfXMin.setBounds(500, 100, 60, 30);
		
		tfXMax = new JTextField("10");
		tfXMax.setBounds(580, 100, 60, 30);
		
		tfRes = new JTextField("1");
		tfRes.setBounds(660, 100, 60, 30);
		
		lblXMin = new JLabel("Xmin");
		lblXMin.setBounds(500, 70, 60, 30);
		lblXMin.setForeground(Color.white);
		
		lblXMax = new JLabel("Xmax");
		lblXMax.setBounds(580, 70, 60, 30);
		lblXMax.setForeground(Color.white);
		
		lblRes = new JLabel("Auflösung");
		lblRes.setBounds(660, 70, 60, 30);
		lblRes.setForeground(Color.white);
		
		//EVALUATIONTABLE
		evaluationTable = new JTextArea("                        Wertetabelle \n ==============================\n", 10, 2);
		
		//SCROLLPANE
		scrollpane = new JScrollPane(evaluationTable);
		scrollpane.setBounds(500, 150, 220, 375);
		
		//Buttons---------------------------------------------------------------------------------------------------------
		
		
		//BTN_ENTER============IMPORTANT
		btnEnter = new JButton("ENTER");
		btnEnter.setBounds(200, 480, 95, 45);
		btnEnter.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
			try {
				System.out.println("Window: Buttons are set to " + otherbtns.hiddenTF.getText());
				
				if (tfInput.getText().contains("X") || tfInput.getText().contains("x")) {
					//String contains x, try solving as a function
					System.out.println("Window: PRESSED ENTER, CALCULATING.....................");
					
					evtbl.setEvalTableInput(tfInput.getText(), Integer.parseInt(tfXMin.getText()), Integer.parseInt(tfXMax.getText()), Double.parseDouble(tfRes.getText()));
					evtbl.loopTBL(otherbtns.hiddenTF.getText());
					System.out.println(evtbl.getEvalTableX());
					System.out.println(evtbl.getEvalTableY());
					evaluationTable.setText("                        Wertetabelle \n ==============================\n"+evtbl.getFormattedResult());
					tfResult.setText("Output on evaluation table");
					
					System.out.println("Window: PRESSED ENTER, CALCULATING DONE!");
				}	else {
					//String does not contain any x, try solving as a normal calculation
					System.out.println("Window: PRESSED ENTER, CALCULATING.....................");
					themis.calculate(tfInput.getText(), otherbtns.hiddenTF.getText());
					tfResult.setText(themis.getResult());
					frame.requestFocus();
					System.out.println("Window: PRESSED ENTER, CALCULATING DONE!");
				}
			} catch (Exception e2) {
			  tfResult.setText("ERROR");
			  System.out.println("Window: An error occurreds");
			}
				
			}	
		});
		btnEnter.setBackground(Color.orange);
		
		//BTN_DELALL
		btnClearAll = new JButton("DEL");
		btnClearAll.setBounds(350, 200, 65, 35);
		btnClearAll.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText("");
			tfResult.setText("");
			evaluationTable.setText("                        Wertetabelle \n ==============================\n");
			}	
		});
		btnClearAll.setBackground(Color.red);
				
		//BTN_RESET
		btnRESET = new JButton("RST");
		btnRESET.setBounds(350, 430, 65, 45);
		btnRESET.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					themis.clearObj();
					themisXtr.clearObj();
				} catch (Exception e2) {
					System.out.println("Error: Nothing to delete");
				}
			}	
		});
		btnRESET.setBackground(Color.darkGray);
		btnRESET.setForeground(Color.white);
		
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
		frame.add(btnRESET);
		frame.add(tfXMax);
		frame.add(tfXMin);
		frame.add(tfRes);
		frame.add(lblXMin);
		frame.add(lblXMax);
		frame.add(lblRes);
		frame.add(scrollpane);
	}
	
}