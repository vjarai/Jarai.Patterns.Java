package creational.erbauer;
public class K�chenChef {

	private final Koch koch;

	K�chenChef(Koch koch) {
		this.koch = koch;
	}

	void erstelleMahlzeit() {
		koch.kocheVorspeise();
		koch.kocheHauptspeise();
		koch.kocheNachspeise();
	}

}
