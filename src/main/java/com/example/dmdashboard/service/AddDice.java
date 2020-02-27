package com.example.dmdashboard.service;

public class AddDice {

    public static int addRolls(int[] rolls) {

        int result = 0;

        for (int i = 0; i < rolls.length; i++) {
            result += rolls[i];
        }

        return result;

    }

}
