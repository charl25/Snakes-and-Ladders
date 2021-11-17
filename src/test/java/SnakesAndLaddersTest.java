import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnakesAndLaddersTest {
    @Test
    public void shouldThrowRandomDie(){
        SnakesAndLadders game = new SnakesAndLadders(1);

        game.throwDie(1);

        assertEquals(true,game.getTose()<=6);
    }

    @Test
    public void shouldMoveUpTheLadder(){
        SnakesAndLadders game = new SnakesAndLadders(1);
        while(game.getTose() !=6){
        game.throwDie(1);}
        game.play("player1",1);
        game.position("player1");

        assertEquals(38,game.player.get("player1"));
    }

    @Test
    public void shouldMoveDownTheSnake(){
        SnakesAndLadders game = new SnakesAndLadders(1);
        while(game.getTose() !=6){
            game.throwDie(1);}
        game.play("player1",1);
        game.play("player1",6);
        game.play("player1",4);
        game.position("player1");

        assertEquals(26,game.player.get("player1"));
    }

    @Test
    public void shouldHaveMoreThenOnePLayer(){
        SnakesAndLadders game = new SnakesAndLadders(4);
        System.out.println("number of players is "+ game.playersList());
        assertEquals(4, game.playersList());
    }

    @Test
    public void shouldCongratulatePlayerForWinning(){
        SnakesAndLadders game = new SnakesAndLadders(1);
        game.playerStatus.replace("player1",1);
        game.play("player1",1);
        game.play("player1",6);
        game.play("player1",6);
        game.play("player1",4);
        game.play("player1",6);
        game.play("player1",2);
        game.position("player1");

        assertEquals(true,game.gameState("player1"));
    }

//    @Test
//    public void shouldSendPlayerToTheStartWhenConflict(){
//        SnakesAndLadders game = new SnakesAndLadders(2);
//        game.playerStatus.replace("player1",1);
//        game.playerStatus.replace("player2",1);
//
//        game.play("player1",6);
//        game.position("player1");
//
//        game.play("player2",4);
//        game.position("player2");
//
//        game.position("player1");
//
//        assertEquals(0,game.playerStatus.get("player1"));
//
//    }
}
