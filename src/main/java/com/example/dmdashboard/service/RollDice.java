package com.example.dmdashboard.service;

public class RollDice {

    public static int[] rollDice(String dice) {

        int[] rolls = new int[dice.split(" ").length];

        String[] allDice = dice.split(" ");

        for (int i = 0; i < allDice.length; i++) {
            rolls[i] = randomRoll(Integer.parseInt(allDice[i]));
        }

        return rolls;

    }

    public static int randomRoll(int die) {
        int rand = (int) (Math.random() * die + 1);
        return rand;
    }

}
