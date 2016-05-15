package tamerlan.company;

/**
 * Created by Tamerlan on 09.05.2016.
 */
public class City {
    private String Rivirvud;
    private String Vizima;
    private String Novigrad;
    City(String rivirvud, String vizima, String novigrad){
        this.Rivirvud = "Ривервуд";
        this.Vizima = "Вызима";
        this.Novigrad = "Новиград";
    }

    public String getRivirvud() {
        return Rivirvud;
    }

    public String getVizima() {
        return Vizima;
    }

    public String getNovigrad() {
        return Novigrad;
    }
}
