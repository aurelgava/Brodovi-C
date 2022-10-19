

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

      if(a.getKvalitet() > mornari[0].getKvalitet()) {
         mornari[trenutniBroj+1]=mornari[0];
         mornari[0]=a;
         trenutniBroj++;
      }else {
         mornari[trenutniBroj+1]=a;
         trenutniBroj++;
      }
   }
   public void ukloniMornare(){
      trenutniBroj=0;
   }
   public Mornar dohvatiKapetana() {
      return mornari[0];
   }

   public char getVrsta() {
      return vrsta;
   }

   public void setVrsta(char vrsta) {
      this.vrsta = vrsta;
   }
   public int prosecniKvalitet() {
      int prosek=0,i=0,prosekZbir=0;
      while(i< mornari.length) {
         prosekZbir=prosekZbir+mornari[i].getKvalitet();
         i++;
      }
      prosek=prosekZbir/ mornari.length;
      return prosek;
   }
   public Mornar dohvMornar(int i) {
      return mornari[i];
   }
}
