import java.lang.*;

public class Dice {

    private static int die1 = 0;
    private static int die2 = 0;
    private static int diceValue = 0;
    private static int whichPlayer = 0.0;
    private static int rankDie = 0;
    //rankDie = die1


    public Dice() {
        rollDice();
    }

    public void rollDice() {
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        diceValue = die1+die2;
    }

    public int getRankDie(){
        return die1;
    }


}
