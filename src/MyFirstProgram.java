/*
Цього разу багато часу мені не було потрібно, я досить швидко вивчив геттери та сеттери.
Це і означає "інкапсуляція" - приватність, в моєму розумінні.
Я добавив сеттерів та геттерів на всі цілі числа,
і щоб користувач не міг отримати прямий доступ до них - зробив вже існуючі поля приватними.
Це дозволить мені проводити дії поза очима користувача,
більше в нього немає доступу напряму до цілочислових полів.
*/

import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();
        calc.all_lessons();
        calc.your_lvl_now();
        calc.setMyLvl(scanner.nextInt());
        calc.you_done_lvls();
        calc.you_done();
        calc.how_much_days_you_spend();
        calc.setDays(scanner.nextInt());
        calc.you_spend();
    }
}