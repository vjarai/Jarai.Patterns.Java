package jarai.patterns.gof.structural.bridge;

public interface ScreenImplementation {

    void printLine();

    void printDecor();

    void printText(String text);
}
