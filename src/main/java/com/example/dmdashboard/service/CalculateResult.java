package com.example.dmdashboard.service;

import java.util.ArrayList;

public class CalculateResult {

    public static double calculateResult(String equation) {

        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 0; i < equation.split(" ").length; i++) {
            arrayList.add(equation.split(" ")[i]);
        }

        while(arrayList.contains("*") || arrayList.contains("/")) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).equals("*")) {
                    double tempResult = Double.parseDouble(arrayList.get(i - 1)) * Double.parseDouble(arrayList.get(i + 1));
                    arrayList.set(i, Double.toString(tempResult));
                    arrayList.remove(i - 1);
                    arrayList.remove(i);
                    i--;
                } else if (arrayList.get(i).equals("/")) {
                    double tempResult = Double.parseDouble(arrayList.get(i - 1)) / Double.parseDouble(arrayList.get(i + 1));
                    arrayList.set(i, Double.toString(tempResult));
                    arrayList.remove(i - 1);
                    arrayList.remove(i);
                    i--;
                }
            }
        }

        while(arrayList.contains("+") || arrayList.contains("-")) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).equals("+")) {
                    double tempResult = Double.parseDouble(arrayList.get(i - 1)) + Double.parseDouble(arrayList.get(i + 1));
                    arrayList.set(i, Double.toString(tempResult));
                    arrayList.remove(i - 1);
                    arrayList.remove(i);
                    i--;
                } else if (arrayList.get(i).equals("-")) {
                    double tempResult = Double.parseDouble(arrayList.get(i - 1)) - Double.parseDouble(arrayList.get(i + 1));
                    arrayList.set(i, Double.toString(tempResult));
                    arrayList.remove(i - 1);
                    arrayList.remove(i);
                    i--;
                }
            }
        }

        return Double.parseDouble(arrayList.get(0));

    }

}
