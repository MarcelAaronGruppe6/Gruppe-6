package Crypter;

public class CrypterFactory {
	
	
	public static Crypter getCrypter(String enu,Key key){
		
		if(enu == Enum.CAESAR.name()){
			return new CrypterCaesar(key);
		}else if(enu == Enum.SUBSTITUTION.name()){
			return new CrypterSubstitution(key);
		}else if (enu == Enum.XOR.name()){
			return new CrypterXOR(key);
		}
		return null;
		
		
	}
}

