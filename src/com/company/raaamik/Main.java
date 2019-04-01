package com.company.raaamik;

import javax.swing.*;
import java.util.Scanner;

public class Main extends JPanel {

    public static void main(String[] args) {


        String kommand = new String("h");
        int value = 0;
        Scanner scanner = new Scanner(System.in);
        FourDigitProgression firstfunktion = new FourDigitProgression();

        while(!kommand.equals("exit")){
            if (kommand.equals("1")){
                System.out.println(firstfunktion.funktion1(1000));
            }
            if (kommand.equals("2")){
                System.out.println(firstfunktion.funktion2());
            }
            if (kommand.equals("3")) {
                System.out.println(firstfunktion.funktion3(90));
            }
            if (kommand.equals("4")) {
                System.out.println(firstfunktion.funktion4(2));
            }
            if (kommand.equals("5")) {
                System.out.print("Введите число :");
                value = scanner.nextInt();
                System.out.println(firstfunktion.funktion5(value));
            }
            if (kommand.equals("6")) {
                Lottery user = new Lottery();
                user.lottery();
            }
            if (kommand.equals("h")) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("--  Вас приветствует учебная программа Алиева Рамиза               ----");
                System.out.println("--  Что бы увидеть последовательность 1000,1003,1006 нажмите 1     ----");
                System.out.println("--  Что бы увидеть последовательность 1,3,5,7,9,     нажмите 2     ----");
                System.out.println("--  Что бы увидеть последовательность 90,85,80,75,70 нажмите 3     ----");
                System.out.println("--  Что бы увидеть последовательность 2,4,8,16,32,64 нажмите 4     ----");
                System.out.println("--  Что бы увидеть факториал натурального числа n    нажмите 5     ----");
                System.out.println("--  Что бы сыграть в лотерею                         нажмите 6     ----");
                System.out.println("--  Для выхода напишите exit                                       ----");
                System.out.println("-----------------------------------------------------------------------");

            }

            System.out.print("Выберите функцию : ");
            kommand = scanner.nextLine();



        }
    }
}
