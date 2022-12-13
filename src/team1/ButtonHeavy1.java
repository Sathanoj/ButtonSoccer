package team1;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonHeavy1 extends JFrame {
	
	public int x;
	
	public ImageIcon botaoPalmeiras = new ImageIcon(getClass().getResource("img\\botao#teste.png"));
	
	JLabel botaoP = new JLabel(botaoPalmeiras);
	
	public ButtonHeavy1() {
		botaoP.setBounds(100, 200, 80, 80);
		add(botaoP);
		setVisible(true);
	}

}