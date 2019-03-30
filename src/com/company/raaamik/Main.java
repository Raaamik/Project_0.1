package com.company.raaamik;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String kommand = new String("start");
        Scanner scanner = new Scanner(System.in);
        FourDigitProgression firstfunktion = new FourDigitProgression();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("--  Вас приветствует учебная программа Алиева Рамиза               ----");
        System.out.println("--  Что бы увидеть последовательность 1000,1003,1006 нажмите 1     ----");
        System.out.println("--  Что бы увидеть последовательность 1,3,5,7,9,     нажмите 2     ----");
        System.out.println("--  Для выхода напишите exit                                       ----");
        System.out.println("-----------------------------------------------------------------------");


        while(!kommand.equals("exit")){
            kommand = scanner.nextLine();
            if (kommand.equals("1")){
                firstfunktion.setValue(1000);
                System.out.println(Arrays.toString(firstfunktion.getValue()));
            }
            if (kommand.equals("2")){
                System.out.println(Arrays.toString(firstfunktion.funktion2()));
            }
            /*if (kommand.equals("2")){
                System.out.println(Arrays.toString(firstfunktion.funktion3(90)));
            }*/


        }
    }
}
