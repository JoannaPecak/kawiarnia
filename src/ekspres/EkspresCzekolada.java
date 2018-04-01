package ekspres;

import napoje.Czekolada;
import napoje.Napoj;

public class EkspresCzekolada extends Ekspres {
    private final Napoj k = new Czekolada();

    @Override
    protected Napoj zrobNapoj() {
        System.out.println("Robiê napój - Czekolada (cena " + k.getCena() + " z³)");
        return k;
    }

    @Override
    protected void nalejDoPojemnika() {
        System.out.println("Nalewam do kubka");
    }

    @Override
    protected void ugotujPlyn() {
        System.out.println("Gotujê mleko...");
    }

	@Override
	protected Napoj dodajDodatki(Napoj napoj) {
		return new BitaSmietana(napoj);
	}

	@Override
	protected Napoj dodajDodatki(Napoj napoj) {
		// TODO Auto-generated method stub
		return null;
	}
}