package com.robocode.core;
import java.awt.*;
import java.awt.event.*;
/**
 * ºÚΩÈ£∫’Ω≥°¿‡
 */
public class BattleGround extends Frame{
	public static final int GROUND_WIDTH = 800;
	public static final int GROUND_HEIGHT = 600;
	
	public void ground(){
		this.setBackground(new Color(0,255,255));
		this.setSize(GROUND_WIDTH, GROUND_HEIGHT);
		this.setTitle("RoboCode");
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		this.setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args){
		BattleGround bg=new BattleGround();
		bg.ground();
	}
}
