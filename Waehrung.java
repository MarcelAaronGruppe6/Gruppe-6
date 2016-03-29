         public class  Waehrung {
	
	 
		 private String name;
		 private String abkürzung; //Akürzung der Waehrung
		 private double kurs; // Dollar
		private String abkuerzel;
		 
		 public String getName() {
		  return name;
		 }

		
		 
		 public double getKurs() {
		  return kurs;
		 }
		 
		 public String getKuerzel() {
			  return abkürzung;
			 }
		

		 
		 public Waehrung(String name, String kuerzel, double kurs) {
		  this.name = name;
		  this.abkürzung = kuerzel;
		  this.kurs = kurs;
		 }

		 /**
		  *takes betrag exchanges it into dollar into target value
		  * returns long
		  * @param betrag
		  * @param ziel
		     * @return long
		     */
		  public long umrechnen(long endbetrag,Waehrung ziel){
		  double zielBetrag = endbetrag;
		  zielBetrag = zielBetrag * this.kurs;
		  zielBetrag = zielBetrag / ziel.kurs;
		  return Math.round(zielBetrag * 100) /100;
		 }
		 @Override
		 public String toString(){
		  return name+" ["+abkuerzel+"] 1$ = "+kurs+" "+abkuerzel;
		 }
		 @Override
		 public boolean equals(Object obj) {
		  if (this == obj)
		   return true;
		  if (obj == null)
		   return false;
		  if (getClass() != obj.getClass())
		   return false;
		  Waehrung other = (Waehrung) obj;
		  if (abkuerzel == null) {
		   if (other.abkuerzel != null)
		    return false;
		  } else if (!abkuerzel.equals(other.abkuerzel))
		   return false;
		  if (Double.doubleToLongBits(kurs) != Double.doubleToLongBits(other.kurs))
		   return false;
		  if (name == null) {
		   if (other.name != null)
		    return false;
		  } else if (!name.equals(other.name))
		   return false;
		  return true;
		 }
		
		 @Override//Hashcode Methode
		 public int hashCode() {
		  final int prime = 31;
		  int result = 1;
		  result = prime * result + ((abkuerzel == null) ? 0 : abkuerzel.hashCode());
		  long temp;
		  temp = Double.doubleToLongBits(kurs);
		  result = prime * result + (int) (temp ^ (temp >>> 32));
		  result = prime * result + ((name == null) ? 0 : name.hashCode());
		  return result;
		 }

         }