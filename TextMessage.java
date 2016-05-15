package tamerlan.company;

/**
 * Created by Tamerlan on 09.05.2016.
 */
public class TextMessage {


    public void Menu(){
        System.out.println("1.Новая игра\n2.Загрузить сохронение\n3.Выйти");
    }

    public void ShopVizima(){
        System.out.println("1.Купить Меч Даедра (500 золота, урон 5 единиц, +10 XP, +15HP)\n2.Купить Нож Довакина(300 золота, урон 3 единицы, +5 XP, +10HP)\n6. Назад");
    }

    public void ShopRivirvud(){
        System.out.println("1.Купить Топор (700 золота, урон 7 единиц)\n2.Купить Лук(600 золота, урон 6 единицы)\n6. Назад");
    }


    public void Action(){
        System.out.println("Выши действия\n1.Зайти в магазин\n2.Пойти в другой город\n3.Сохранить игру и выйти");
    }

    public void City(){
        System.out.println("1.Риведвуд\n2.Вызима");
    }

    public void ErrorMoney(){
        System.out.println("Недостаточно денег");
    }


}
