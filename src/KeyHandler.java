import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

	//NOT NEEDED ANYMORE

public class KeyHandler implements KeyListener {
	
	Calculator calculator = new Calculator();
	public String typedInput, newTypedInput;
	

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {newTypedInput = "ENTER"; System.out.println("Pressed ENTER"); 
												 calculator.basicCalculation("3+3");}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {newTypedInput = "ENTER"; System.out.println("Released ENTER");}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar() == '!') {newTypedInput = "!"; newTypedInput = "ENTER";}
		
	}
	
	
}
