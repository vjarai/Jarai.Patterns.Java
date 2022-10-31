package jarai.patterns.creational.prototype;

public class KlonbarerString implements Klonbar {

    private String string;

    public KlonbarerString(String string) {
        this.string = string;
    }

    public Klonbar klone() {
        return new KlonbarerString(string);
    }

    public void setString(String string) {
        this.string = string;
    }

    public void anzeigen() {
        System.out.println(string);
    }

}
