package more;

public class KraljevskiBrod extends Brod {

    private KraljevskiBrod (String naziv, int kapacitet, Mornar mornari) {
        super(naziv, kapacitet, mornari);
    }

    private void napadni(Brod brod) {
        if (brod.vrsta == 'K') {
            System.out.println("Ne mozes napasti kraljevski brod");
        }
        else {
            if (super.trenutniBroj>brod.trenutniBroj){
                if (this.dohvatiKapetana().getKvalitet()>brod.dohvatiKapetana().getKvalitet() && trenutniBroj<kapacitet){
                    dodajMorn(brod.dohvatiKapetana());
                }
            }
        }

    }

}