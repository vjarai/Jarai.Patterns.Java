package behavioral.befehl;

import java.util.Vector;


public class MakroBefehl extends Befehl {

	private final Vector<Befehl> makroBefehle = new Vector<>();

	public MakroBefehl() {
		super(null);
	}

	void ausf�hren() {
		for (Befehl befehl : makroBefehle) {
			befehl.ausf�hren();
		}
	}

	void r�ckg�ngig() {
		for( int i = makroBefehle.size()-1; i >= 0; i--)
		{
			Befehl befehl = makroBefehle.get(i);
			befehl.r�ckg�ngig();
		}
	}

	void hinzuf�genBefehl(Befehl befehl) {
		makroBefehle.add( befehl );
	}

}
