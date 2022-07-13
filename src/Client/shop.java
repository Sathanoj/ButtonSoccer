package Client;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class shop extends JFrame implements ActionListener {
	//botoes 
	JButton next = new JButton("Next");
	JButton back = new JButton("Back");
	
	//imagens
	
	

	
	public shop() {
		buttonAscreen();
	}
	Container c = getContentPane();
	
	
	public void buttonAscreen() {
		
		//img do logo
	    JLabel logoshop = new JLabel(); //JLabel Creation
	    logoshop.setIcon(new ImageIcon("img\\Shop.png"));
		next.addActionListener(this);
		c.add(logoshop);
		logoshop.setBounds(250,40,200,100); //2 primeiros posição 2 ultimos tamanho
		
		
		//Buttons 
		setLayout(null);
		next.setBounds(250, 300, 100, 60);
		add(next);
		
		//Button Sair
		back.addActionListener(this);
		
		setLayout(null);
		back.setBounds(250, 485, 80, 30);
		add(back);
		
		
		setTitle("SHOP");
		setSize(700,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			dispose(); //pra fechar a janela anterior
			clientMain clientMain = new clientMain();
		}
		if(e.getSource()==next) {
			//Slide de pag para cada produto vendido.
		}
	}
	
}
