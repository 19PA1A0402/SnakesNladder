package SNAKENLADDER;
class Jumper{
    private int start;
    private int end;
    public Object startPoint;
    public Object endPoint;
    public Jumper(int start,int end){
        this.start=start;
        this.end=end;
    }
     public int  getstart(){
         return start;
     }
    public int getend(){
        return end;
    }
}
class Snake extends Jumper{
    public Snake(int start,int end){
        super(start,end);
    }
}
class Ladder extends Jumper{
    public Ladder(int start,int end){
        super(start,end);
    }
}