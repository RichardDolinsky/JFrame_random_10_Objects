package sk.richard.auto;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JComponent;

public class KomponentaAut extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1913213527860641260L;
	Random rand = new Random();
	int rand_int1 = rand.nextInt(500);
	int rand_int2 = rand.nextInt(500);

	@Override
	protected void paintComponent(Graphics grafickyKontext) {
		Graphics2D g2 = (Graphics2D) grafickyKontext;

		for (int i = 0; i < 10; i++) {
			int rand_int3 = rand.nextInt(2);

			if (rand_int3 == 1) {
				OsobneAuto bmw = new OsobneAuto(rand_int1, rand_int2);
				bmw.vykresli(g2);
				rand_int1 = rand.nextInt(500);
				rand_int2 = rand.nextInt(500);

			}

			else {
				NakladneAuto scania = new NakladneAuto(rand_int1, rand_int2);
				scania.vykresli(g2);

				rand_int2 = rand.nextInt(500);
				rand_int1 = rand.nextInt(500);

			}
		}

	}

}
