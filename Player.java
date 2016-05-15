package tamerlan.company;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by Tamerlan on 27.04.2016.
 */

public class Player {
    private String Name;
    private int XP;
    private int HP;
    private int Weapune;
    private int Money;
    private String Location;

    private int savePlace;
    private String saveName;

    Player(String name, int xp, int hp, int weapune, int money, String location){
        this.Name = name;
        this.XP = xp;
        this.HP = hp;
        this.Weapune = weapune;
        this.Money = money;
        this.Location = location;
    }

    public void CreateCharacter(){
        Scanner sc = new Scanner(System.in);
        Name = sc.nextLine();
        setXP(0);
        setHP(100);
        setWeapune(0);
        setMoney(400);
        setLocation("Вызима");
    }

    public void Character(){
        System.out.println("------------\n" + "Имя: " + getName() + "\n" + "XP: " + getXP() + "\n" + "HP: " + getHP() + "\n" + "Урон: " + getWeapune() + "\n" +"Золото: " + getMoney() + "\n" + "Местоположение: " + getLocation() + "\n------------");
    }

    public void Save(){
        System.out.println("Выберете место сохрания.\n1.Save_1\n2.Save_2\n3.Save_3\n4.Save_4\n5.Save_5");
        Scanner sc = new Scanner(System.in);
        savePlace = sc.nextInt();
        if(savePlace == 1){
            saveName = "Saves\\Saves_1.txt";
        }
        if(savePlace == 2){
            saveName = "Saves\\Saves_2.txt";
        }
        if(savePlace == 3){
            saveName = "Saves\\Saves_3.txt";
        }
        if(savePlace == 4){
            saveName = "Saves\\Saves_4.txt";
        }
        if(savePlace == 5){
            saveName = "Saves\\Saves_5.txt";
        }
        try(FileWriter PlayerSaves = new FileWriter(saveName, false)) {
            PlayerSaves.write(getName() + "\n" + getXP() + "\n" + getHP() + "\n" + getWeapune() + "\n" + getMoney() + "\n" + getLocation());
        } catch (Exception ex) {
            System.out.println("Something went wrong...");
        }
        System.exit(0);
    }

    public void Load(){
        try {
            System.out.println("Выберете сохраненую игру.\n1.Save_1\n2.Save_2\n3.Save_3\n4.Save_4\n5.Save_5");
            Scanner sc = new Scanner(System.in);
            savePlace = sc.nextInt();
            if(savePlace == 1){
                saveName = "Saves\\Saves_1.txt";
            }
            if(savePlace == 2){
                saveName = "Saves\\Saves_2.txt";
            }
            if(savePlace == 3){
                saveName = "Saves\\Saves_3.txt";
            }
            if(savePlace == 4){
                saveName = "Saves\\Saves_4.txt";
            }
            if(savePlace == 5){
                saveName = "Saves\\Saves_5.txt";
            }
            File PlayerLoading = new File(saveName);
            Scanner load = new Scanner(PlayerLoading);
            setName(load.nextLine());
            setXP(load.nextInt());
            setHP(load.nextInt());
            setWeapune(load.nextInt());
            setMoney(load.nextInt());
            load.nextLine();
            setLocation(load.nextLine());


        } catch (Exception ex) {
            System.out.println("Something went wrong...");
        }
    }

    public String getName() {
        return Name;
    }

    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getWeapune() {
        return Weapune;
    }

    public void setWeapune(int weapune) {
        Weapune = weapune;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }
}
