package structural.dekorierer;

public class StarDecorator extends OutputDecorator {


	public void print(String s) {
		outputComponent.print(" *** " + s + " *** ");
	}


	public StarDecorator(Output output) {
		super(output);
	}


}