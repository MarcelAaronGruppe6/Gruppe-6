


    public class Betrag {
	

	 private final long betrag; 
	 private final Waehrung waehrung;

	 /**getBetrag Methode
	  * 
	  * @return
	  */
    
	 
	 public long getBetrag() {
	  return betrag;
	 }
	 public Betrag(double betrag, Waehrung waehrung) {
		  this.betrag = (long) (betrag * 100);
		  this.waehrung = waehrung;
		 }
	 /**
	  * erhalten Waehrung mit get waehrung Methode
	  * 
	  * @return Waehrung
	  */
	 public Waehrung getWaehrung() {
	  return this.waehrung;
	 }

	 /**
	  * returns long , fügt betrag hinzu
	  * 
	  * @param b
	  * @return long
	  */
	
	 /**
	  * returns double fügt betrag hinzu (b)
	  * 
	  * @param b
	  * @return double
	  */
	// subtrahiert 
	 double subtrahiere(Betrag b) {
	  return (this.betrag - b.betrag); 
	 }

	 /**
	  * returns double multiply betrag*zahl
	  * 
	  * @param zahl
	  * @return double
	  */
	// multipliziert betrag mit double
	 double multipliziere(double zahl) {
	  return (this.betrag * zahl); 
	 }

	 /**
	  * returns double und multipliziert betrag*zahl
	  * 
	  * @param zahl
	  * @return double
	  */
	// multipliziert betrag mit int
	 public Betrag multi(double multi) {
			long neuBetrag = (long) (multi * this.betrag);
			Betrag multiBetrag = new Betrag(neuBetrag, this.waehrung);
			return multiBetrag;

		}

	 /**
	  * return long betrag*prozent
	  * 
	  * @param prozent
	  * @return long
	  */
	// berechnet prozentwert
	 long prozent(double prozent) {
	  return (long) (double) ((this.betrag / 100)*prozent)*100 ; 
	 }

	 /**
	   returns long betrag  promill
	  * 
	  * @param promill
	  * @return long
	  */
	// berechnet promillewert
	 long promille(double promill) {
	  return (long) (double) ((this.betrag / 100)*promill  )*  100; 
	 }
		public Betrag addiere1(Betrag addBetrag) {

			if (addBetrag.waehrung == this.waehrung) {
				long addBetrag1 = addBetrag.betrag + this.betrag;
				Betrag ergeb1 = new Betrag(addBetrag1, this.waehrung);
				return ergeb1;
			} else {

				long neuBetrag = addBetrag.waehrung.umrechnen(addBetrag.betrag,
						this.waehrung);
				long addBetrag2 = neuBetrag + this.betrag;
				Betrag ergeb2 = new Betrag(addBetrag2, this.waehrung);
				return ergeb2;

			}
		}

	 /**
	  * gibt alles zurück bevor punktation in int
	  * 
	  * @return int
	  */
	// gibt vorkomma stellen an
	 public int getVorkomma() {
	  return (int) (double) (this.betrag / 100); 
	 }

	 /**
	  * returns .00 as int
	  * 
	  * @return int
	  */
	 // gibt 2 nachlkommastellen an
	 public int getNachkomma() {
	  return (int) this.betrag % 100;
	 }

	 @Override
	 public String toString() {
	  return getVorzeichen()         * betrag + "---" + waehrung;
	 }

	 /**
	  * gibt double und betrag as double wieder
	  * 
	  * @return double
	  */
	 public double getAsDouble() {
	  double doubleZahl = this.betrag;
	  return (doubleZahl / 100);
	 }

	 // public boolean equals(Object o) {
	 // TODO
	 // }

	 /**
	  * return int returns -1 wenn <saldo></saldo> ist negativ und 0 wenn positiv
	  * returns 1
	  * 
	  * @return int
	  */
	 public int getVorzeichen() {
	  if (this.betrag < 0) {
	   return -1; // ja -1
	  } else {
	   return 1; // nein 1
	  }
	 }
	}