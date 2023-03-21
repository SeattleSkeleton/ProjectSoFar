package TheGameofMasterNIM;
public class NIMgame {

    Human player1;
    Human player2;
    Coins coins;





    public NIMgame(Human player1, Human player2, Coins coins) {
        this.coins = coins;
        if (player1.wantsFirstPlay()) {

            this.player1 = player1;
            this.player2 = player2;

        } //otherwise, player2 plays first
        else {

            this.player1 = player2;
            this.player2 = player1;

        }


        //if player1 wants to play first, then let him/her


    }





    public void play() {

        int amount;

        //keep the game going... (see 'while' condition at bottom)
        do {
            //prints remaining coins that are in pile
            System.out.println("Number of coin(s) remaining in pile: " + coins.getCoinsAmount());

            amount = player1.move(coins.getCoinsAmount());

            coins.removeCoins(amount);

            //prints how many coins player took from pile

            System.out.println("Player " + player1.getName() + " took " + amount + " coins from the pile.\n");



            //if after player 1's turn, there are no remaining coins
            //in pile, print that player 2 wins -- otherwise, it is
            //player 2's turn: the same process repeats from here
            if (coins.coinsAmount == 0) {

                System.out.println("Player " + player1.getName() + " wins "
                        + "the game!\n\n");

                break;

            }

            else {

                System.out.println("Number of coins remaining in pile: "
                        + coins.coinsAmount);

                amount = player2.move(coins.coinsAmount);

                coins.removeCoins(amount);

                System.out.println("Player " + player2.getName() + " took " + amount
                        + " coins from the pile.\n");

                if (coins.coinsAmount == 0) {

                    System.out.println("Player " + player2.getName() + " wins "
                            + "the game!\n\n");

                    break;

                }


            }
        }
        while (!(coins.getCoinsAmount() == 0));


    }
}
