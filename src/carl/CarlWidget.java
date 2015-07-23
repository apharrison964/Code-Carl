package carl;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class CarlWidget extends JPanel {

	int x = 0;
	int y = 0;
	
	void moveCarlVertical() {
		y += 1;
	}
	void moveCarlHorizontal() {
		x += 1;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 30, 30);
	}
	
}
