package kawiarnia;

public class EkspresKawa extends Ekspres {
    private final Napoj k = new Kawa();

    @Override
    protected Napoj zrobNapoj() {
        System.out.println("Robiê napój - Kawa  (cena " + k.getCena() + " z³)");
        return k;
    }

    @Override
    protected void nalejDoPojemnika() {
        System.out.println("Nalewam do fili¿anki");
    }

    @Override
    protected void ugotujPlyn() {
        System.out.println("Gotujê wodê...");
    }

	@Override
	protected Napoj dodajDodatki(Napoj napoj) {
		return new Mleko(napoj);
	}
}