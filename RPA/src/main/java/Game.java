public class Game {

    private static String computer;
    private static String player;

    public static void setMoves(){
        computer = Computer.getComputerMove();
        player = Player.getPlayerMove();
    }

    public static String compareChoices(String computer, String player) {

        if (computer.equals("paper") && player.equals("rock")){
            return "Computer wins!";
        }else if (computer.equals("rock") && player.equals("scissors")){
            return "Computer wins!";
        }else if (computer.equals("scissors") && player.equals("paper")){
            return "Computer wins!";
        }else if (computer.equals(player)){
            return "It's a tie!";
        }
        else{
            return "Player wins!";
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome Player!\n");

        String playerMove;
        if (Computer.moves.isEmpty()){
            Computer.getMoves();
        }

        do{
            playerMove = Player.input();
        }while(Player.validateInput(playerMove).equals("ERROR"));

        Player.setPlayerMove(playerMove);

        Computer.setComputerMove();
        setMoves();

        System.out.println("Player --> " + player +
                "\nComputer -- > " + computer);
        System.out.println("\n" + compareChoices(computer, player));


    }
}
