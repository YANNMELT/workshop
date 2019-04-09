
public class TestZoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Requins rq = new Requins();
		Requins rq2= new Requins();
		Chimpanze ch = new Chimpanze();
		rq.nom="JAWS";
		rq2.nom="Ham";
		ch.nom="Cheeta";
		System.out.print(rq.toString()+ch.toString()+rq2.toString());
		

	}

}
