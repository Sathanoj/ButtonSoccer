package Game;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import team1.ButtonHeavy1;


public class windowGame extends javax.swing.JFrame {
	
	//Image back = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jonathas\\Documents\\Meu Inicio\\JAVA\\Client#Button\\img\\field.png");
	//ButtonHeavy1 ButtonHeavy1 = new ButtonHeavy1();
	
    Container c = getContentPane();
	
    JLabel botao = new JLabel();
    JLabel label = new JLabel(); //JLabel Creation
    
	public void testebotao() {
		 //JLabel Creation
	    botao.setIcon(new ImageIcon("img\\botao#teste.png"));
		c.add(botao);
        setVisible(true);
	}
	
	public windowGame(){
		testebotao();
		editwindow();

	}

	public void editwindow() {
		setTitle("Client");
		setSize(900,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); //para a janela aparecer no centro
		setResizable(false); //
		setVisible(true);	//para a janbela ficar visivel
		
        
 //Gets the content layer
        
        
        label.setIcon(new ImageIcon("img\\field.png")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(0, 0, size.width, size.height); //Sets the location of the image
        botao.setBounds(0, 0, 80, 80);
        c.add(label); //Adds objects to the container
        setVisible(true); // Exhibit the frame
        
        //c.add(ButtonHeavy1);
	}
	
}
