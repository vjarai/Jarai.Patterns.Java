package jarai.patterns.gof.structural.bridge;

public class CrossScreenLayout implements ScreenLayout {


    public void printLine() {
        System.out.println();
    }


    public void printDecor() {
        System.out.print("X");
    }


    public void printText(String text) {
        System.out.print(text.toUpperCase());
    }
}
