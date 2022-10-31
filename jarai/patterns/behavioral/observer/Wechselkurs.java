
package jarai.patterns.behavioral.observer;


public class Wechselkurs extends BeobachtbaresObjekt {

    private double dollarkurs;

    public double getDollarkurs() {
        return dollarkurs;
    }

    public void setDollarkurs(double dollarkurs) {
        this.dollarkurs = dollarkurs;
        benachrichtigeAlleBeobachter();
    }

}
