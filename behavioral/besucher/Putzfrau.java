
package behavioral.besucher;


public class Putzfrau extends Besucher {
	
	void besuche( Bus e){
		System.out.println("putze Bus");
	}
	void besuche( Lkw e){
		System.out.println("putze Lkw");
	} 

}