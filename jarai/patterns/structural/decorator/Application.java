package jarai.patterns.structural.decorator;

public class Application {


    public static void main(String[] args) {

        Output original = new ConcreteOutput();
        Output bracketed = new BracketDecorator(original);
        Output stared = new StarDecorator(bracketed);

        stared.print("<String>");

        System.out.println();
    }
}