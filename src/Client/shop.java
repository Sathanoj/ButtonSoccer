package Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class shop extends JFrame implements ActionListener {

	JPanel panelShop = new JPanel();
	
    JLabel logoshop = new JLabel(); 
    
	botoes back = new botoes();
	
	JTextField Saldo= new JTextField("Saldo: ");
	private int valor = 0;
	//imagens
	
	

	
	public shop() {
		frameShop();

	}
	public void frameShop() {
		buttonSHOP();
		imgLayoutShop();
		
		this.add(panelShop);
		panelShop.setLayout(null);
		
		this.setTitle("Client - SHOP");
		this.setSize(700,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public void imgLayoutShop() {
	    logoshop.setIcon(new ImageIcon("img\\Shop.png"));
		add(logoshop);
		logoshop.setBounds(250,40,200,100); //2 primeiros posição 2 ultimos tamanho
		
		

		add(Saldo);
		Saldo.setBounds(250,200,70,40);
		Saldo.setEditable(false);


	}
	
	public void buttonSHOP() {
		add(back);
		back.setText("BACK");
		back.setBounds(250, 485, 80, 30);
		back.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			dispose(); //pra fechar a janela anterior
			clientMain clientMain = new clientMain();
		}

	}
	
	
	
	
	
	
	
	
	
}
