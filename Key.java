package Crypter;

public class Key<T> {
	
	private T key;
	public Key(T key){
		this.key=key;
	}
	public String getKey(){
		return toString();
	}
	
	public String toString(){
		return key.toString();
	}
}
 