package Collection;
import java.util.HashMap;
import java.util.Scanner;


public class Scoreboard {

	public static void main(String[] args) {
		HashMap<String, Integer> scoreboard = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Scoreboard Menu ---");
            System.out.println("1. Add Player");
            System.out.println("2. Update Score");
            System.out.println("3. Display Scores");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter player name: ");
                    String name = scanner.nextLine();
                    if (scoreboard.containsKey(name)) {
                        System.out.println("Player already exists!");
                    } else {
                        scoreboard.put(name, 0); 
                        System.out.println("Player added.");
                    }
                    break;

                case 2:
                    System.out.print("Enter player name to update score: ");
                    String player = scanner.nextLine();
                    if (scoreboard.containsKey(player)) {
                        System.out.print("Enter score to add: ");
                        int scoreToAdd = scanner.nextInt();
                        scanner.nextLine(); 
                        Integer currentScore = scoreboard.get(player);
                        scoreboard.put(player, currentScore + scoreToAdd);  
                        System.out.println("Score updated.");
                    } else {
                        System.out.println("Player not found!");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Scoreboard ---");
                    for (String p : scoreboard.keySet()) {
                        System.out.println(p + ": " + scoreboard.get(p));
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        scanner.close();

	}

}
