import java.util.Scanner;

public class StringTrimmer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();
        
        String customTrim = trimSpaces(input);
        String builtInTrim = input.trim();
        
        System.out.println("\nCustom trim: '" + customTrim + "'");
        System.out.println("Built-in trim: '" + builtInTrim + "'");
        System.out.println("Results match: " + customTrim.equals(builtInTrim));
        
        sc.close();
    }

    public static String trimSpaces(String text) {
        int start = 0, end = text.length()-1;
        
        // Find first non-space character
        while(start <= end && text.charAt(start) == ' ') start++;
        
        // Find last non-space character
        while(end >= start && text.charAt(end) == ' ') end--;
        
        return substring(text, start, end+1);
    }

    public static String substring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for(int i=start; i<end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
}