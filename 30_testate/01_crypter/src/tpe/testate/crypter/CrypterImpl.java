package tpe.testate.crypter;
/**
 * Interface für die Verschlüsselung.
 *
 *  Dieses Interface dient dazu, Texte mit der speziellen TPE-Verschlüsselung
 *  zu verschlüsseln. Die Verschlüsselung funktioniert so, dass bestimmte
 *  Zeichen durch andere ersetzt werden.
 *
 *  Hierbei gilt die folgende Übersetzungstabelle:
 *
 *  <code>
 *    e -> 3
 *    3 -> e
 *    l -> 1
 *    1 -> l
 *    o -> 0
 *    0 -> o
 *    a -> 4
 *    4 -> a
 *    t -> 7
 *    7 -> t
 *  </code>
 *
 *  Aus dem Text "tpe im sose 2016 ist eine super vorlesung" würde nach
 *  dieser Regel "7p3 im s0s3 2ol6 is7 3in3 sup3r v0r13sung".
 *
 *  Bei der Verschlüsselung sind nur die Zeichen a-z, die Zahlen 0-9 und
 *  das Leerzeichen erlaubt.
 */
public class CrypterImpl implements Crypter{
	String input;
	String output = "";
	char temp;

	@Override
	public String encrypt(String input) throws IllegalArgumentException{
		output = "";
		input = input.toLowerCase();
		for (int j = 0; j < input.length(); j++) {
			char temp = input.charAt(j);
			int ascii = temp;
			if ((ascii >= 97 && ascii <= 122) ||
				(ascii >= 48 && ascii <= 57) ||
				 ascii == 32
				){
				output = output + aendern(temp);
			}else{
				throw new IllegalArgumentException();
			}

		}
		return output;
	}

	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		if (input.equals(input.toLowerCase())){
			return encrypt(input);
		}else{
			throw new IllegalArgumentException();
		}

	}

	char aendern(char temp){
		switch (temp){
		case 'e' : {
			temp = '3';
			break;
			}
		case '3' : {
			temp = 'e';
			break;
			}
		case 'l' : {
			temp = '1';
			break;
			}
		case '1' : {
			temp = 'l';
			break;
			}
		case 'o' : {
			temp = '0';
			break;
			}
		case '0' : {
			temp = 'o';
			break;
			}
		case 'a' : {
			temp = '4';
			break;
			}
		case '4' : {
			temp = 'a';
			break;
			}
		case '7' : {
			temp = 't';
			break;
			}
		case 't' : {
			temp = '7';
			break;
			}

		default : break;
		}
		return temp;
	}

}
