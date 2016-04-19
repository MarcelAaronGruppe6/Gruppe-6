package Test;
import Crypter.*;
import static org.junit.Assert.*;

import org.junit.Before;

public class Test {

	@Before
	public void setUp() throws Exception {
		
		
				
		
	}

	@org.junit.Test
	public void testCaesar() {
		Key<String> key = new Key("H");
		Crypter c = CrypterFactory.getCrypter("CAESAR",key);
		char klar = 'A';
		char geheim = 'A';
		try {
			 geheim = c.verschluesseln(klar);
		} catch (CrypterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char erwartet = 'I';
		System.out.println(geheim);
		System.out.println(erwartet);
		assertEquals(geheim,erwartet);
	
	
		
		//fail("Not yet implemented");
	}
	
	@org.junit.Test
	public void testSubstitution(){
		Key<String> key = new Key("QWERTZUIOPASDFGHJKLYXCVBNM");
		Crypter s = CrypterFactory.getCrypter("SUBSTITUTION",key);
		char klar = 'A';
		char geheim = 'A';
		try {
			geheim = s.verschluesseln(klar);
		} catch (CrypterException e) {
				
			e.printStackTrace();
		}
		char erwartet = 'Q';
		System.out.println(geheim);
		System.out.println(erwartet);
		assertEquals(geheim,erwartet);
	}

	

	@org.junit.Test
	public void testXOR(){
		Key<String> key = new Key("QWERTZUIOPASDFGHJKLYXCVBNM");
		Crypter s = CrypterFactory.getCrypter("XOR",key);
		char klar = 'A';
		char geheim = 'A';
		try {
			geheim = s.verschluesseln(klar);
		} catch (CrypterException e) {
				
			e.printStackTrace();
		}
		char erwartet = 'P';
		System.out.println(geheim);
		System.out.println(erwartet);
		assertEquals(geheim,erwartet);
		}
	
	}
