import java.util.Scanner;

public class lern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lessons = 9;
        int levels = 20;
        int library = 5;
        int all = (library * levels) * lessons;
        System.out.println("Уроків загалом: " + all);
        System.out.print("Ваш рівень зараз: ");
        int my_lvl = scanner.nextInt();
        System.out.println("Ви виконали: " + my_lvl);
        System.out.println("Все, що ви повинні зробити (в кількостях уроків): " + all);
        System.out.println("Ви виконали зараз (в кількостях уроків): " + (my_lvl * lessons));
        System.out.println("Залишилось зробити (в кількостях уроків): " + (all - (my_lvl * lessons)));
        System.out.print("Скільки днів ви витратили? : ");
        int days = scanner.nextInt();
        System.out.println("Ви витратили: " + days + " днів");
        System.out.println("Це приблизно: " + (all / ((my_lvl * lessons) / days)) + " днів, щоб завершити JavaRush");
        System.out.println("Або " + ((all / ((my_lvl * lessons) / days)) / 30) + " місяців");
    }
}