package jarai.patterns.creational.prototype;

public class Application {

    public static void main(String[] args) {

        var w = new KopierWerkzeug();

        var s1 = new KlonbarerString("OriginalString");
        var i1 = new KlonbarerInteger(100);

        var s2 = w.erstelleObject(s1);
        var i2 = w.erstelleObject(i1);

        s1.setString("Geaenderter String");
        s1.anzeigen();
        s2.anzeigen();

        i1.setIntWert(200);
        i1.anzeigen();
        i2.anzeigen();
    }
}
