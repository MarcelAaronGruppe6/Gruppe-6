package Crypter;

public class CrypterXOR implements Crypter{
	
	private int Position = 0;
	private char klartextZeichen;
	private Key<String> key;
	private char cypherTextZeichen;
	private int WertvorA = 64;
	
	
	protected CrypterXOR(Key<String> key){
		this.key = key;
	}
	@Override
	public void reset() {
		Position = 0;
		
	}

	@Override
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		if (Position>this.key.getKey().length()){
			reset();
		}
		int a = klartextZeichen-WertvorA;
		int b = this.key.getKey().charAt(Position)-WertvorA; 
		int ab = (a^b)+WertvorA;
		cypherTextZeichen =(char) ab;
		Position++;
		
		return cypherTextZeichen;
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		if (Position>this.key.getKey().length()){
			reset();
		}
		int a = cypherTextZeichen-WertvorA;
		int b = this.key.getKey().charAt(Position)-WertvorA; 
		int ab = a^b +WertvorA;
		cypherTextZeichen =(char) ab;
		Position++;
		
		return klartextZeichen;
	}
	

}
