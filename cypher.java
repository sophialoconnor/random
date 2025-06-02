
import java.util.Scanner;

class encoded {

    public String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                char shifted = (char) ((character - base + shift) % 26 + base);
                result.append(shifted);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}

public class cypher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        encoded encoded = new encoded();
        System.out.println("Enter text to be encrypted: ");
        String inputText = scanner.nextLine();

        System.out.println("Enter shift key (0-25): ");
        int shiftKey = scanner.nextInt();

        String encrypted = encoded.encrypt(inputText, shiftKey);
        System.out.println("Encrypted text: " + encrypted);
    }
}
