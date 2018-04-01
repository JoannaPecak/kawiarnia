package kawiarnia;

public class EkspresKawa extends Ekspres {
    private final Napoj k = new Kawa();

    @Override
    protected Napoj zrobNapoj() {
        System.out.println("Robi� nap�j - Kawa  (cena " + k.getCena() + " z�)");
        return k;
    }

    @Override
    protected void nalejDoPojemnika() {
        System.out.println("Nalewam do fili�anki");
    }

    @Override
    protected void ugotujPlyn() {
        System.out.println("Gotuj� wod�...");
    }

	@Override
	protected Napoj dodajDodatki(Napoj napoj) {
		return new Mleko(napoj);
	}
}