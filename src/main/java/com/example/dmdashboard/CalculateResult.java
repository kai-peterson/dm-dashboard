package com.example.dmdashboard;

public class CalculateResult {

    public static double calculateResult(String equation) {

//        ArrayList<String> arrayList = new ArrayList<>();
//
//        for(int i = 0; i < equation.split(" ").length; i++) {
//            arrayList.add(equation.split(" ")[i]);
//        }
//
//        while(arrayList.contains("*") || arrayList.contains("/")) {
//            for (int i = 0; i < arrayList.size(); i++) {
//                if (arrayList.get(i) == "*") {
//                    int tempResult = Integer.parseInt(arrayList.get(i - 1)) * Integer.parseInt(arrayList.get(i + 1));
//                    arrayList.set(i, Integer.toString(tempResult));
//                    arrayList.remove(i - 1);
//                    arrayList.remove(i + 1);
//                    i--;
//                } else if (arrayList.get(i) == "/") {
//                    int tempResult = Integer.parseInt(arrayList.get(i - 1)) / Integer.parseInt(arrayList.get(i + 1));
//                    arrayList.set(i, Integer.toString(tempResult));
//                    arrayList.remove(i - 1);
//                    arrayList.remove(i + 1);
//                    i--;
//                }
//            }
//        }
//
//        while(arrayList.contains("+") || arrayList.contains("/")) {
//            for (int i = 0; i < arrayList.size(); i++) {
//                if (arrayList.get(i) == "+") {
//                    int tempResult = Integer.parseInt(arrayList.get(i - 1)) + Integer.parseInt(arrayList.get(i + 1));
//                    arrayList.set(i, Integer.toString(tempResult));
//                    arrayList.remove(i - 1);
//                    arrayList.remove(i + 1);
//                    i--;
//                } else if (arrayList.get(i) == "-") {
//                    int tempResult = Integer.parseInt(arrayList.get(i - 1)) - Integer.parseInt(arrayList.get(i + 1));
//                    arrayList.set(i, Integer.toString(tempResult));
//                    arrayList.remove(i - 1);
//                    arrayList.remove(i + 1);
//                    i--;
//                }
//            }
//        }

//        return Double.parseDouble(arrayList.get(0));
        return 1.0;
    }

}
