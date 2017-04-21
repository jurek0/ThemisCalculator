package de.Tunfisch.GUI;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VersionInfo {

	public JFrame frame;
	public JLabel label, pic;
	public ApplicationVersion version = new ApplicationVersion();
	
	public void start(){
		VersionInfo window = new VersionInfo();
		window.frame.setVisible(true);
	}
	
	public VersionInfo(){
		initialize();
	}

	public void initialize() {
		frame = new JFrame("INFO - THEMISCALCULATOR " + version.getVersionnumber() + " " + version.getLang());
		frame.setBounds(100, 100, 300, 300);
		frame.setResizable(false);
		frame.setFocusable(true);
		frame.isAutoRequestFocus();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icon_new.png")));
		
	
		label = new JLabel();
		label.setText("<html><body><h4>Themiscalculator der Version "+ version.getVersionnumber() +"<br>"
				+ "Autor: " + version.getAuthor()+ "<h5><br>Enth�lt teilweise experimentellen Code.<br>Features wie Funktions/Wertetabellenberechnung befinden "
				+ "sich noch im experimentellen/debug-<br>Stadium, die Benutzung kann fehlerbehaftet sein.<br>Bekannte Bugs: <br>"
				+ "-No-Click-Tastatureingabe nicht m�glich, wenn zuvor ein Button gedr�ckt wurde.<br>"
				+ "</h5></body></html>");
		label.setBounds(10, 20, 260, 280);
		
		pic = new JLabel();
		pic.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icon_new.png")));
		pic.setSize(54, 54);
		pic.setBounds(120, 5, 64, 64);
		
		frame.add(pic);
		frame.add(label);
		
	}
}