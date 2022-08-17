package behavioral.befehl;

import java.util.Vector;


public class MakroBefehl extends Befehl {

	private final Vector<Befehl> makroBefehle = new Vector<>();

	public MakroBefehl() {
		super(null);
	}

	void ausführen() {
		for (Befehl befehl : makroBefehle) {
			befehl.ausführen();
		}
	}

	void rückgängig() {
		for( int i = makroBefehle.size()-1; i >= 0; i--)
		{
			Befehl befehl = makroBefehle.get(i);
			befehl.rückgängig();
		}
	}

	void hinzufügenBefehl(Befehl befehl) {
		makroBefehle.add( befehl );
	}

}
