package Client;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class shop  extends JFrame {
	
	JButton next = new JButton("Next");
	JButton back = new JButton("Back");
	
	
	public shop() {
		setSize(700,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	
	public void botoes() {
		next.addActionListener(this);

		setLayout(null);
		next.setBounds(100, 300, 100, 60);
		add(next);
		
		//Button Sair
		back.addActionListener(this);
		
		setLayout(null);
		back.setBounds(100, 400, 100, 60);
		add(back);
	}
	
}
