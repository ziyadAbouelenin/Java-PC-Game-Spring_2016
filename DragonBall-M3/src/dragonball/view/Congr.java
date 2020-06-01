package dragonball.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Congr extends JFrame{
	private JLabel ll;
	
	public Congr(){
		setTitle("Congratulations !");
		setBounds(500,300,300,150);
		getContentPane().setBackground(Color.magenta);
		
		ll = new JLabel("Congratulations, you won the battle !");
		ll.setBounds(250,150,150,75);
		ll.setForeground(Color.black);
		getContentPane().add(ll);
	}
	public static void main(String[] args){
		Congr c = new Congr();
		c.setVisible(true);
	}
}
