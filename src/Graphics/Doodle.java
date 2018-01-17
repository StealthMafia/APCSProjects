package Graphics;

import java.awt.*;

public class Doodle {

	public static void main(String[] args) {
		DrawingPanel cafe = new DrawingPanel(650, 400);
		Graphics g = cafe.getGraphics();
		cafe.setBackground(Color.gray);

		g.setColor(Color.RED);
		g.fillOval(200,170,50,50);
		g.fillOval(400,170,50,50);

		g.setColor(Color.MAGENTA);
		g.fillOval(300,170,50,50);
	}

}
