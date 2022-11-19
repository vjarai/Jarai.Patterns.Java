package jarai.patterns.gof.creational.prototype;

public class Application {

    public static void main(String[] args) {

        var kopierer = new KopierWerkzeug();

        var s1 = new KlonbarerString("OriginalString");
        var i1 = new KlonbarerInteger(100);

        var s2 = kopierer.erstelleKopie(s1);
        var i2 = kopierer.erstelleKopie(i1);

        s1.setString("Geaenderter String");
        s1.anzeigen();
        s2.anzeigen();

        i1.setIntWert(200);
        i1.anzeigen();
        i2.anzeigen();
    }
}
