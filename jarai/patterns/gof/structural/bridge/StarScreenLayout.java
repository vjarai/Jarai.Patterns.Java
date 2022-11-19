package jarai.patterns.gof.structural.bridge;

public class StarScreenLayout implements ScreenLayout {


    public void printLine() {
        System.out.println();
    }


    public void printDecor() {
        System.out.print("*");
    }


    public void printText(String text) {
        System.out.print(text);
    }
}
