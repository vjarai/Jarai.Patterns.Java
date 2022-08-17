package structural.dekorierer;
                       
public abstract class OutputDecorator implements Output {


	protected final Output outputComponent;

	public void print(String s) { 
		outputComponent.print(s);
	}
	
  
 	public OutputDecorator(Output output) {
		this.outputComponent = output;
	}
}