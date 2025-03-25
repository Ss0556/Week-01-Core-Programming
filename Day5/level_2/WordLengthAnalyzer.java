import java.util.Scanner;

public class WordLengthAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
        String[][] wordsWithLengths = getWordsWithLengths(input);
        
        System.out.println("\nWord\t\tLength");
        System.out.println("---------------------");
        for(String[] pair : wordsWithLengths) {
            System.out.printf("%-10s\t%s\n", pair[0], pair[1]);
        }
        
        sc.close();
    }

    public static String[][] getWordsWithLengths(String text) {
        String[] words = splitWords(text);
        String[][] result = new String[words.length][2];
        
        for(int i=0; i<words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return result;
    }

    // Reusing methods from Program 1 and 2
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
                    private static String substring(String text, int start, int i) {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'substring'");
                    }
                
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