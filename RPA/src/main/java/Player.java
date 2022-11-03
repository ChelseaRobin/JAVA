import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private static final Scanner sc = new Scanner(System.in);
    public static ArrayList<String> moves = new ArrayList<>();
    private static String playerMove;

    public static void getMoves() {
        moves.add("rock");
        moves.add("paper");
        moves.add("scissors");
    }

    public static String validateInput(String input) {
        if (moves.isEmpty()){
            getMoves();
        }
        if(!moves.contains(input)){
            return "ERROR";
        }return "OK";
    }

    public static String getPlayerMove(){
        return playerMove;
    }

    protected static void setPlayerMove(String input) {
        playerMove = input;
    }


    /**
     * It takes a string as an argument, prints it to the console, then waits for the user to enter a string, and returns
     * that string
     *
     * @return The input from the user.
     */
    public static String input() {
        System.out.println("Make your move: ");
        String input = sc.nextLine();

        while (input.isBlank()) {
            System.out.println("Make your move: ");
            input = sc.nextLine();
        }
        return input.strip();
    }
}
