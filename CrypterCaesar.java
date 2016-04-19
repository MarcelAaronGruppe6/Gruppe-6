package Crypter;

public class CrypterCaesar implements Crypter {
	
	private Key<String> key;
	private char klartextZeichen;
	private char cypherTextZeichen;
	private int WertvorA = 64;
	private int laengeAlphabet = 26;
	
	
	protected CrypterCaesar(Key<String> key){
	this.key = key;
	}
	/**
	* Setzt die Verschlusselung zuruck. Wird hier nicht benötigt.
	*/
	@Override
	public void reset(){		
	}
	/**
	* Verschlusselt das gegebene Zeichen.
	*
	* @param klartextZeichen Zeichen, das verschlusselt werden soll.
	*
	* @return verschlusseltes Zeichen.
	* @throws CrypterException Wird geworfen, wenn Probleme mit der
	* Verschlusselung auftreten.
	*/
	@Override
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		
		if(this.key.getKey().length()!=1){
			throw new CrypterException("Key passt nicht");
		}
		klartextZeichen = Character.toUpperCase(klartextZeichen);
		int a = klartextZeichen;
		int b = this.key.getKey().charAt(0);
		int ab = a + b-WertvorA;
		if(ab>91){
			ab=ab-laengeAlphabet;
		}
		cypherTextZeichen =(char) ab;
		
		return cypherTextZeichen;
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		if(this.key.getKey().length()!=1){
			throw new CrypterException("Key passt nicht");
		}
		cypherTextZeichen = Character.toUpperCase(klartextZeichen);
		int a = cypherTextZeichen;
		int b = this.key.getKey().charAt(0);
		int ab = a - b+WertvorA;
		if(ab<65){
			ab=ab+laengeAlphabet;
		}
		cypherTextZeichen =(char) ab;
		
		return klartextZeichen;
		
	}

}

	