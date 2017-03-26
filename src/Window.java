import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import de.Tunfisch.Themis.ThemisSolver;

public class Window {

	//Version
	public JLabel lblVersion;
	//Frame
	public JFrame frame;
	
	// Number-Fields
	public JTextField tfInput;
	public JLabel lblInput;
	
	// Ergebnisfeld
	public JTextField tfResult;
	public JLabel lblResult;
	
	//Operator
	public JLabel lblUsedOperator;
	public String usedOP = null;

	
	//Buttons
	public JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;  // CHECK
	public JButton btnMultiply, btnDivide, btnPlus, btnMinus, btnNegate, btnComma;  //CHECK
	public JButton btnLN, btnLOG, btnPOW, btnSIN, btnCOS, btnTAN, btnE, btnPI, btnRADIX;   //CHECK
	public JButton btnBracketOpen, btnBracketClose;                                     //CHECK
	public JButton btnBackspace, btnClearAll, btnShutdown, btnEnter, btnANS;
	
	//Calculator
	Calculator Calculation = new Calculator();
	largeCalculationHandler LCHandler = new largeCalculationHandler();
	longChain longCalc = new longChain();
	ThemisSolver themis = new ThemisSolver();
	
	
	public void start() {
		Window window = new Window();
		window.frame.setVisible(true);
	}	
	public Window(){
		initialize("DE-25.03.17-0.8-alpha, with THEMIS BY IGOR DAS TUNFISCH");
	}

