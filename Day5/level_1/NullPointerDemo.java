public class NullPointerDemo {

    public static void main(String[] args) {
        // Display program title
        System.out.println("NullPointerException Demonstration");
        
        // Demonstrate exception generation
        System.out.println("\n1. Generating Exception:");
        generateNullPointerException();
        
        // Demonstrate exception handling
        System.out.println("\n2. Handling Exception:");
        handleNullPointerException();
    }

    /**
     * Demonstrates NullPointerException by calling method on null reference
     */
    @SuppressWarnings("null")
    public static void generateNullPointerException() {
        // Create null string reference
        String nullStr = null;
        
        // This will throw NullPointerException
        System.out.println("String length: " + nullStr.length());
    }

    /**
     * Demonstrates handling NullPointerException
     */
    @SuppressWarnings("null")
    public static void handleNullPointerException() {
        // Create null string reference
        String nullStr = null;
        
        try {
            // Attempt to call method on null reference
            System.out.println("String length: " + nullStr.length());
        } catch (NullPointerException e) {
            // Catch and handle the exception
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}