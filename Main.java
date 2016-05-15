package tamerlan.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        boolean Game;
        boolean shop = false;
        Player player = new Player("", 0, 0, 0, 0, "");
        Enemy Monster = new Enemy("Monster", 100, 20);
        Enemy Bandit = new Enemy("Bandit", 100, 10);
        Weapun weapun = new Weapun(5, 7, 3, 6);
        City city = new City("Ривервуд", "Вызима", "Новиград");
        TextMessage textMessage = new TextMessage();


        textMessage.Menu();
        Scanner check = new Scanner(System.in);
        int number = check.nextInt();

        if (number == 1) {
            player.CreateCharacter();

        }

        if (number == 2) {
            player.Load();
        }

        if (number == 3) {
            System.exit(0);
        }

        while (!shop) {
            player.Character();
            player.setLocation("Вызима");
            textMessage.Action();
            Scanner sc = new Scanner(System.in);
            int action = sc.nextInt();
            if (action == 1) {
                textMessage.ShopVizima();
                Game = false;
                while (!Game) {
                    action = sc.nextInt();
                    if (action == 1) {
                        if (player.getMoney() >= 500) {
                            player.setMoney(player.getMoney() - 500);
                            player.setXP(player.getXP()+ 10);
                            player.setHP(player.getHP() + 15);
                            player.setWeapune(weapun.getSword());

                        } else {
                            textMessage.ErrorMoney();
                            textMessage.ShopVizima();
                        }
                    }
                    if (action == 2) {
                        if (player.getMoney() >= 300) {
                            player.setMoney(player.getMoney() - 300);
                            player.setXP(player.getXP()+ 5);
                            player.setHP(player.getHP() + 10);
                            player.setWeapune(weapun.getKnife());

                        } else {
                            textMessage.ErrorMoney();
                            textMessage.ShopVizima();
                        }
                    }
                    if (action == 6) {
                        Game = true;
                    }
                }
            }
            if (action == 2) {
                textMessage.City();
                action = sc.nextInt();
                if (action == 1) {
                    System.out.println("Вы находитесь в городе " + city.getRivirvud());
                    player.setLocation("Ривервуд");
                    player.Character();
                    textMessage.Action();
                    action = sc.nextInt();
                    if (action == 1) {
                        textMessage.ShopRivirvud();
                        Game = false;
                        while (!Game) {
                            action = sc.nextInt();
                            if (action == 1) {
                                if (player.getMoney() >= 700) {
                                    player.setMoney(player.getMoney() - 700);
                                    player.setWeapune(weapun.getAxe());

                                } else {
                                    textMessage.ErrorMoney();
                                    textMessage.ShopRivirvud();
                                }
                            }
                            if (action == 2) {
                                if (player.getMoney() >= 600) {
                                    player.setMoney(player.getMoney() - 600);
                                    player.setWeapune(weapun.getBow());

                                } else {
                                    textMessage.ErrorMoney();
                                    textMessage.ShopRivirvud();
                                }
                            }
                            if (action == 6) {
                                Game = true;
                            }
                        }
                    }
                }
            }

            if (action == 3) {
                player.Save();
            }
        }
    }
}
