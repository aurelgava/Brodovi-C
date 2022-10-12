

package more;

public class Brod {
   protected String naziv;
   protected int kapacitet,trenutniBroj;
   protected Mornar[] mornari=new Mornar[kapacitet];

   protected char vrsta;
   public Brod(String naziv,int Kapacitet,Mornar a) {
      this.naziv = naziv;
      this.kapacitet = kapacitet;
      this.mornari[0]=a;
      trenutniBroj++;
   }
   public void dodajMorn(Mornar a) {
      if(a.kapacitet>mornari[0]) {
         mornari[trenutniBroj+1]=mornari[0];
         mornari[0]=a;
         trenutniBroj++;
      }else {
         mornari[trenutniBroj+1]=a;
         trenutniBroj++;
      }
   }

   public Mornar uhvatiKapetana() {
      return kapetan;
   }

   public Mornar[] dohvMornar(int i) {
      return mornari[i];
   }
}
