package dragonball.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame1 extends JFrame{
	private JTextField t;
	private JTextField l;
	private JLabel  a;
	private JLabel  f;
	private JLabel  bg;
	private JButton j1;
	private JButton j2;
	private JButton j3;
	private JButton j4;
	private JButton j5;
	private JLabel  ll;
	
	public Frame1(){
		setTitle("Dragon ball");
		setSize(1400,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		 t = new JTextField();
		 l = new JTextField();
		 a = new JLabel("Your Name :");
		 f = new JLabel("Fighter's name :");
		bg = new JLabel();
		j1 = new JButton("Earthling");
		j2 = new JButton("Saiyan");
		j3 = new JButton("Namekian");
		j4 = new JButton("Frieza");
		j5 = new JButton("Majin");
		ll = new JLabel("Choose your Character :");
		
		//j1.setOpaque(true);
		//j2.setOpaque(true);
		//j3.setOpaque(true);
	//	j4.setOpaque(true);
		//j5.setOpaque(true);
		
		//setLayout(null);
		
		 t.setBounds(650,200,100,20);
		 l.setBounds(650,290,100,20);
		 a.setBounds(500,200,150,20);
		 f.setBounds(500,290,150,20);
		bg.setBounds(0,0,1400,800);
		j1.setBounds(150,200,165,30);
		j2.setBounds(150,290,165,30);
		j3.setBounds(150,380,165,30);
		j4.setBounds(150,470,165,30);
		j5.setBounds(150,560,165,30);
		ll.setBounds(120,110,165,30);
		
		getContentPane().add(t);
		getContentPane().add(l);
		getContentPane().add(a);
		getContentPane().add(f);
		getContentPane().add(bg);
		getContentPane().add(j1);
		getContentPane().add(j2);
		getContentPane().add(j3);
		getContentPane().add(j4);
		getContentPane().add(j5);
		getContentPane().add(ll);
		
		t.setBackground(Color.white);
		l.setBackground(Color.white);
		j1.setBackground(Color.white);
		j2.setBackground(Color.white);
		j3.setBackground(Color.white);
		j4.setBackground(Color.white);
		j5.setBackground(Color.white);
		
		 a.setForeground(Color.black);
		 f.setForeground(Color.black);
		j1.setForeground(Color.black);
		j2.setForeground(Color.black);
		j3.setForeground(Color.black);
		j4.setForeground(Color.black);
		j5.setForeground(Color.black);
		ll.setForeground(Color.black);
		
		bg.setIcon(new ImageIcon("rsz_mystic_gohan_powers_up__dbkai_by_2d75-d39y1xe.jpg"));
		
	}
	public static void main(String[] args){
		Frame1 f = new Frame1();
		f.setVisible(true);
	}
}