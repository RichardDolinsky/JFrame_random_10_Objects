package sk.richard.auto;

import javax.swing.JComponent;
import javax.swing.JFrame;
public class ZobrazovacAuta {

	public static void main(String[] args) {

		JFrame okno = new JFrame();
		

		okno.setSize(800, 600);
		

		okno.setTitle("Zobrazovac aut");
		

		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//KomponentaAut komponenta = new KomponentaAut();
		JComponent komponenta = new KomponentaAut();
		okno.add(komponenta);
		
	
		

		okno.setVisible(true);
	}

	

}
