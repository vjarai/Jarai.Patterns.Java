package jarai.patterns.gof.structural.bridge;

public interface ScreenImplementation {

    /**
     * Prints a line feed.
     */

    void printLine();

    /**
     * Prints a decorator symbol (a string of length 1).
     */

    void printDecor();

    /**
     * Prints the argument text.
     *
     * @param text the text to print
     */

    void printText(String text);
}