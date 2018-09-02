package util;

import java.util.Random;

public class ComputerName {

    private static String computerName;

    public static void newComputerName() {
        computerName = "";

    }

    public static String getUniqueComputerName() {
        return computerName;
    }

    public static void setComputerName() {
        String computerPrefix = "[AUTO_COMPUTER] - Test_";
        computerName = computerPrefix + randomNum();
    }


    public static int randomNum() {
        Random rand = new Random();
        return rand.nextInt(500) + 1;
    }

}
