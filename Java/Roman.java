import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a Roman numeral:");
        String romanNumeral = scanner.nextLine();

        int integerEquivalent = convertRomanToInteger(romanNumeral);

        System.out.println("The integer equivalent is: " + integerEquivalent);
    }

    public static int convertRomanToInteger(String romanNumeral) {
        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

      
        for (int i = 0; i < romanNumeral.length(); i++) {
            char currentChar = romanNumeral.charAt(i);
            int current = romanValues.get(currentChar);
            
            int next = (i + 1 < romanNumeral.length()) ? romanValues.get(romanNumeral.charAt(i + 1)) : 0;

            
            if (current >= next) {
                result += current;
            } else {
             
                result -= current;
            }
        }

        return result;
}
}