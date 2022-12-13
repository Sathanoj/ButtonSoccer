package Game;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class windowGame extends JFrame{
	JPanel SCGame = new JPanel();
	
	public windowGame() {
		creatField();
	}
	public void creatField() {
		this.add(SCGame);
		SCGame.setLayout(null);
		
		this.setTitle("Field FUTEBOL!");
		this.setSize(900,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//	//Image back = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jonathas\\Documents\\Meu Inicio\\JAVA\\Client#Button\\img\\field.png");
//	//ButtonHeavy1 ButtonHeavy1 = new ButtonHeavy1();
//	
//	
//	public int x;
//	public int y;
//    Container c = getContentPane();
//    ButtonHeavy1 B = new ButtonHeavy1();
//	
//    JLabel botao = new JLabel();
//    JLabel label = new JLabel(); //JLabel Creation
//    
//	public windowGame() {
//		//testebotao();
//
//		editwindow();
//		
//
//	}
//    
//	public void testebotao() {
//		 //JLabel Creation
//	    botao.setIcon(new ImageIcon("img\\botao#teste.png"));
//		c.add(botao);
//        setVisible(true);
//	}
//	
//	
//
//	public void editwindow() {
//		setTitle("Client");
//		setSize(900,600);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLocationRelativeTo(null); //para a janela aparecer no centro
//		setResizable(false); //
//		setVisible(true);	//para a janbela ficar visivel
//		
//        
// //Gets the content layer
//        
//        
//        label.setIcon(new ImageIcon("img\\field.png")); //Sets the image to be displayed as an icon
//        Dimension size = label.getPreferredSize(); //Gets the size of the image
//        label.setBounds(0, 0, size.width, size.height); //Sets the location of the image
//        botao.setBounds(0, 0, 80, 80);
//        c.add(label); //Adds objects to the container
//        setVisible(true); // Exhibit the frame
//        
//        //c.add(ButtonHeavy1);
//	}

