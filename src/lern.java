/*
Тільки почав вчити класи і об'єкти. Притримуюсь методології в навчанні:
1. зтикаюсь з невідомим
2. думаю, що це могло би означати
3. перший раз дивлюсь "як правильно"
4. пробую написати правильно
5. якщо виходить - розумію що це працює саме так,
та пробую написати ще щось, аби точно в цьому переконатись
6. якщо не виходить - розумію що щось упустив,
пробую написати заново першу програму так, щоб вона працювала
7. якщо пункт 6 - то пунк 7 це пункт 5
*/


import java.util.Scanner;

public class lern {
    public static void main(String [] args) {
        Everything all = new Everything();
        System.out.println(all.lessonsAll());
    }
}

class Everything {
    Scanner scanner = new Scanner(System.in);
    int lessons = 9;
    int levels = 20;
    int library = 5;
    int lessons_all = (library * levels) * lessons;
    int my_level = scanner.nextInt();

    boolean lessonsAll() {
        System.out.println("Уроків загалом: " + lessons_all);
        return false;
    }

    void myLvl() {
        Everything all = new Everything();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваш рівень зараз: ");
        int my_level = scanner.nextInt();
        System.out.println("Ви виконали: " + my_level);
        System.out.println("Все, що ви повинні зробити (в кількостях уроків): " + all.lessons_all);
        System.out.println("Ви виконали зараз (в кількостях уроків): " + (my_level * lessons));
        System.out.println("Залишилось зробити (в кількостях уроків): " + (all.lessons_all - (my_level * lessons)));
    }

    void daysSpended() {
        Everything all = new Everything();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Скільки днів ви витратили? : ");
        int days = scanner.nextInt();
        System.out.println("Ви витратили: " + days + " днів");
        System.out.println("Це приблизно: " + (all.lessons_all / ((my_level * lessons) / days)) + " днів, щоб завершити JavaRush");
        System.out.println("Або " + ((all.lessons_all / ((my_level * lessons) / days)) / 30) + " місяців");
    }
}
