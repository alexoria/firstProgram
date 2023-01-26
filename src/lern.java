/*
Друга спроба написати щось адекватно працююче через костилі,
цього разу передивився тему, дізнався як повинно бути,
проте не розглянув тему класів та об'єктів повністю,
а тому не знаю точно як це працює.
Намагаюсь отримати досвід через бої з кодом.
По трохи вивчаю тему, в основному роблячи удар на те,
що повинен зрозуміти сам, а не після слів ментора
(ну або документації, тому що я і читаю, і дивлюсь відоси, і все на купу по данній темі).
*/

import java.util.Scanner;

public class lern {
    public static void main(String [] args) {
        Calculation everything = new Calculation();
        System.out.println("Уроків загалом: " + everything.all());
        System.out.print("Ваш рівень зараз: ");
        int mylvl = everything.my_level;
        everything.youDone();
        System.out.print("Скільки днів ви витратили? : ");
        int days = everything.days;
    }
}

class Calculation {
    Scanner sc = new Scanner(System.in);
    int lessons = 9;
    int levels = 20;
    int library = 5;
    int my_level = sc.nextInt();
    int days = sc.nextInt();

    int all() {
        int all = (library * levels) * lessons;
        return all;
    }

    void youDone() {
        System.out.println("Ви виконали: " + my_level);
        System.out.println("Все, що ви повинні зробити (в кількостях уроків): " + all());
        System.out.println("Ви виконали зараз (в кількостях уроків): " + (my_level * lessons));
        System.out.println("Залишилось зробити (в кількостях уроків): " + (all() - (my_level * lessons)));
    }

    void youSpend() {
        System.out.println("Ви витратили: " + days + " днів");
        System.out.println("Це приблизно: " + (all() / ((my_level * lessons) / days)) + " днів, щоб завершити JavaRush");
        System.out.println("Або " + ((all() / ((my_level * lessons) / days)) / 30) + " місяців");
    }
}