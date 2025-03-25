import java.util.Scanner;

public class CharacterTypeIdentifier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String[][] charTypes = getCharacterTypes(input);
        printCharacterTypes(charTypes);
        
        sc.close();
    }

    public static String[][] getCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];
        
        for(int i=0; i<text.length(); i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = getCharType(c);
        }
        return result;
    }

    public static String getCharType(char c) {
        if(!isLetter(c)) return "Not a Letter";
        return isVowel(c) ? "Vowel" : "Consonant";
    }

    public static void printCharacterTypes(String[][] charTypes) {
        System.out.println("\nCharacter\tType");
        System.out.println("---------------------");
        for(String[] pair : charTypes) {
            System.out.printf("%-10s\t%s\n", pair[0], pair[1]);
        }
    }

    // Reusing methods from Program 5
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean isLetter(char c) {
        c = Character.toLowerCase(c);
        return c >= 'a' && c <= 'z';
    }
}