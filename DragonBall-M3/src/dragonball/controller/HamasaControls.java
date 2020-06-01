package dragonball.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dragonball.view.Frame1;
import dragonball.view.HamasaFrame;

public class HamasaControls implements ActionListener{

	private static ActionEvent e;
	private HamasaFrame x ;
	private Frame1 y;
	
	public HamasaControls(){
		x = new HamasaFrame();
		x.setVisible(true);
		x.getB().addActionListener(this);
		
		y = new Frame1();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Start game"))
			//y.setVisible(true);
		y.setVisible(true);
	}
	
	public static void main(String[]args){
		HamasaControls y = new HamasaControls();
		y.actionPerformed(e);
	}
	
}