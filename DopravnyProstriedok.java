package sk.richard.auto;

import java.awt.Graphics2D;

public abstract class DopravnyProstriedok {
	protected int x;
	protected int y;
	protected int sirka;
	protected int vyska;
	
    /**
     * Vytvara objekt dopravny prostriedok.
     */
    public DopravnyProstriedok() {
        x = 0;
        y = 0;
    }

    /**
     * Zobrazuje konkretny dopravny prostriedok.
     * @g2 graficky kontext
     */
    public abstract void zobraz(Graphics2D g2);
        
    /**
     * 
     * Nastavuje poziciu dopravneho prostriedku.
     * @param x x-ova surdnica laveho horneho rohu 
     * @param y y-ova suradnica laveho horneho rohu
     */
    public void setPozicia(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Vracia x-ovu sradnicu laveho horneho rohu.
     * @return x-ovu suradnicu laveho horneho rohu
     */
    public int getX() {
        return this.x;
    }

    /**
     * Vracia y-ovu suradnicu laveho horneho rohu.
     * @return y-ovu suradnicu laveho horneho rohu
     */
    public int getY() {
        return this.y;
    }
    
    /**
     * Vracia sirku dopravneho prostriedku.
     * @return sirku dopravneho prostriedku
     */
    public int getSirka() {
        return this.sirka;
    }

    /**
     * Vracia vysku dopravneho prostriedku.
     * @return vysku dopravneho prostriedku
     */
    public int getVyska() {
        return this.vyska;
    }
}
