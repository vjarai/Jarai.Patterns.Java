package creational.erbauer;
public class KüchenChef {

	private final Koch koch;

	KüchenChef(Koch koch) {
		this.koch = koch;
	}

	void erstelleMahlzeit() {
		koch.kocheVorspeise();
		koch.kocheHauptspeise();
		koch.kocheNachspeise();
	}

}
