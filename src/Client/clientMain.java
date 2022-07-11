package Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Game.windowGame;

public class clientMain extends JFrame implements ActionListener{
	
	
	//Buttons in Client
	JButton play = new JButton("Play");
	JButton config = new JButton("Config");
	JButton shop = new JButton("Shop");
	JButton sair = new JButton("Exit");
	
	//Action's Button in Client
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==play) {
			dispose();
			windowGame windowGame = new windowGame();
		}
		if(e.getSource()==sair) {
			System.exit(0);
		}
		if(e.getSource()==shop) {
			shop shop = new shop();
		}

	}
	
	
	public clientMain(){
		
		//Button Play
		play.addActionListener(this);
		
		setLayout(null);
		play.setBounds(100, 100, 100, 60); //tamanho do botao 100=posicao x 300=posicao y 100=largura 60=ruptura do componente
		add(play); //adicionando o botao
		
		
		//Button Config
		setLayout(null);
		config.setBounds(100, 200, 100, 60);
		add(config);

		shop.addActionListener(this);
		
		setLayout(null);
		shop.setBounds(100, 300, 100, 60);
		add(shop);
		
		//Button Sair
		sair.addActionListener(this);
		
		setLayout(null);
		sair.setBounds(100, 400, 100, 60);
		add(sair);
		
		//JFrame window = new JFrame();
		setTitle("Client");
		setSize(700,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); //para a janela aparecer no centro
		setResizable(false); //
		setVisible(true);	//para a janbela ficar visivel
	}
}