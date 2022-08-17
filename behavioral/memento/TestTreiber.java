package behavioral.memento;

public class TestTreiber {

	public static void main(String[] args) {
		
		Urheber urheber = new Urheber();
		Aufbewahrer aufbewahrer = new Aufbewahrer( urheber );
		
		urheber.setzeZustand("Zustand0");
		urheber.zeigeZustand();
		aufbewahrer.speichereZustand();
		
		urheber.setzeZustand("Zustand1");
		urheber.zeigeZustand();
		aufbewahrer.speichereZustand();
		
		aufbewahrer.rückgängigZustand(0);
		urheber.zeigeZustand();
		
		aufbewahrer.rückgängigZustand(1);
		urheber.zeigeZustand();
	}
}
