import java.util.HashMap;
import java.util.Map;

public class SnakesAndLadders {

    HashMap<String, Integer> player = new HashMap<>(); // list of players and they positions on the board
    HashMap<String, Integer> playerStatus = new HashMap<>(); // multiplayer states
    int dieTose;

    public SnakesAndLadders(int mode){

        for(int i = 1; i<= mode;i++){
            String player = "player" +i;
            this.player.put(player,0);
            this.playerStatus.put(player,0);
        }
    }

    public void throwDie(int playing){
            String player = "player" +playing;
             this.dieTose = (int)(Math.random()*6)+1;
            System.out.println("die :"+this.dieTose);
            switch (this.playerStatus.get(player)){
                case 1:
                    play(player,this.dieTose);
                    break;
                case 0:
                    if(this.dieTose == 6){
                        this.playerStatus.replace(player,1);
                    }
                    break;
            }
            position(player);
    }

    public void play(String player, int moves){
        int position = this.player.get(player)+moves;

        //checks if the player is sitting on the same position as another player, and removes the player which was there first
        samePosition(this.player,position);

        switch (position){
            case 1:
                this.player.replace(player,38);
                break;
            case 4:
                this.player.replace(player,14);
                break;
            case 8:
                this.player.replace(player,30);
                break;
            case 21:
                this.player.replace(player,42);
                break;
            case 28:
                this.player.replace(player,76);
                break;
            case 32:
                this.player.replace(player,10);
                break;
            case 36:
                this.player.replace(player,6);
                break;
            case 48:
                this.player.replace(player,26);
                break;
            case 50:
                this.player.replace(player,67);
                break;
            case 62:
                this.player.replace(player,18);
                break;
            case 71:
                this.player.replace(player,92);
                break;
            case 80:
                this.player.replace(player,99);
                break;
            case 88:
                this.player.replace(player,24);
                break;
            case 95:
                this.player.replace(player,56);
                break;
            case 97:
                this.player.replace(player,78);
                break;
            default:
                this.player.replace(player,position);
                break;
        }
    }

    public void position(String player){
        if(gameState(player)){
            System.out.println(player +" has won the game");
            this.playerStatus.replace(player,0);
        }else{
            System.out.println(player+" at " +this.player.get(player));
        }
    }

    public int playersList(){
        return this.player.size();
    }

    public int getTose(){
        return this.dieTose;
    }

    public boolean gameState(String player){
        int position = this.player.get(player);
        if(position == 100){
            return true;
        }else if(position>100){
            int newPosition = 100-(position -100);
            this.player.replace(player,newPosition);
            return false;
        }
        return  false;
    }

    //code below is a trial of a player getting kicked by another and they have to restart in the game

    public  <K, V> void samePosition(Map<K, V> map, V value){
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                String restartPlayer = (String) entry.getKey();
                this.player.replace(restartPlayer,0);
                this.playerStatus.replace(restartPlayer,0);
                System.out.println(restartPlayer+" has been knocked to the start");
            }
        }
    }

}