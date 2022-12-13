package Client;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Game.windowGame;


public class clientMain extends JFrame implements ActionListener {
	
	JPanel firstSC = new JPanel();
	
	JLabel logo = new JLabel();
	JLabel campoI = new JLabel();
	JButton j2=new JButton("b");
	
	//Buttons in Client
	botoes playB = new botoes();
	botoes vestB = new botoes();
	botoes configB = new botoes();//new ImageIcon("img\\button_config.png")
	botoes shopB = new botoes();
	botoes sairB = new botoes();
	//Action's Button in Client
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==playB) {
			dispose();
			windowGame windowGame = new windowGame();
		}
		if(e.getSource()==sairB) {
			System.exit(0);
		}
		if(e.getSource()==shopB) {
			dispose();
			shop shop = new shop();
		}

	}
	public clientMain(){
		imgCM();
		buttonSC();
		this.add(firstSC);
		firstSC.setLayout(null);
		
		this.setTitle("Client - ButtonGame!");
		this.setSize(700,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); //para a janela aparecer no centro
		this.setVisible(true);	//para a janbela ficar visivel
	}
	public void imgCM() {
		add(logo);
		logo.setIcon(new ImageIcon("img\\logoprincipalP.png"));
		logo.setBounds(200, 0, 250, 90);
		add(campoI);
		campoI.setIcon(new ImageIcon("img\\telaPrincipal.png"));
		campoI.setBounds(200, 300, 400, 100);
	}
	public void buttonSC() {
		add(playB); //adicionando o botao
		playB.setText("PLAY");
		playB.setBounds(50, 100, 100, 60); //tamanho do botao 100=posicao x 300=posicao y 100=largura 60=ruptura do componente
		playB.addActionListener(this);
		
		add(vestB);
		vestB.setText("BUTTONs");
		vestB.setBounds(50, 180, 100, 60);
		vestB.addActionListener(this);
		
		//Button Config
		add(configB);
		configB.setText("CONFIG");
		configB.setBounds(50, 280, 100, 60);
	    configB.addActionListener(this);
		//setLayout(null);
		

		add(shopB);
		shopB.setText("SHOP");
		shopB.setBounds(50, 380, 100, 60);
		shopB.addActionListener(this);
		

		//Button Sair
	    add(sairB);
		sairB.setText("EXIT");
		sairB.setBounds(50, 480, 100, 60);
		sairB.addActionListener(this);
		//setLayout(null);
	}
}









/*	public void campoF(){
campoI.setIcon(new ImageIcon("img\\telaPrincipal.png"));
add(campoI);
setVisible(true);
campoI.setBounds(250, -100, 400, 100);
//campoI.setBounds(x, y, WIDTH, HEIGHT);
}*/



//JButton addBtn = new JButton("+");
//addBtn.setBounds(100, 380, 30, 25);
//// addBtn.setBorder(new Border(10)); //10 is the radius
//addBtn.setForeground(Color.BLUE);











