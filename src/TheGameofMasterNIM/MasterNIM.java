package TheGameofMasterNIM;
import java.util.Random;


public class MasterNIM implements Human {

    String name;                //name of player
    boolean playerRequest = true;    //player has first move


    public MasterNIM() {

        name = "Master Nim";
    }

    @Override
    public int move(int coinsAmount) {



        int coinTake = 0;

        if (coinsAmount == 11 || coinsAmount == 7 || coinsAmount == 3) {
            coinTake = 3;
        }


        if (coinsAmount == 10 || coinsAmount == 6 || coinsAmount == 2) {
            coinTake = 2;
        }


        if (coinsAmount == 9 || coinsAmount == 5 || coinsAmount == 1) {
            coinTake = 1;
        }

        if (coinsAmount == 12 || coinsAmount == 8 || coinsAmount == 4) {
            coinTake = 1;
        }


        //while (playerRequest == false)





        return coinTake;



        }













    @Override
    public boolean wantsFirstPlay() {

        return playerRequest;      //returns if players wants first play

    }


    @Override
    public String getName() {

        return name;   //returns name of player

    }
}