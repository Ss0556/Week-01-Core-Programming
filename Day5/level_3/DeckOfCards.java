import java.util.Scanner;

public class DeckOfCards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the deck
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                         "Jack", "Queen", "King", "Ace"};
        
        String[] deck = initializeDeck(suits, ranks);
        
        // Shuffle the deck
        deck = shuffleDeck(deck);
        
        // Get input for number of players and cards to distribute
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();
        
        // Distribute cards
        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);
        
        // Print results
        printPlayersCards(players);
        
        scanner.close();
    }

    // Initialize deck of cards
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        
        return deck;
    }

    // Shuffle deck using Fisher-Yates algorithm
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Distribute cards to players
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        // Check if distribution is possible
        if (numPlayers * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
            System.exit(0);
        }
        
        String[][] players = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;
        
        for (int card = 0; card < cardsPerPlayer; card++) {
            for (int player = 0; player < numPlayers; player++) {
                players[player][card] = deck[cardIndex++];
            }
        }
        
        return players;
    }

    // Print each player's cards
    public static void printPlayersCards(String[][] players) {
        System.out.println("\nCards Distribution:");
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
        }
    }
}