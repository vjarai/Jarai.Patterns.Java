package structural.decorator;

public class BracketDecorator extends OutputDecorator {


    public BracketDecorator(Output output) {
        super(output);
    }

    public void print(String s) {
        outputComponent.print("[" + s + "]");
    }
}