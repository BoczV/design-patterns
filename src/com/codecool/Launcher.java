package com.codecool;

import java.util.Collections;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {

    }

    public static List<Integer> bubbleSort(List<Integer> listToBeSorted) {
        for (int i = 0; i < listToBeSorted.size(); i++) {
            for (int j = 0; j < listToBeSorted.size() - 1; j++) {
                if (listToBeSorted.get(j) > listToBeSorted.get(j + 1)) {
                    Collections.swap(listToBeSorted, j, j + 1);
                }
            }
        }
        return listToBeSorted;
    }

    public static int findMinInList(List<Integer> listWithDigits){
        Integer minimumValue = listWithDigits.get(0);
        for (Integer listWithDigit : listWithDigits) {
            if (listWithDigit < minimumValue) {
                minimumValue = listWithDigit;
            }
        }
        return minimumValue;
    }

    public static int findMaxInList(List<Integer> listWithDigits){
        Integer maximumValue = listWithDigits.get(0);
        for (Integer listWithDigit : listWithDigits) {
            if (listWithDigit > maximumValue) {
                maximumValue = listWithDigit;
            }
        }
        return maximumValue;
    }

    public static float calculateAvg(List<Integer> listWithDigits){
        float totalNumberOfMembers = listWithDigits.size();
        float totalValue = 0;
        for (Integer listWithDigit : listWithDigits) {
            totalValue += listWithDigit;
        }
        return totalValue / totalNumberOfMembers;
    }
}
