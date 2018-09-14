package no.hvl.dat108;

/**
 * @author Herborg
 *
 */
public class ProdusentOgKonsument {

	/**
	 * Lager eit main-program som køyrer produsenten og konsumenten 
	 * samstundes.
	 */

public static void main(String[] args) {

		Buffer buffer = new Buffer();
		Consumer con = new Consumer(buffer);
		Producer pro = new Producer(buffer);
		Thread t1 = new Thread(con);
		Thread t2 = new Thread(pro);
		t1.start();
		t2.start();

//		con.start();
//		pro.start();
		}

		}
