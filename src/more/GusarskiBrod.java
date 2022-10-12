package more;

public class GusarskiBrod extends Brod{

    private GusarskiBrod(String naziv, int kapacitet, Mornar mornari) {
        super(naziv, kapacitet, mornari);
    }
    private void napadni(Brod b){
        if(super.trenutniBroj>b.trenutniBroj){
            if(this.dohvatiKapetana().getKvalitet()>b.dohvatiKapetana().getKvalitet() && trenutniBroj<kapacitet){
                dodajMorn(b.dohvatiKapetana());
            }else {

            }
        }else{
        }

    }
}
