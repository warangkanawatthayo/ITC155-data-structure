import java.awt.*;

public class Assignment1 {

	public static void main(String[] args) {

		// a yellow panel
		DrawingPanel panel = new DrawingPanel(220, 150);
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();

		// a left blue oval
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);

		// a right blue oval
		g.setColor(Color.BLUE);
		g.fillOval(130, 25, 40, 40);

		// a red square
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);

		// a black line
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);

	}

}
