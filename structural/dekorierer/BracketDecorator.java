package structural.dekorierer;

public class BracketDecorator extends OutputDecorator {
 

	public void print(String s) {
		outputComponent.print("["+s+"]");
	}

 
	public BracketDecorator(Output output) {
		super(output);
	}
}