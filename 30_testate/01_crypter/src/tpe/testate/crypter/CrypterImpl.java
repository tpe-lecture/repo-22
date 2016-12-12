package tpe.testate.crypter;

/**
 * Klasse zur sicheren Ver- und Entschlüsselung von Hochsicherheitsgeheimnissen.
 */
public class CrypterImpl implements Crypter {
  String input;
  String output;
  char temp;

  @Override
    public String encrypt(String input) throws IllegalArgumentException {
    output = "";
    input = input.toLowerCase();
    for (int j = 0; j < input.length(); j++) {          //für jeden zu verschlüsselnden Buchstaben:
      char temp = input.charAt(j);
      int ascii = temp;
      if ((ascii >= 97 && ascii <= 122)                 // Kleine Buchstaben
             || (ascii >= 48 && ascii <= 57)            // Zahlen
             || ascii == 32) {                          //Leerzeichen

        output = output + aendern(temp);                //Möglicherweise geändertes Zeichen anhängen
      } else {
        throw new IllegalArgumentException();
      }
    }
    return output;
  }

  @Override
    public String decrypt(String input) throws IllegalArgumentException {
    if (input.equals(input.toLowerCase())) {                //falls sich nichts ändert,
      return encrypt(input);                                    //sind alle Buchstaben klein.
    } else {
      throw new IllegalArgumentException();
    }
  }

  /**
  * Ändert alle angegebenen Buchstaben auf den dazugehöhrigen Partner.
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
  * @param ch zu überprüfender Buchstabe
  * @return möglicherweise geänderter Buchstabe
   */
  char aendern(char ch) {
    switch (ch) {
      case 'e': {
        ch = '3';
        break;
      }
      case '3': {
        ch = 'e';
        break;
      }
      case 'l': {
        ch = '1';
        break;
      }
      case '1': {
        ch = 'l';
        break;
      }
      case 'o': {
        ch = '0';
        break;
      }
      case '0': {
        ch = 'o';
        break;
      }
      case 'a': {
        ch = '4';
        break;
      }
      case '4': {
        ch = 'a';
        break;
      }
      case '7': {
        ch = 't';
        break;
      }
      case 't': {
        ch = '7';
        break;
      }

      default:
        break;
    }
    return ch;
  }
}