	public void initialize(String versionnumber) {	
		
		//Frame
		frame = new JFrame("Taschenrechner " + versionnumber );
		frame.setBounds(0, 0, 500, 700);
		frame.setResizable(false);
		frame.setFocusable(true);
		frame.requestFocus();
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
		lblVersion.setBounds(10, 640, 500, 40);
		
		//Buttons---------------------------------------------------------------------------------------------------------
		btn7 = new JButton("7");
		btn7.setBounds(100, 280, 45, 45);
		btn7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"7");			
			}	
		});
		btn8 = new JButton("8");
		btn8.setBounds(150, 280, 45, 45);
		btn8.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"8");
			}	
		});
		btn9 = new JButton("9");
		btn9.setBounds(200, 280, 45, 45);
		btn9.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"9");
			}	
		});
		btn4 = new JButton("4");
		btn4.setBounds(100, 330, 45, 45);
		btn4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"4");
			}	
		});
		btn5 = new JButton("5");
		btn5.setBounds(150, 330, 45, 45);
		btn5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"5");
			}	
		});
		btn6 = new JButton("6");
		btn6.setBounds(200, 330, 45, 45);
		btn6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"6");
			}
		});
		btn1 = new JButton("1");
		btn1.setBounds(100, 380, 45, 45);
		btn1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"1");
			}	
		});
		btn2 = new JButton("2");
		btn2.setBounds(150, 380, 45, 45);
		btn2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"2");
			}	
		});
		btn3 = new JButton("3");
		btn3.setBounds(200, 380, 45, 45);
		btn3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"3");
			}	
		});
		btn0 = new JButton("0");
		btn0.setBounds(150, 430, 45, 45);
		btn0.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"0");
			}	
		});
		btnPlus = new JButton("+");
		btnPlus.setBounds(250, 280, 45, 45);
		btnPlus.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"+");
			}	
		});
		btnMinus = new JButton("-");
		btnMinus.setBounds(250, 330, 45, 45);
		btnMinus.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"-");
			}	
		});
		btnMultiply = new JButton("*");
		btnMultiply.setBounds(250, 380, 45, 45);
		btnMultiply.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"*");
			}	
		});
		btnDivide = new JButton("/");
		btnDivide.setBounds(250, 430, 45, 45);
		btnDivide.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"/");
			}	
		});
		btnNegate = new JButton(".-");
		btnNegate.setBounds(200, 430, 45, 45);
		btnNegate.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"-");
			}	
		});
		btnComma = new JButton(".");
		btnComma.setBounds(100, 430, 45, 45);
		btnComma.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+".");
			}	
		});
		btnEnter = new JButton("ENTER");
		btnEnter.setBounds(200, 480, 95, 45);
		btnEnter.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			//Calculation.basicCalculation(tfInput.getText());
			//tfResult.setText(Calculation.getTextResult());
			themis.calculate(tfInput.getText());
			frame.requestFocus();
			}	
		});
		btnBackspace = new JButton("<-");
		btnBackspace.setBounds(300, 280, 45, 45);
		btnBackspace.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					tfInput.setText(tfInput.getText().substring(0, tfInput.getText().length()-1));
				} catch (Exception e1) {
					System.out.println("No more characters to remove");
				}
			//SHORTEN CHAIN BY ONE HERE
			}
		});
		btnLN = new JButton("ln");
		btnLN.setBounds(300, 330, 45, 45);
		btnLN.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"ln(");
			}	
		});
		btnLOG = new JButton("lg");
		btnLOG.setBounds(300, 380, 45, 45);
		btnLOG.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"log(");
			}	
		});
		btnPOW = new JButton("^");
		btnPOW.setBounds(300, 430, 45, 45);
		btnPOW.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"^(");
			}	
		});
		btnRADIX = new JButton("\u221a");
		btnRADIX.setBounds(300, 480, 45, 45);
		btnRADIX.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"rad(");
			}
		});
		
		
		//Buttons in row at top-------------------------------
		btnSIN = new JButton("sin");
		btnSIN.setBounds(100, 200, 55, 35);
		btnSIN.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"sin(");
			}	
		});
		btnCOS = new JButton("cos");
		btnCOS.setBounds(160, 200, 55, 35);
		btnCOS.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"cos(");
			}	
		});
		btnTAN = new JButton("tan");
		btnTAN.setBounds(220, 200, 55, 35);
		btnTAN.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"tan(");
			}	
		});
		btnANS = new JButton("ANS");
		btnANS.setBounds(100, 240, 75, 35);
		btnANS.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfResult.getText());
			}	
		});
		btnBracketOpen = new JButton("(");
		btnBracketOpen.setBounds(180, 240, 45, 35);
		btnBracketOpen.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"(");
			}	
		});
		btnBracketClose = new JButton(")");
		btnBracketClose.setBounds(230, 240, 45, 35);
		btnBracketClose.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+")");
			}
		});
		btnPI = new JButton("PI");
		btnPI.setBounds(280, 240, 65, 35);
		btnPI.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"PI");
			}	
		});
		btnE = new JButton("e");
		btnE.setBounds(280, 200, 65, 35);
		btnE.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText(tfInput.getText()+"e");
			}	
		});
		btnClearAll = new JButton("DEL");
		btnClearAll.setBounds(350, 200, 65, 35);
		btnClearAll.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			tfInput.setText("");
			tfResult.setText("");
			}	
		});
//Coloring Buttons
		btnPlus.setBackground(Color.orange);
		btnMinus.setBackground(Color.orange);
		btnMultiply.setBackground(Color.orange);
		btnDivide.setBackground(Color.orange);
		btnEnter.setBackground(Color.orange);
		
		btnSIN.setBackground(Color.green);
		btnCOS.setBackground(Color.green);
		btnTAN.setBackground(Color.green);
		btnLOG.setBackground(Color.green);
		btnLN.setBackground(Color.green);
		btnPOW.setBackground(Color.green);
		btnE.setBackground(Color.green);
		btnPI.setBackground(Color.green);
		btnRADIX.setBackground(Color.green);
		btnBracketClose.setBackground(Color.green);
		btnBracketOpen.setBackground(Color.green);
		
		btnANS.setBackground(Color.green);
		btnBackspace.setBackground(Color.red);
		btnClearAll.setBackground(Color.red);
		
		
