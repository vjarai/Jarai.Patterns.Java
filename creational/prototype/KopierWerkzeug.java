package creational.prototype;


public class KopierWerkzeug {

    Klonbar erstelleObject(Klonbar prototyp) {
        return prototyp.klone();
    }

}