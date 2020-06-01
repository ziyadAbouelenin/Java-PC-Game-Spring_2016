package dragonball.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class map extends JFrame{
	private JPanel p;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel bg;
	private JButton[][] b;
	
	public map(){
		setTitle("Dragon ball");
		setSize(1500,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//getContentPane().setBackground(Color.black);

		p = new JPanel();
		p.setBounds(0,90,1350,600);
		getContentPane().add(p);
		p.setOpaque(false);
		p.setLayout(new GridLayout(10,10));
		add(p,BorderLayout.CENTER);
		
		b = new JButton[12][12];
		
		for(int x=0; x<10; x++){
			for(int y=0; y<10; y++){
				b[x][y] = new JButton();
				b[x][y].setContentAreaFilled(false);
				b[x][y].setBorderPainted(true);
				b[x][y].setBorder(BorderFactory
						.createLineBorder(Color.WHITE));
				p.add(b[x][y]);
		}
		add(p);
	}
		
		
		l1 = new JLabel("Name :");
		l1.setBounds(50,0,50,50);
		l1.setForeground(Color.black);
		getContentPane().add(l1);
		
		l2 = new JLabel("Fighter :");
		l2.setBounds(50,12,50,62);
		l2.setForeground(Color.black);
		getContentPane().add(l2);
		
		l3 = new JLabel("Name :");
		l3.setBounds(850,0,50,50);
		l3.setForeground(Color.black);
		getContentPane().add(l3);
		
		l4 = new JLabel("Fighter :");
		l4.setBounds(850,12,50,62);
		l4.setForeground(Color.black);
		getContentPane().add(l4);
		
		bg = new JLabel();
		getContentPane().add(bg);
		bg.setIcon(new ImageIcon("bl.jpg"));
	}
	
	public static void main(String[] args){
		map m = new map();
		m.setVisible(true);
	}
}
