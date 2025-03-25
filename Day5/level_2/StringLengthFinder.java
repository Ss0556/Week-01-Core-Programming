import java.util.Scanner;

public class StringLengthFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        
        int customLength = findStringLength(input);
        int builtInLength = input.length();
        
        System.out.println("Custom length: " + customLength);
        System.out.println("Built-in length: " + builtInLength);
        System.out.println("Results match: " + (customLength == builtInLength));
        
        sc.close();
    }

    /**
     * Finds length of string without using length() method
     * @param str Input string
     * @return Length of string
     */
    public static int findStringLength(String str) {
        int count = 0;
        try {
            while(true) {
                str.charAt(count);
                count++;
            }
        } catch(StringIndexOutOfBoundsException e) {
            return count;
        }
    }
}