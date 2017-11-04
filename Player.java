public class Player {

    private static int rank = 0;
    private static double money = 0.0;
    private static int fame = 0;
    private static int whichPlayer = 0;
    private static boolean turn = true;

    public Player() {
        setRank(rank);
        setMoney(money);
        setFame(fame);
        setPlayer(whichPlayer);
    }

    public static void setRank(int playerRank){
        rank = playerRank;
    }

    public static void setMoney(double playerMoney){
        money = playerMoney;
    }

    public static void setFame(int playerFame){
        fame = playerFame;
    }

    public static void setPlayer(int playerWhich) {
        whichPlayer = playerWhich;
    }

    public static int getRank(){
        return rank;
    }

    public static double getMoney(){
        return money;
    }

    public static int getFame(){
        return fame;
    }

    public static int getPlayer() {
        return whichPlayer;
    }

    public void improveRank() {
        rank = rank + 1;
    }

    public void endTurn(){
        turn = false;
        //if end turn, then set the flag, turn to false for a player.
    }

    /*
    choose movement()
    choose role()
    act or rehearse()
    endturn()
    */


}
