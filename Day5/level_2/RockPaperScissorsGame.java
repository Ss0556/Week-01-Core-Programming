import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many games would you like to play? ");
        int games = sc.nextInt();
        
        playGames(games);
        
        sc.close();
    }

    public static void playGames(int totalGames) {
        int playerWins = 0, computerWins = 0, ties = 0;
        Scanner sc = new Scanner(System.in);
        
        for(int i=1; i<=totalGames; i++) {
            System.out.println("\nGame " + i);
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String playerChoice = sc.next().toLowerCase();
            String computerChoice = getComputerChoice();
            
            System.out.println("Computer chose: " + computerChoice);
            
            String result = determineWinner(playerChoice, computerChoice);
            System.out.println("Result: " + result);
            
            if(result.equals("Player wins")) playerWins++;
            else if(result.equals("Computer wins")) computerWins++;
            else ties++;

            sc.close();
        }
        
        printStats(totalGames, playerWins, computerWins, ties);
    }

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        return switch(choice) {
            case 0 -> "rock";
            case 1 -> "paper";
            case 2 -> "scissors";
            default -> "";
        };
    }

    public static String determineWinner(String player, String computer) {
        if(player.equals(computer)) return "Tie";
        
        return switch(player) {
            case "rock" -> computer.equals("scissors") ? "Player wins" : "Computer wins";
            case "paper" -> computer.equals("rock") ? "Player wins" : "Computer wins";
            case "scissors" -> computer.equals("paper") ? "Player wins" : "Computer wins";
            default -> "Invalid player choice";
        };
    }

    public static void printStats(int totalGames, int playerWins, int computerWins, int ties) {
        double playerPercent = (double)playerWins / totalGames * 100;
        double computerPercent = (double)computerWins / totalGames * 100;
        
        System.out.println("\nGame Statistics");
        System.out.println("-----------------------------");
        System.out.printf("Total Games: %d\n", totalGames);
        System.out.printf("Player Wins: %d (%.1f%%)\n", playerWins, playerPercent);
        System.out.printf("Computer Wins: %d (%.1f%%)\n", computerWins, computerPercent);
        System.out.printf("Ties: %d\n", ties);
    }
}