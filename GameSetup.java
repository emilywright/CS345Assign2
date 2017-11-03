
public class GameSetup {

    private static int numberPlayers = 0;
    private static int rank = 0;
    private static double currency = 0.0;
    private static int boardSetup = 0;
    private static int sceneShots = 0;
    private static int sceneCards = 0;


    public GameSetup() {
        setNumPlayers(numberPlayers);
        setRank(rank);
        setRank(currency);
        setSceneShots(sceneShots);
        setSceneCards(sceneCards);
    }

    public static int setNumPlayers(int numplayers){
        numberPlayers = numplayers;
        return numberPlayers;
    }

    public static int setRank(int ranking) {
        rank = ranking;
        return rank;
    }

    public static double setCurrency(double currencyPlayer) {
        currency = currencyPlayer;
        return currency;
    }

    public static int setSceneShots(int sceneshots) {
        sceneShots = sceneshots;
        return sceneShots;
    }

    public static void setSceneCards(int sceneCards) {

    }
}
