package p1;

public class Betrag {

	private int euro;
	private int cent;

	public Betrag(int euro, int cent) {
		this.euro = euro;
		setCent(cent);

	}

	public int getEuro() {
		return euro;
	}

	public void setEuro(int euro) {
		this.euro = euro;
	}

	public int getCent() {
		return cent;
	}

	public void setCent(int cent) {
		while (cent >= 100) {
			cent = cent - 100;
			this.euro += 1;
		}
		this.cent = cent;
	}

	//Einfach erzeugen anhand von using fields.
	@Override
	public String toString() {
		return "Die Summe der Betraege ist " + euro + "," + cent + "€";
	}
	
	

}
