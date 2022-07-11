package team1;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ButtonLight1 {

	private int vel;
	private int direction;
	
	public void icon() {
		
		Container cont = getContentPane();
		
		JLabel iconB = new JLabel();
		iconB.setIcon(new ImageIcon("C:\\Users\\Jonathas\\Documents\\Meu Inicio\\JAVA\\Client#Button\\img\\botao#teste.png"));
		Dimension size = iconB.getPreferredSize();
		iconB.setBounds(0, 0, size.width, size.height);
		
		cont.add(iconB);
		//setVisible(true);
	}
	
	private Container getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

	public void collision() {
		
	}
	
	public void moving() {
		
	}
	
	
}
