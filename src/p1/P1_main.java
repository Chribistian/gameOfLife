package p1;

public class P1_main {

	public static Betrag summe(Betrag a, Betrag b) {

		Betrag sumOf = new Betrag(0, 0);

		sumOf.setCent(a.getCent() + b.getCent());
		//Hier war wichtig, dass Euro nicht direkt ueberschrieben wird
		sumOf.setEuro(sumOf.getEuro() + a.getEuro() + b.getEuro());

		return sumOf;
	}


	public static void main(String[] args) {

		Betrag a = new Betrag(18,60);
		Betrag b = new Betrag(14,90);
		
		Betrag sum = summe (a,b);
		

		
		System.out.println(sum);

	}

}
