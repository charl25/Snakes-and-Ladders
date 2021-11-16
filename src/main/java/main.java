import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SnakesAndLadders game = new SnakesAndLadders();
        boolean exit = true;

        while(exit){
            System.out.println("type play");
            String move = sc.nextLine();
            String [] action= move.split(" ");

            switch (action[0]){
                case "play":
                    game.throwDie();
                    game.position();
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
