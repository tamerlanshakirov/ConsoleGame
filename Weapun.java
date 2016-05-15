package tamerlan.company;

/**
 * Created by Tamerlan on 09.05.2016.
 */
public class Weapun {
    private int Sword;
    private int Axe;
    private int Knife;
    private int Bow;
    Weapun(int sword, int axe, int knife, int bow){
        this.Sword = 5;
        this.Axe = 7;
        this.Knife = 3;
        this.Bow = 6;
    }

    public int getSword() {
        return Sword;
    }

    public int getAxe() {
        return Axe;
    }

    public int getKnife() {
        return Knife;
    }

    public int getBow() {
        return Bow;
    }
}
