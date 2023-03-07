package jarai.patterns.gof.creational.prototype;

public class Application {

    public static void main(String[] args) {

        var s1 = new KlonbarerString("OriginalString");
        var i1 = new KlonbarerInteger(100);

        var s2 = (KlonbarerString) s1.klone();
        var i2 = (KlonbarerInteger) i1.klone();

        s1.setString("Geaenderter String");
        s1.anzeigen();
        s2.anzeigen();

        i1.setIntWert(200);
        i1.anzeigen();
        i2.anzeigen();
    }
}
