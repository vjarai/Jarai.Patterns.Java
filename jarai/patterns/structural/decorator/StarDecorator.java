package jarai.patterns.structural.decorator;

public class StarDecorator extends OutputDecorator {


    public StarDecorator(Output output) {
        super(output);
    }

    public void print(String s) {
        outputComponent.print(" *** " + s + " *** ");
    }


}