package beginnerLevel.controlFlow;

import java.util.Random;

public class ArraysApp {

    public static void main(String[] args) {
        int [] lotteryNumbers = new int[5];

        Random randomNumberGenerator = new Random( );

        lotteryNumbers[0] = randomNumberGenerator.nextInt(90) +1;
        lotteryNumbers[1] = 90;
        lotteryNumbers[2] = 23;
        lotteryNumbers[3] = 54;
        lotteryNumbers[4] = 87;

        for (int lotteryNumber : lotteryNumbers ) {
            System.out.println(lotteryNumber);
        }

        int[][] weeklyLotteryNumbers = {
                {1,2,3,4,5},
                {10,20,30,40,50},
                {13,23,33,43,53},
                {14,26,37,48,52}
        };

        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {

            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
                System.out.print(weeklyLotteryNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
