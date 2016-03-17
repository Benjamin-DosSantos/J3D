package com.blackpensoftware.j3d.core;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class TestCode extends Applet{
	public void paint(Graphics g){
		
		int startPosition = 100;
		
		int xPos[] = {startPosition + 150, startPosition + 120, startPosition, startPosition + 100, startPosition + 75, startPosition + 150, startPosition + 220, startPosition + 200, startPosition + 300, startPosition + 180};
		int yPos[] = {startPosition - 100, startPosition + 50, startPosition + 50, startPosition + 150, startPosition + 300, startPosition + 210, startPosition + 300, startPosition + 150, startPosition + 50, startPosition + 50};

		
		J3D.fill3DRect(g, 200, 400, 300, 600, 60, 50, Color.ORANGE, Color.CYAN);
	}
}
