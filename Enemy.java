package tamerlan.company;

import javax.lang.model.element.Name;

/**
 * Created by Tamerlan on 27.04.2016.
 */
public class Enemy {
    private String Name;
    private int HP;
    private int Damage;
    Enemy(String name, int hp, int damage){
        this.Name = "Enemy";
        this.HP = 100;
        this.Damage = damage;
    }

    public String getName() {
        return Name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDamage() {
        return Damage;
    }
}
