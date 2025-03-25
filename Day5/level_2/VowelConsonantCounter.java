import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        int[] counts = countVowelsAndConsonants(input);
        System.out.println("\nVowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        
        sc.close();
    }

    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        
        for(int i=0; i<text.length(); i++) {
            char c = text.charAt(i);
            if(isVowel(c)) vowels++;
            else if(isLetter(c)) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean isLetter(char c) {
        c = Character.toLowerCase(c);
        return c >= 'a' && c <= 'z';
    }
}