package com.company.raaamik;

import java.util.ArrayList;

public class FourDigitProgression {

    private ArrayList<Integer> valuemas = new ArrayList<Integer>();
    private ArrayList<Integer> twoDigitMas = new ArrayList<Integer>();

    public ArrayList<Integer> getValue() {
        return valuemas;
    }

    public void setValue(int value) {
        for(int i = 0, j =0; i < 9000; i++){
            if(i % 3 == 0){
                valuemas.add(j, value + i);
                j = j + 1;
            }
        }
    }

    public ArrayList<Integer> funktion2() {
        for(int i = 0, j = 0; j < 55; i++){
            if(i % 2 != 0){
                twoDigitMas.add(j, i);
                j = j + 1;
            }
        }
        return twoDigitMas;

    }


}