import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence:");
        String input = scanner.nextLine();

        boolean isPangram = checkIfPangram(input.toLowerCase());

        if(isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String input) {
        boolean[] alphabet = new boolean[26];
        int index;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                index = input.charAt(i) - 'a';
                alphabet[index] = true;
            }
        }
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }
        return true;
}
}