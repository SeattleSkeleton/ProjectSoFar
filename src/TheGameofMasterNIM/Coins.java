package TheGameofMasterNIM;
import java.util.Random;

public class Coins {
    int coinsAmount;

    public Coins() {

        coinsAmount = 12;
    }

    public int getCoinsAmount() {
        return coinsAmount;
    }

    public void removeCoins(int taken) {
        coinsAmount = coinsAmount - taken;

    }
}