import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter game mode");
        String mode = sc.nextLine();
        String[] gameMode = mode.split(" "); // this states how many players are in the game

        SnakesAndLadders game = new SnakesAndLadders(Integer.parseInt(gameMode[0])); // creates an instance of the gameClass with the game mode as a paramater
        int player = game.playersList(); // will be used to represent the players playing the game
        boolean exit = true;

        while(exit){

            for (int i = 1; i <=player; i++) {

                System.out.println("type play");
                String move = sc.nextLine();
                String[] action = move.split(" ");

                switch (action[0]) {
                    case "p":
                        game.throwDie(i);
                        if(game.getTose() == 6) i--;
                        break;
                    case "exit":
                        exit = false;
                        break;
                    default:
                        System.out.println("invalid command");
                        break;
                }
            }
        }

    }
}
