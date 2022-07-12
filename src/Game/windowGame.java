package Game;


import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import team1.ButtonLight1;

public class windowGame extends javax.swing.JFrame{
	
	//Image back = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jonathas\\Documents\\Meu Inicio\\JAVA\\Client#Button\\img\\field.png");
	
	public windowGame(){ 
		setTitle("Client");
		setSize(900,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); //para a janela aparecer no centro
		setResizable(false); //
		setVisible(true);	//para a janbela ficar visivel
		
        
        Container c = getContentPane(); //Gets the content layer
        
        JLabel label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("img\\field.png")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(0, 0, size.width, size.height); //Sets the location of the image
        
        c.add(label); //Adds objects to the container
        setVisible(true); // Exhibit the frame

	}

	

	
}
