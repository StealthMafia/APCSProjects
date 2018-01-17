/**
 * CafeWall.java
 * Assignment: Cafe Wall
 * Purpose: To learn to use DrawingPanel in an assignment involving various parameters that create optical illusion naturally
 *
 * @version 12/04/17
 */
package Graphics;

import java.awt.*;

public class CafeWall {

	// This is the main method, including all of the various illusions that will be drawn//
	public static void main(String[] args) {
		DrawingPanel cafe = new DrawingPanel(650, 400);
		Graphics g = cafe.getGraphics();
		cafe.setBackground(Color.gray);
		neoPill(g,0,0,20,4);
		neoPill(g,50,70,30,5);
		neoSquaredPill(g,10,150,25,4,0,8);
		neoSquaredPill(g,250,200,25,3,10,6);
		neoSquaredPill(g,425,180,20,5,10,10);
		neoSquaredPill(g,400,20,35,2,35,4);


	}
	// This method describes the duties of the pill method //
	public static void pill (Graphics g, int x, int y, int size) {
		g.setColor(Color.BLACK);
		g.fillRect(x,y,size,size);
		g.setColor(Color.WHITE);
		g.fillRect(x + size,y,size,size);
		g.setColor(Color.BLUE);
		g.drawLine(x,y,x + size,y + size);
		g.drawLine(x + size,y,x,y + size);
	}

	// This method describes the neoPill method, which introduced a for loop to tackle the newer more complicated integers such as couples //
	public static void neoPill (Graphics g, int x, int y, int size, int couples){
		for (int i = 0; i < couples; i++){ 
			pill(g,x + i * size * 2,y,size);
		}
	}

	// Offset indicates the the back and forth motion between x positions in the various franchise starting points //
	// Franchises are the individual rows, in which case here there are 8 //
	// This method entails an illusion with columns and rows that need to be accounted for in the coding //
	public static void neoSquaredPill (Graphics g, int x, int y, int size, int couples, int offset, int franchises){
		for (int i = 0; i < franchises; i++){ 
			neoPill(g,x + offset * (i % 2),y + i * (size + 2),size,couples);
		}
	}
}