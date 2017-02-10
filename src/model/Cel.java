package model;

/**
 * Created by Gebruiker on 10/02/2017.
 */
public class Cel {
    private boolean leeft;
    private int xPos;
    private int yPos;
    private int kleurR;
    private int kleurG;
    private int kleurB;

    public Cel() {
        leeft = true;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setKleur(int kleurR, int kleurG, int kleurB) {
        this.kleurR = kleurR;
        this.kleurG = kleurG;
        this.kleurB = kleurB;
    }
}
