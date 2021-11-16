import java.util.HashMap;

public class SnakesAndLadders {

    HashMap<String, Integer> player = new HashMap<>();
    int play = 0;

    public SnakesAndLadders(){
        this.player.put("Player1",0);
    }

    public void throwDie(){
        int dieTose = (int)(Math.random()*6)+1;
        System.out.println("die :"+dieTose);
        switch (this.play){
            case 1:
                play(dieTose);
                break;
            case 0:
                if(dieTose == 6){
                    this.play = 1;
                }
                break;
        }
    }

    public void play(int moves){
        int position = this.player.get("Player1")+moves;

        switch (position){
            case 1:
                this.player.replace("Player1",38);
                break;
            case 4:
                this.player.replace("Player1",14);
                break;
            case 8:
                this.player.replace("Player1",30);
                break;
            case 21:
                this.player.replace("Player1",42);
                break;
            case 28:
                this.player.replace("Player1",76);
                break;
            case 32:
                this.player.replace("Player1",10);
                break;
            case 36:
                this.player.replace("Player1",6);
                break;
            case 48:
                this.player.replace("Player1",26);
                break;
            case 50:
                this.player.replace("Player1",67);
                break;
            case 62:
                this.player.replace("Player1",18);
                break;
            case 71:
                this.player.replace("Player1",92);
                break;
            case 80:
                this.player.replace("Player1",99);
                break;
            case 88:
                this.player.replace("Player1",24);
                break;
            case 95:
                this.player.replace("Player1",56);
                break;
            case 97:
                this.player.replace("Player1",78);
                break;
            default:
                this.player.replace("Player1",position);
                break;
        }
    }

    public void position(){
        System.out.println("Player at " +this.player.get("Player1"));
    }

}
