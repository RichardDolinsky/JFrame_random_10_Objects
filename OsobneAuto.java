package sk.richard.auto;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class OsobneAuto {
	private int x;
	private int y;
	
	public OsobneAuto(int x, int y) {
	
		this.x = x;
		this.y = y;
	}
	public void vykresli (Graphics2D g2) {
		
		Rectangle2D.Double ramAuta = new Rectangle2D.Double(x, y + 10, 60, 10);
		
		// strecha auta
		Rectangle2D.Double strecha = new Rectangle2D.Double(x+10, y , 35, 10);
		
		// predne koleso
		Ellipse2D predneKoleso = new Ellipse2D.Double(x + 10, y + 20, 10, 10);
		
		// zadnekoleso
		
		Ellipse2D zadneKoleso = new Ellipse2D.Double(x + 40, y + 20, 10, 10);
		
		g2.draw(zadneKoleso);
		g2.draw(predneKoleso);
		g2.draw(ramAuta);
		g2.draw(strecha);
	}
	

}
