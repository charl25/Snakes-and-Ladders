import java.util.HashMap;

public class SnakesAndLadders {

    HashMap<String, Integer> player = new HashMap<>(); // list of players and they positions on the board
    HashMap<String, Integer> playerStatus = new HashMap<>(); // multiplayer states

    public SnakesAndLadders(int mode){

        for(int i = 1; i<= mode;i++){
            String player = "player" +i;
            this.player.put(player,0);
            this.playerStatus.put(player,0);
        }
    }

    public void throwDie(int playing){
            String player = "player" +playing;
            int dieTose = (int)(Math.random()*6)+1;
            System.out.println("die :"+dieTose);
            switch (this.playerStatus.get(player)){
                case 1:
                    play(player,dieTose);
                    break;
                case 0:
                    if(dieTose == 6){
                        this.playerStatus.replace(player,1);
                    }
                    break;
            }
            position(player);
    }

    public void play(String player, int moves){
        int position = this.player.get(player)+moves;

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
        if(this.player.get(player)>=100){
            System.out.println(player +" has completed");
            this.playerStatus.replace(player,0);
        }else{
            System.out.println(player+" at " +this.player.get(player));
        }
    }

    public int playersList(){
        return this.player.size();
    }

}
