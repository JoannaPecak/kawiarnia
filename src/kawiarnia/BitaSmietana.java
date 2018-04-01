/**
 * 
 */
/**
 * @author User
 *
 */
package kawiarnia;


import napoje.Napoj;

public class BitaSmietana extends NapojDekorator {
    
	private static final double CENA_DODATKU = 2.50;
    private static final String OPIS_DODATKU = " z bit¹ œmietan¹";

    public BitaSmietana(Napoj napoj) {
        super(napoj);
        System.out.println("Dodajê bit¹ œmietanê  (cena " + CENA_DODATKU + " z³)");
    }

    public String getNazwa() {
        return getNapoj().getNazwa() + OPIS_DODATKU;
    }

    public double getCena() {
        return getNapoj().getCena() + CENA_DODATKU;
    }
    
	@Override
	public String toString() {
		return "BS [nazwa()=" + getNazwa() + ", cena=" + getCena() + "]";
	}
}