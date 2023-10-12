import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        String playerOne;
        String playerTwo;
        boolean doneOne = false;
        boolean doneTwo = false;
        String continueYN;

        //play prompt
        System.out.println("Would you like to play? Type [Y/N]: ");
        continueYN = scan.nextLine();
        continueYN = continueYN.UpperCase();
        if (continueYN.equals("Y")) {
            //loops until player 1 gives a valid response(R, P, or S)
            do {
                System.out.println("Player 1, what's your move? [R, P, or S]: ");
                playerOne = scan.nextLine();
                playerOne = playerOne.toUpperCase();
                if (playerOne.equals("R") || playerOne.equals("P") || playerOne.equals("S")) {
                    doneOne = true;
                } else {
                    System.out.println("Invalid Response");
                }
            } while (!doneOne);

            //loops until player 2 gives a valid response(R, P, or S)
            do {
                System.out.println("Player 2, what's your move? [R, P, or S]: ");
                playerTwo = scan.nextLine();
                playerTwo = playerTwo.toUpperCase();
                if (playerTwo.equals("R") || playerTwo.equals("P") || playerTwo.equals("S")) {
                    doneTwo = true;
                } else {
                    System.out.println("Invalid Response");
                }
            } while (!doneTwo);

            //WHO WINS?????
            if (playerOne.equals("R") && playerTwo.equals("S")) {
                System.out.println("Rock breaks scissors!");
                System.out.println("\nPlayer one wins!");
            } else if (playerOne.equals("R") && playerTwo.equals("P")) {
                System.out.println("Paper covers rock!");
                System.out.println("\nPlayer two wins!");
            } else if (playerOne.equals("P") && playerTwo.equals("R")) {
                System.out.println("Paper covers rock!");
                System.out.println("\nPlayer one wins!");
            } else if (playerOne.equals("P") && playerTwo.equals("S")) {
                System.out.println("Scissors cuts paper!");
                System.out.println("\nPlayer two wins!");
            } else if (playerOne.equals("S") && playerTwo.equals("R")) {
                System.out.println("Rock breaks scissors!");
                System.out.println("\nPlayer two wins!");
            } else if (playerOne.equals("S") && playerTwo.equals("P")) {
                System.out.println("Scissors cuts paper!");
                System.out.println("\nPlayer one wins!");
            } else if (playerOne.equals(playerTwo)) {
                System.out.println("It's a tie!");
            }
        } else if (continueYN.equals("N")) {
            System.out.println("Then why are you here buddy");
        } else {
            System.out.println("Invalid Response");
        }
    }
}