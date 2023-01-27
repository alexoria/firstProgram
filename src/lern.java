import java.util.Scanner;
public class lern {
    public static void main(String [] args) {
        Calc calc = new Calc();
        calc.all_lessons();;
        calc.your_lvl_now();
        calc.you_done_lvls();
        calc.you_done();
        calc.how_much_days_you_spend();
        calc.you_spend();
    }
}

class Calc {
    Scanner scanner = new Scanner(System.in);
    int my_lvl;
    int days;
    float lessons = 9;
    float levels = 20;
    float library = 5;

    float all() {
        float all = (library * levels) * lessons;
        return all;
    }
    void all_lessons() {
        System.out.println("Уроків загалом: " + all());
    }
    void your_lvl_now() {
        System.out.print("Ваш рівень зараз: ");
    }
    void you_done_lvls(){
        my_lvl = scanner.nextInt();
        System.out.println("Ви виконали: " + my_lvl);
    }
    void you_done() {
        System.out.println("Все, що ви повинні зробити (в кількостях уроків): " + all());
        System.out.println("Ви виконали зараз (в кількостях уроків): " + (my_lvl * lessons));
        System.out.println("Залишилось зробити (в кількостях уроків): " + (all() - (my_lvl * lessons)));
    }

    void how_much_days_you_spend(){
        System.out.print("Скільки днів ви витратили? : ");
        days = scanner.nextInt();
    }
    void you_spend() {
        System.out.println("Ви витратили: " + days + " днів");
        System.out.println("Це приблизно: " + (int)(all() / ((my_lvl * lessons) / days)) + " днів, щоб завершити JavaRush");
        System.out.println("Або " + (int)((all() / ((my_lvl * lessons) / days)) / 30) + " місяців");
    }
}