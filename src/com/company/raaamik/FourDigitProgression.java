package com.company.raaamik;

import java.util.ArrayList;

public class FourDigitProgression {

    private ArrayList<Integer> twoDigitMas = new ArrayList<Integer>();

    public ArrayList<Integer> funktion1(int value) {
        twoDigitMas.clear();
        for(int i = 0, j =0; i < 9000; i++){
            if(i % 3 == 0){
                twoDigitMas.add(j, value + i);
                j = j + 1;
            }
        }
        return twoDigitMas;
    }

    public ArrayList<Integer> funktion2() {
        twoDigitMas.clear();
        for(int i = 0, j = 0; j < 55; i++){
            if(i % 2 != 0){
                twoDigitMas.add(j, i);
                j = j + 1;
            }
        }
        return twoDigitMas;
    }


    public ArrayList<Integer> funktion3(int i) {
        twoDigitMas.clear();
        for (int j = 0; i >= 0; i--) {
            if (i % 5 == 0) {
                twoDigitMas.add(j, i);
                j++;
            }
        }
        return twoDigitMas;
    }

    public ArrayList<Integer> funktion4(int i) {
        twoDigitMas.clear();
        for (int j = 0; j < 20; j++) {
            twoDigitMas.add(j, i);
            i = i * 2;
        }
        return twoDigitMas;
    }

    public int funktion5(int value) {
        int rezult = 1;
        for (int i = 1; i <= value; i++) {
            rezult = rezult * i;
        }
        return rezult;
    }
}