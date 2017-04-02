package de.Tunfisch.UserInput;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import de.Tunfisch.Themis2.ThemisSolver;

public class Keylistener {
	
	ThemisSolver themis = new ThemisSolver();

	public void CalculatorKeys(JFrame frame, JTextField tfInput, JTextField tfResult){
		
			frame.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			@Override
			public void keyReleased(KeyEvent e) {}	
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					themis.calculate(tfInput.getText(), false);
					tfResult.setText(themis.getResult());
					frame.requestFocus();
					}
				//THE STANDARD-LAYOUT-KEYS 
				if(e.getKeyCode() == KeyEvent.VK_0){
					tfInput.setText(tfInput.getText()+"0");
				}
				if(e.getKeyCode() == KeyEvent.VK_1){
					tfInput.setText(tfInput.getText()+"1");
				}
				if(e.getKeyCode() == KeyEvent.VK_2){
					tfInput.setText(tfInput.getText()+"2");
				}
				if(e.getKeyCode() == KeyEvent.VK_3){
					tfInput.setText(tfInput.getText()+"3");
				}
				if(e.getKeyCode() == KeyEvent.VK_4){
					tfInput.setText(tfInput.getText()+"4");
				}
				if(e.getKeyCode() == KeyEvent.VK_5){
					tfInput.setText(tfInput.getText()+"5");
				}
				if(e.getKeyCode() == KeyEvent.VK_6){
					tfInput.setText(tfInput.getText()+"6");
				}
				if(e.getKeyCode() == KeyEvent.VK_7){
					tfInput.setText(tfInput.getText()+"7");
				}
				if(e.getKeyCode() == KeyEvent.VK_8){
					tfInput.setText(tfInput.getText()+"8");
				}
				if(e.getKeyCode() == KeyEvent.VK_9){
					tfInput.setText(tfInput.getText()+"9");
				}
				if(e.getKeyCode() == KeyEvent.VK_E){
					tfInput.setText(tfInput.getText()+"e");
				}
				
				if(e.getKeyCode() == KeyEvent.VK_DELETE){
					tfInput.setText("");
					tfResult.setText("");
				}
				if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
					try{
					tfInput.setText(tfInput.getText().substring(0, tfInput.getText().length()-1));
					}catch (Exception ex){
						System.out.println("No more chars to remove");
					}
				}
				if(e.getKeyCode() == KeyEvent.VK_PLUS){
					tfInput.setText(tfInput.getText()+"+");
				}
				if(e.getKeyCode() == KeyEvent.VK_MINUS){
					tfInput.setText(tfInput.getText()+"-");
				}
				
				//THE NUMBLOCK-KEYS
				if(e.getKeyCode() == KeyEvent.VK_NUMPAD0){
					tfInput.setText(tfInput.getText()+"0");
				}
				if(e.getKeyCode() == KeyEvent.VK_NUMPAD1){
					tfInput.setText(tfInput.getText()+"1");
				}
				if(e.getKeyCode() == KeyEvent.VK_NUMPAD2){
					tfInput.setText(tfInput.getText()+"2");
				}
				if(e.getKeyCode() == KeyEvent.VK_NUMPAD3){
					tfInput.setText(tfInput.getText()+"3");
				}
				if(e.getKeyCode() == KeyEvent.VK_NUMPAD4){
					tfInput.setText(tfInput.getText()+"4");
				}
				if(e.getKeyCode() == KeyEvent.VK_NUMPAD5){
					tfInput.setText(tfInput.getText()+"5");
				}
				if(e.getKeyCode() == KeyEvent.VK_NUMPAD6){
					tfInput.setText(tfInput.getText()+"6");
				}
				if(e.getKeyCode() == KeyEvent.VK_NUMPAD7){
					tfInput.setText(tfInput.getText()+"7");
				}
				if(e.getKeyCode() == KeyEvent.VK_NUMPAD8){
					tfInput.setText(tfInput.getText()+"8");
				}
				if(e.getKeyCode() == KeyEvent.VK_NUMPAD9){
					tfInput.setText(tfInput.getText()+"9");
				}
				if(e.getKeyCode() == KeyEvent.VK_DIVIDE){
					tfInput.setText(tfInput.getText()+"/");
				}
				if(e.getKeyCode() == KeyEvent.VK_MULTIPLY){
					tfInput.setText(tfInput.getText()+"*");
				}
				if(e.getKeyCode() == KeyEvent.VK_SUBTRACT){
					tfInput.setText(tfInput.getText()+"-");
				}
				if(e.getKeyCode() == KeyEvent.VK_ADD){
					tfInput.setText(tfInput.getText()+"+");
				}
			}
		});
	}
}
