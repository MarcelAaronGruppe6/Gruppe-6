


     public class Konto  {

    	

    	  String kontoinhaber;
    	  Betrag verlauf[] = new Betrag[2000];
    	  int p = 0;
    	  Betrag guthaben;

    	  public Konto(String kontoinhaber, Betrag guthaben) {
    	   this.kontoinhaber = kontoinhaber;
    	   this.guthaben = guthaben;
    	  }

    	  public Konto(Waehrung euro, String string) {
    	   // TODO Auto-generated constructor stub
    	  }

    	  public Waehrung getWaehrung() {
    	   return this.getWaehrung();
    	  }

    	  public String getKontoinhaber() {
    	   return this.getInhaber();
    	  }

    	  /**
    	   * Es können sowohl positive als auch negative Beträge auf das Konto gebucht
    	   * werden
    	   * 
    	   * @param betrag
    	   */
    	  public void buche(Betrag betrag) {
    	   Waehrung neu = betrag.getWaehrung();

    	   if (neu == this.guthaben.getWaehrung()) {

    	    this.guthaben = guthaben.addiere1(betrag);
    	    verlauf[p] = betrag;
    	    p++;

    	   } else {
    	    long betragLong = betrag.getWaehrung().umrechnen(
    	      betrag.getBetrag(), this.guthaben.getWaehrung());
    	    Betrag betragNeu = new Betrag(betragLong,
    	      this.guthaben.getWaehrung());

    	    guthaben = guthaben.addiere1(betragNeu);
    	    verlauf[p] = betragNeu;
    	    p++;

    	   }

    	  }

    	  /**
    	   * Liefert Saldo zurück
    	   * 
    	   * @return- Saldo
    	   */
    	  public Betrag saldo() {
    	   return this.guthaben;

    	  }

    	  /**
    	   * Ermöglicht Abzug eines gewissen Promillesatz vom Konto
    	   * 
    	   * @param promille
    	   */

    	  public void gebuehren(int promille) {
    	   double promilleSatz = (double) promille / 1000;

    	   Betrag prozentBetrag = guthaben.multi(promilleSatz);
    	   Betrag abzug = new Betrag((-1) * prozentBetrag.getBetrag(),
    	     guthaben.getWaehrung());
    	   buche((abzug));
    	  }

    	  /**
    	   * Kontoinhaber
    	   * 
    	   * @return Kontoinhaber
    	   */
    	  public String getInhaber() {
    	   return kontoinhaber;
    	  }

    	  public String toString() {
    	   String ausgabe = "I: " + this.kontoinhaber + "\nWährung: "
    	     + this.guthaben.getWaehrung().getKuerzel() + "\n ------";

    	   for (int i = 0; i < p; i++) {
    	    ausgabe = ausgabe + "\n" + verlauf[i].getAsDouble() + " "
    	      + verlauf[i].getWaehrung().getKuerzel();

    	   }

    	   return ausgabe + "\n ------\nSaldo:" + saldo().getAsDouble() + " "
    	     + this.guthaben.getWaehrung().getKuerzel();
    	  }
    	 }