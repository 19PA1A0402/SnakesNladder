package SNAKENLADDER;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Board {
    private static final boolean True = false;
    private Dice dice;
    private int boardSize;
    private Queue<Player> players;
    private List<Jumper> snakesposition;
    private List<Jumper> ladderpostion;
    private Map<String, Integer> playerlist;
    private List<Jumper> snakespostion;
    public Board(Dice dice,int boardSize,List<Jumper> snakespostion,List<Jumper> ladderpostion,Map<String,Integer> playerlist,Queue<Player> players){
        this.boardSize=boardSize;
        this.dice=dice;
        this.snakespostion=snakespostion;
        this.ladderpostion=ladderpostion;
        this.playerlist=playerlist;
        this.players=players;
    }
    

    public void startgame(){
        Player p1=players.poll();
        int oldpostion = playerlist.get(p1);
        var newpostion=oldpostion+Dice.rollDice();
        while(True){
            Object newposition;
            if(newpostion>boardSize){
                System.out.println("next time better luck");
            }
            else if(newposition.equals(boardSize)){
                System.out.println("won the game");
            }
            else if(newpostion<boardSize){
                int[] nextPosition= new int[1];
               boolean[] b =new boolean[1];
                nextPosition[0]=newpostion;
               Object nextCell;
            snakespostion.forEach(v-> {
                   if(v.startPoint==nextCell) {
                       nextPosition[0] = v.endPoint;
                   } } );
                   if(nextPosition[0] != newpostion) System.out.println(p1.getName() + " Bitten by Snake present at: "+ newpostion);
                ladderpostion.forEach(v-> {
                    if(v.startPoint==nextCell) {
                        nextPosition[0] = v.endPoint;
                        b[0]=true;
                    } } );
                if(nextPosition[0] != newpostion && !b[0]) System.out.println(p1.getName() + " Got ladder present at: "+ newpostion);
            
            }else{
                Integer[] nextPosition;
                playerlist.put(p1.getName(),nextPosition[0]);
                System.out.println(p1.getName() + " is at position "+ nextPosition[0]);
            }
            players.add(p1);
        }
    }


    public Board(int boardSize) {
        this.boardSize = boardSize;
    }
}

}



