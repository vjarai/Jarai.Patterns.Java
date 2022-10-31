package jarai.patterns.structural.decorator;

public abstract class OutputDecorator implements Output {


    protected final Output outputComponent;

    public OutputDecorator(Output output) {
        this.outputComponent = output;
    }

    public void print(String s) {
        outputComponent.print(s);
    }
}