//-------------------------------------------------------No more buttons-----------------------------------------------------------------
		//Adding of the components
		frame.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			@Override
			public void keyReleased(KeyEvent e) {}	
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					Calculation.basicCalculation(tfInput.getText());
					tfResult.setText(Calculation.getTextResult());
					frame.requestFocus();
					}
				if(e.getKeyCode() == KeyEvent.VK_0){
					tfInput.setText(tfInput.getText()+"0");
					longCalc.addToChain("0");
				}
				if(e.getKeyCode() == KeyEvent.VK_1){
					tfInput.setText(tfInput.getText()+"1");
					longCalc.addToChain("1");
				}
				if(e.getKeyCode() == KeyEvent.VK_2){
					tfInput.setText(tfInput.getText()+"2");
					longCalc.addToChain("2");
				}
				if(e.getKeyCode() == KeyEvent.VK_3){
					tfInput.setText(tfInput.getText()+"3");
					longCalc.addToChain("3");
				}
				if(e.getKeyCode() == KeyEvent.VK_4){
					tfInput.setText(tfInput.getText()+"4");
					longCalc.addToChain("4");
				}
				if(e.getKeyCode() == KeyEvent.VK_5){
					tfInput.setText(tfInput.getText()+"5");
					longCalc.addToChain("5");
				}
				if(e.getKeyCode() == KeyEvent.VK_6){
					tfInput.setText(tfInput.getText()+"6");
					longCalc.addToChain("6");
				}
				if(e.getKeyCode() == KeyEvent.VK_7){
					tfInput.setText(tfInput.getText()+"7");
					longCalc.addToChain("7");
				}
				if(e.getKeyCode() == KeyEvent.VK_8){
					tfInput.setText(tfInput.getText()+"8");
					longCalc.addToChain("8");
				}
				if(e.getKeyCode() == KeyEvent.VK_9){
					tfInput.setText(tfInput.getText()+"9");
					longCalc.addToChain("9");
				}
				if(e.getKeyCode() == KeyEvent.VK_DELETE){
					tfInput.setText("");
					tfResult.setText("");
					longCalc.clearChain();
				}
				if(e.getKeyCode() == KeyEvent.VK_PLUS){
					tfInput.setText(tfInput.getText()+"+");
					longCalc.addToChain("+");
				}
				if(e.getKeyCode() == KeyEvent.VK_MINUS){
					tfInput.setText(tfInput.getText()+"-");
					longCalc.addToChain("-");
				}
				if(e.getKeyCode() == KeyEvent.VK_DIVIDE){
					tfInput.setText(tfInput.getText()+"/");
					longCalc.addToChain("/");
				}
				if(e.getKeyCode() == KeyEvent.VK_MULTIPLY){
					tfInput.setText(tfInput.getText()+"*");
					longCalc.addToChain("*");
				}
				if(e.getKeyCode() == KeyEvent.VK_SPACE){
					themis.calculate(tfInput.getText());
				}
			}
		});
		frame.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				frame.requestFocus();	
			}
			@Override
			public void mouseDragged(MouseEvent e) {}
		});
		tfInput.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				tfInput.requestFocus();	
			}
			@Override
			public void mouseDragged(MouseEvent e) {}
		});
		frame.add(tfInput);
		frame.add(tfResult);
		frame.add(lblInput);
		frame.add(lblResult);
		frame.add(lblVersion);
		frame.add(btnANS);
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
		frame.add(btnPlus);
		frame.add(btnMinus);
		frame.add(btnMultiply);
		frame.add(btnDivide);
		frame.add(btnNegate);
		frame.add(btnComma);
		frame.add(btnEnter);
		frame.add(btnBackspace);
		frame.add(btnLN);
		frame.add(btnLOG);
		frame.add(btnPOW);
		frame.add(btnBracketOpen);
		frame.add(btnBracketClose);
		frame.add(btnRADIX);
		frame.add(btnSIN);
		frame.add(btnCOS);
		frame.add(btnTAN);
		frame.add(btnPI);
		frame.add(btnE);
		frame.add(btnClearAll);
		
	}
	
}