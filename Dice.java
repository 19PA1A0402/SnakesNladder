package SNAKENLADDER;
class Dice{
    private int numOfdice;
    Dice(int numOfdice){
        this.numOfdice=numOfdice;
    }
    public int rolldice(){
        return ((int)(Math.random()*(6*numOfdice-1*numOfdice)))+1;
    }
}