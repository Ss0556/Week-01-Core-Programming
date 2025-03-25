import java.util.Scanner;

public class WordSplitter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
        String[] customSplit = splitWords(input);
        String[] builtInSplit = input.split(" ");
        
        System.out.println("\nCustom split:");
        printArray(customSplit);
        System.out.println("\nBuilt-in split:");
        printArray(builtInSplit);
        
        sc.close();
    }

    /**
     * Splits string into words without using split()
     * @param text Input string
     * @return Array of words
     */
    public static String[] splitWords(String text) {
        int wordCount = 1;
        for(int i=0; i<text.length(); i++) {
            if(text.charAt(i) == ' ') wordCount++;
        }
        
        String[] words = new String[wordCount];
        int start = 0, index = 0;
        
        for(int i=0; i<=text.length(); i++) {
            if(i == text.length() || text.charAt(i) == ' ') {
                words[index++] = substring(text, start, i);
                start = i+1;
            }
        }
        return words;
    }

    public static String substring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for(int i=start; i<end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static void printArray(String[] arr) {
        for(String s : arr) {
            System.out.println(s);
        }
    }
}