package TheGameofMasterNIM;
import javax.swing.*;

public class MainNIM {



    public static void main(String[] args) {

        String input;
        System.out.println("Go!");

        do {
            Player.resetHumanCount();
            Human player = new Player();
            MasterNIM computer = new MasterNIM();
            Coins coins = new Coins();

            NIMgame game = new NIMgame(player, getRequest(), coins);

            game.play();

            input = JOptionPane.showInputDialog("Play again?");

        }
        while (input.equalsIgnoreCase("y")); {

        }


    }

    private static Human getRequest() {

        Human playerRequest;

        String input2 = JOptionPane.showInputDialog("Human first (H) or Computer first (C)?");

        if (input2.equalsIgnoreCase("C")) {

            playerRequest = new MasterNIM();

        } else {

            playerRequest = new Player();

        }


        return playerRequest;

    }


}