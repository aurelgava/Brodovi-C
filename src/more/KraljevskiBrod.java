package more;

public class KraljevskiBrod extends Brod {

    public KraljevskiBrod (String naziv, int kapacitet, Mornar mornari) {
        super(naziv, kapacitet, mornari);
        super.vrsta = 'K';
    }

    public void napadni(Brod brod) {
        if (brod.vrsta == 'K') {
            System.out.println("Ne mozes napasti kraljevski brod");
        }
        if (this.prosecniKvalitet() > brod.prosecniKvalitet()) {
            for (int i = 0; i < brod.mornari.length; i++) {
                if (brod.dohvMornar(i).getKvalitet() > this.najgoriMornar().getKvalitet()) {

                }
            }
        }
    }

}