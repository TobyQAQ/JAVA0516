package practice;

import java.util.Random;


public class dice {
    public static void main(String[] args) {
        int[] score = new int[50];
        int[] count = new int[6];
        for (int i = 0; i < 50; i++) {
            score[i] = RollDice();
        }
        for (int i = 0; i < 50; i++) {
            System.out.println(score[i]);
        }
        for (int i = 0; i < 50; i++) {
            int temp = score[i];
            count[temp-1]++;
        }

    }
    public static int RollDice() {
        Random a = new Random();

    return (a.nextInt(6) + 1);
    }


}
