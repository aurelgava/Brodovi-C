package more;

public class GusarskiBrod extends Brod{

    public GusarskiBrod(String naziv, int kapacitet, Mornar mornari) {
        super(naziv, kapacitet, mornari);
        super.vrsta = 'G';
    }
    public void napadni(Brod b){
        if(super.trenutniBroj>b.trenutniBroj){
                if(this.prosecniKvalitet()>b.prosecniKvalitet()){
                    if(this.dohvatiKapetana().getKvalitet()>b.najgoriMornar().getKvalitet() && trenutniBroj<kapacitet) {
                        dodajMorn(b.dohvatiKapetana());
                }else{

                    }
                }else {

            }
        }else {
        }

    }
}
