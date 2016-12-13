package tpe.testate.crypter;

/**
 * Klasse zur sicheren Ver- und Entschlüsselung von
 * Hochsicherheitsgeheimnissen.
 */
public class CrypterImpl implements Crypter {
	String input;
	String output;
	char temp;

	/**
	 * Methode zur Verschluesselng.
	 *
	 * @param input
	 *            zu verschluesselnder String
	 */
	@Override
	public String encrypt(String input) throws IllegalArgumentException {
		output = "";
		input = input.toLowerCase();
		input = input.toLowerCase();
		for (int j = 0; j < input.length(); j++) { // fuer jeden zu
													// verschluesselnden
													// Buchstaben:
			char temp = input.charAt(j);
			int ascii = temp;
		      if ((temp >= 'a' && temp <= 'z') // Kleine Buchstaben
	                    || (temp >= '0' && temp <= '9') // Zahlen
	                    || temp == ' ') { // Leerzeichen

				output = output + aendern(temp); // Moeglicherweise gaendertes
													// Zeichen anhaengen
			} else {
				throw new IllegalArgumentException();
			}
		}
		return output;
	}

	  /**
	   * Methode zur Entschluesselng.
	   *
	   * @param input zu entschluesselnder String
	   */
	@Override
	public String decrypt(String input) throws IllegalArgumentException {
	    if (input.equals(input.toLowerCase()) && checkForInvalicChar(input)) {
	      // falls sich nichts aendert,
	      return encrypt(input); // sind alle Buchstaben klein.
		} else {
			throw new IllegalArgumentException();
		}
	}
	/**
	 * Ueberprueft beim entschluesseln ob der Buchstabe unterstuetzt wird.
	 * @param test der zu testende Buchstabe
	 * @return	gibt zurueck ob der Buchstabe unterstuetzt wird.
	 * @throws IllegalArgumentException
	 */
	 private boolean checkForInvalicChar(String test) throws IllegalArgumentException {
		    test = test.toLowerCase();
		    for (int j = 0; j < test.length(); j++) { // fuer jeden zu verschluesselnden Buchstaben:
		      char temp = test.charAt(j);
		      if ((temp >= 'a' && temp <= 'z') // Kleine Buchstaben
		                        || (temp >= '0' && temp <= '9') // Zahlen
		                        || temp == ' ') { // Leerzeichen
		      } else {
		        throw new IllegalArgumentException();
		      }
		    }
		    return true;
		  }


	 /**
	   * Aendert alle angegebenen Buchstaben auf den dazugehoehrigen Partner. <code>
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
	   * @param ch zu Ueberpruefender Buchstabe
	   * @return moeglicherweise geaenderter Buchstabe
	   */
	  private char aendern(char ch) {
		switch (ch) {
		case 'e':
			ch = '3';
			break;

		case '3':
			ch = 'e';
			break;

		case 'l':
			ch = '1';
			break;

		case '1':
			ch = 'l';
			break;

		case 'o':
			ch = '0';
			break;

		case '0':
			ch = 'o';
			break;

		case 'a':
			ch = '4';
			break;

		case '4':
			ch = 'a';
			break;

		case '7':
			ch = 't';
			break;

		case 't':
			ch = '7';
			break;


		default:
			break;
		}

		return ch;
	}
}
