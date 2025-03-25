import java.util.Scanner;

public class WordLengthFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
        String[][] wordsWithLengths = getWordsWithLengths(input);
        String[] shortestLongest = findShortestAndLongest(wordsWithLengths);
        
        System.out.println("\nShortest word: " + shortestLongest[0]);
        System.out.println("Longest word: " + shortestLongest[1]);
        
        sc.close();
    }

    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];
        
        for(String[] pair : wordsWithLengths) {
            int len = Integer.parseInt(pair[1]);
            if(len < shortest.length()) shortest = pair[0];
            if(len > longest.length()) longest = pair[0];
        }
        return new String[]{shortest, longest};
    }

    // Reusing methods from previous programs
    public static String[][] getWordsWithLengths(String text) { 
        String[] words = splitWords(text);
                String[][] result = new String[words.length][2];
                
                for(int i=0; i<words.length; i++) {
                    result[i][0] = words[i];
                    result[i][1] = String.valueOf(findStringLength(words[i]));
                                    }
                                    return result;
                                }
                            
                                private static char[] findStringLength(String string) {
                            // TODO Auto-generated method stub
                            throw new UnsupportedOperationException("Unimplemented method 'findStringLength'");
                        }
                    
                                private static String[] splitWords(String text) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'splitWords'");
            }
}