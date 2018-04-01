package dekoratory;

import napoje.Napoj;

public class Cukier extends NapojDekorator {

	private static final double CENA_DODATKU = 1.00;
    private static final String OPIS_DODATKU = " z cukrem";

    public Cukier(Napoj napoj) {
        super(napoj);
        System.out.println("Dodaj� cukier  (cena " + CENA_DODATKU + " z�)");
    }

    public String getNazwa() {
        return getNapoj().getNazwa() + OPIS_DODATKU;
    }

    public double getCena() {
        return getNapoj().getCena() + CENA_DODATKU;
    }
	@Override
	public String toString() {
		return "CU [nazwa()=" + getNazwa() + ", cena=" + getCena() + "]";
	}
}