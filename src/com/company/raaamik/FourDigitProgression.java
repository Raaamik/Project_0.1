package com.company.raaamik;

public class FourDigitProgression {

    private int[] valuemas = new int[3000];
    private int[] twoDigitMas = new int[55];

    public int[] getValue(){
        return valuemas;
    }

    public void setValue(int value) {
        for(int i = 0, j =0; i < 9000; i++){
            if(i % 3 == 0){
                valuemas[j] = value + i;
                j = j + 1;
            }
        }
    }

    public int[] funktion2(){
        for(int i = 0, j = 0; j < 55; i++){
            if(i % 2 != 0){
                twoDigitMas[j] = i;
                j = j + 1;
            }
        }
        return twoDigitMas;

    }
 /*   public int[] funktion2(int i){
        for(int j = 0; j < 55; i++){
            if(i % 2 != 0){
                twoDigitMas[j] = i;
                j = j + 1;
            }
        }
        return twoDigitMas;
*/


}