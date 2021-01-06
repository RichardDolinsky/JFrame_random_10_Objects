package sk.richard.auto;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class NakladneAuto {
	private int x;
	private int y;

	public NakladneAuto(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public void vykresli(Graphics2D g2) {

		Rectangle2D.Double ramNakladiaka = new Rectangle2D.Double(x, y + 10, 120, 10);
		Rectangle2D.Double strecha = new Rectangle2D.Double(x + 2, y - 30, 35, 40); // x y sirka vyska

		Rectangle2D.Double naves = new Rectangle2D.Double(x + 42, y - 35, 105, 45); // x y sirka vyska
		Ellipse2D predneKoleso = new Ellipse2D.Double(x + 10, y + 20, 10, 10);
		// Ellipse2D predneKoleso2 = new Ellipse2D.Double(x + 30, y + 20, 10, 10);

		Ellipse2D zadneKoleso = new Ellipse2D.Double(x + 80, y + 20, 10, 10);
		Ellipse2D zadneKoleso2 = new Ellipse2D.Double(x + 100, y + 20, 10, 10);

		g2.draw(zadneKoleso2);
		g2.draw(zadneKoleso);
		g2.draw(ramNakladiaka);
		g2.draw(predneKoleso);
		g2.draw(strecha);
		g2.draw(naves);
//g2.draw(predneKoleso2);
	}

}
