
package behavioral.memento;

public class Urheber {

	private String zustand; 

	public void setzeZustand(String zustand) {
		this.zustand = zustand;
	}

	public Memento erzeugeMemento(){
		return new Memento( zustand );		
	}

	public void setzeMemento(Memento memento) {
		zustand = memento.getZustand();
	}

	public void zeigeZustand() {
		System.out.println( zustand );
	}

}
