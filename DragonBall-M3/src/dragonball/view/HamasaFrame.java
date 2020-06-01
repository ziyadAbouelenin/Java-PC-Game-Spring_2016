package dragonball.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HamasaFrame extends JFrame{
		private JButton l;
		private JButton b;
		private JLabel bg;
		
	public HamasaFrame(){
		l = new JButton("Start game");
		b = new JButton("Load");
		bg = new JLabel();
		
		l.setOpaque(true);
		
		setLayout(null);
		
		setTitle("Dragon Ball");
		setSize(1500,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l.setBounds(700,200,100,20);
		b.setBounds(700,290,100,20);
		bg.setBounds(0,0,1400,800);
		
		
		getContentPane().setBackground(Color.green);
		getContentPane().add(l);
		getContentPane().add(b);
		getContentPane().add(bg);
		
		
		l.setBackground(Color.white);
		b.setBackground(Color.white);
		l.setForeground(Color.black);
		b.setForeground(Color.black);
		bg.setIcon(new ImageIcon("rsz_652775.png"));
		
	}
	public JButton getB() {
		return b;
	}
	public static void main(String[] args){
		HamasaFrame h = new HamasaFrame();
		h.setVisible(true);
	}
}
