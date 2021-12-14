package SNAKENLADDER;
import java.util.*;
public class Main {
    private static Board board;
    Dice dice;

    public  static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("enter no od dices");
          int numOfDice = sc.nextInt();
          sc.nextLine();
          System.out.println("enter no of snakes");
          int noOfSnakes = sc.nextInt();
          sc.nextLine();
          List<Jumper> snakes = new ArrayList<Jumper>();
          for(int i = 0;i<noOfSnakes;i++){
                  snakes.add(new Jumper(sc.nextInt(),sc.nextInt()));
          }
          System.out.println("enter no of ladders");
          int noOfLadders = sc.nextInt();
          sc.nextLine();
          List<Jumper> ladders = new ArrayList<Jumper>();
          for(int j = 0;j<noOfLadders;j++){
              ladders.add(new Jumper(sc.nextInt(),sc.nextInt()));
          }
          int noOfPlayers = sc.nextInt();
          sc.nextLine();
          Map<String,Integer> p2=new HashMap<>();
          Queue <Player> playerlist = new LinkedList<>();
          for(int i=0;i<noOfPlayers;i++){
              String names=sc.nextLine();
              Player p1 = new Player(names);
              playerlist.add(p1);
              p2.put(names,0);
          }
          int boardSize = 100;
          board = new Board(dice,boardSize,snakes,ladders,p2,playerlist);
          Board b1=board;
          b1.startgame();
    }

    public Main(Dice dice) {
        this.dice = dice;
    }
}
