package homework;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class homework extends JPanel {
	
	void drawMan(Graphics g,int x,int y, Color c, int size) {
		g.setColor(c);
		g.drawOval(x-30, y-0, 2*size/15,2*size/15);
		g.drawLine(x, y+2*size/15,x, y + 7 * size/15);
		g.drawLine(x, y+ 2 * size/15,x+2 * size/15,y+7*size/15);
		g.drawLine(x, y+ 2 * size/15,x-2 * size/15,y+7*size/15);
		g.drawLine(x, y+ 7 * size/15,x+2 * size/15,y+13*size/15);
		g.drawLine(x, y+ 7 * size/15,x-2 * size/15,y+13*size/15);
	}
	
	protected void paintComponent(Graphics g) {
		drawMan(g,280,280,Color.black,500);
	
	}


	
}

