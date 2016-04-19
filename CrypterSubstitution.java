package Crypter;

public class CrypterSubstitution implements Crypter{
	
	
	private Key<String> key;
	private char[] Alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Z'};
	
	protected CrypterSubstitution(Key<String> key){
		this.key = key;
	}
	
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		if(this.key.getKey().length()!=26 ||
				!this.key.getKey().matches("[B-Z]*A[B-Z]*") ||
				!this.key.getKey().matches("[AC-Z]*B[AC-Z]*") ||
				!this.key.getKey().matches("[A-CE-Z]*D[A-CE-Z]*") ||
				!this.key.getKey().matches("[A-DF-Z]*E[A-DF-Z]*") ||
				!this.key.getKey().matches("[A-EG-Z]*F[A-EG-Z]*") ||
				!this.key.getKey().matches("[A-FH-Z]*G[A-FH-Z]*") ||
				!this.key.getKey().matches("[A-GI-Z]*H[A-GI-Z]*") ||
				!this.key.getKey().matches("[A-HJ-Z]*I[A-HJ-Z]*") ||
				!this.key.getKey().matches("[A-IK-Z]*J[A-IK-Z]*") ||
				!this.key.getKey().matches("[A-JL-Z]*K[A-JL-Z]*") ||
				!this.key.getKey().matches("[A-KM-Z]*L[A-KM-Z]*") ||
				!this.key.getKey().matches("[A-LN-Z]*M[A-LN-Z]*") ||
				!this.key.getKey().matches("[A-MO-Z]*N[A-MO-Z]*") ||
				!this.key.getKey().matches("[A-NP-Z]*O[A-NP-Z]*") ||
				!this.key.getKey().matches("[A-OQ-Z]*P[A-OQ-Z]*") ||
				!this.key.getKey().matches("[A-PR-Z]*Q[A-PR-Z]*") ||
				!this.key.getKey().matches("[A-QS-Z]*R[A-QS-Z]*") ||
				!this.key.getKey().matches("[A-RT-Z]*S[A-RT-Z]*") ||
				!this.key.getKey().matches("[A-SU-Z]*T[A-SU-Z]*") ||
				!this.key.getKey().matches("[A-TV-Z]*U[A-TV-Z]*") ||
				!this.key.getKey().matches("[A-UW-Z]*V[A-UW-Z]*") ||
				!this.key.getKey().matches("[A-VX-Z]*W[A-VX-Z]*") ||
				!this.key.getKey().matches("[A-WY-Z]*X[A-WY-Z]*") ||
				!this.key.getKey().matches("[A-XZ]*Y[A-XZ]*") ||
				!this.key.getKey().matches("[A-Y]*Z[A-Y]*")){
			throw new CrypterException("Key passt nicht...");
		}
		char cypherTextZeichen = 'A';
		klartextZeichen = Character.toUpperCase(klartextZeichen);
		for (int i = 0; i < Alphabet.length; i++){
			if (klartextZeichen == Alphabet[i]){
				cypherTextZeichen = this.key.getKey().charAt(i);
			}
		}
		return cypherTextZeichen;
	}

	@Override
	public char entschluesseln(char cypherTextZeichen) throws CrypterException {
		if(this.key.getKey().length()!=26 ||
				!this.key.getKey().matches("[B-Z]*A[B-Z]*") ||
				!this.key.getKey().matches("[AC-Z]*B[AC-Z]*") ||
				!this.key.getKey().matches("[A-CE-Z]*D[A-CE-Z]*") ||
				!this.key.getKey().matches("[A-DF-Z]*E[A-DF-Z]*") ||
				!this.key.getKey().matches("[A-EG-Z]*F[A-EG-Z]*") ||
				!this.key.getKey().matches("[A-FH-Z]*G[A-FH-Z]*") ||
				!this.key.getKey().matches("[A-GI-Z]*H[A-GI-Z]*") ||
				!this.key.getKey().matches("[A-HJ-Z]*I[A-HJ-Z]*") ||
				!this.key.getKey().matches("[A-IK-Z]*J[A-IK-Z]*") ||
				!this.key.getKey().matches("[A-JL-Z]*K[A-JL-Z]*") ||
				!this.key.getKey().matches("[A-KM-Z]*L[A-KM-Z]*") ||
				!this.key.getKey().matches("[A-LN-Z]*M[A-LN-Z]*") ||
				!this.key.getKey().matches("[A-MO-Z]*N[A-MO-Z]*") ||
				!this.key.getKey().matches("[A-NP-Z]*O[A-NP-Z]*") ||
				!this.key.getKey().matches("[A-OQ-Z]*P[A-OQ-Z]*") ||
				!this.key.getKey().matches("[A-PR-Z]*Q[A-PR-Z]*") ||
				!this.key.getKey().matches("[A-QS-Z]*R[A-QS-Z]*") ||
				!this.key.getKey().matches("[A-RT-Z]*S[A-RT-Z]*") ||
				!this.key.getKey().matches("[A-SU-Z]*T[A-SU-Z]*") ||
				!this.key.getKey().matches("[A-TV-Z]*U[A-TV-Z]*") ||
				!this.key.getKey().matches("[A-UW-Z]*V[A-UW-Z]*") ||
				!this.key.getKey().matches("[A-VX-Z]*W[A-VX-Z]*") ||
				!this.key.getKey().matches("[A-WY-Z]*X[A-WY-Z]*") ||
				!this.key.getKey().matches("[A-XZ]*Y[A-XZ]*") ||
				!this.key.getKey().matches("[A-Y]*Z[A-Y]*")){
			throw new CrypterException("Key passt nicht...");
		}
		char klartextZeichen = 'A';
		cypherTextZeichen = Character.toUpperCase(cypherTextZeichen);
		for (int i = 0; i < Alphabet.length; i++){
			if (cypherTextZeichen == this.key.getKey().charAt(i)){
				klartextZeichen = Alphabet[i];
			}
		}
		return klartextZeichen;
	}

}
