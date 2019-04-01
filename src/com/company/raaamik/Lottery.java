package com.company.raaamik;

import java.util.Scanner;

public class Lottery {


    public void lottery() {

        int prog, user, flag = 0;
        do {
            prog = (int) (Math.random() * 20) - 10;
        } while (prog == 0);

        System.out.println("Я загадал число от -10 до 10! Попробуй угадать!!!");
        System.out.print("Введите ваше число :");
        Scanner input = new Scanner(System.in);

        if (input.hasNextInt()) {
            do {
                user = input.nextInt();
                flag = flag + 1;
                if (user == prog) {
                    System.out.println("Вы угадали!!!");
                } else {
                    if (user >= -10 && user <= 10) {
                        System.out.print("Вы не угадали!!!");
                        if (prog < user) {
                            System.out.println("Мое число меньше!!!");
                        } else {
                            System.out.println("Мое число больше!!!");
                        }
                    } else {
                        System.out.println("Ваше число вообще не из нужного отрезка!!!");
                    }
                }

            } while (prog != user);
        } else {
            System.out.println("Ошибка, вы не ввели целое число!!!");

        }
        System.out.println("Количество попыток :" + flag);
        System.out.println("До свидания!!!");


    }


}
