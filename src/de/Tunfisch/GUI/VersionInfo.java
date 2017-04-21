package de.Tunfisch.GUI;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VersionInfo {

	public JFrame frame;
	public JLabel label, pic, tut;
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
		frame.setBounds(0, 0, 1300, 700);
		frame.setResizable(false);
		frame.setFocusable(true);
		frame.isAutoRequestFocus();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icon_new.png")));
		
	
		label = new JLabel();
		label.setText("<html><body><h4>Themiscalculator der Version "+ version.getVersionnumber() +"<br>"
				+ "Autor: " + version.getAuthor()+ "<h5><br>Bekannte Bugs: <br>"
				+ "-No-Click-Tastatureingabe nicht möglich, wenn zuvor ein Button gedrückt wurde.<br>"
				+ "-Fehler bei der Verwendung von '-' als Prefix für negative Zahlen. Bitte 'neg' verwenden." 
				+ "</h5></body></html>");
		label.setBounds(10, 20, 260, 280);
		
		pic = new JLabel();
		pic.setIcon(new ImageIcon(getClass().getClassLoader().getResource("icon_new.png")));
		pic.setSize(54, 54);
		pic.setBounds(120, 5, 64, 64);
		
		tut = new JLabel();
		tut.setIcon(new ImageIcon(getClass().getClassLoader().getResource("tutorial.png")));
		tut.setSize(1000, 700);
		tut.setBounds(300, 0, 1000, 700);
		
		frame.add(pic);
		frame.add(tut);
		frame.add(label);
		
	}
}