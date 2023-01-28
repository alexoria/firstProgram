class Calc {
    private int my_lvl;
    private int days;
    private int lessons = 9;
    private int levels = 20;
    private int library = 5;


    // ##################################### Setters and Getters #####################################

    public void setMyLvl(int set_my_lvl) {
        my_lvl = set_my_lvl;
    }

    public int getMyLvl () {
        return my_lvl;
    }

    public void setDays(int set_days) {
        days = set_days;
    }

    public int getDays() {
        return days;
    }

    public void setLessons(int set_lessons) {
        lessons = set_lessons;
    }

    public int getLessons() {
        return lessons;
    }

    public void setLevels(int set_levels) {
        levels = set_levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLibrary(int set_library) {
        library = set_library;
    }

    public int getLibrary() {
        return library;
    }

    // ##################################### Setters and Getters end #####################################
    int all() {
        int all = (library * levels) * lessons;
        return all;
    }
    void all_lessons() {
        System.out.println("Уроків загалом: " + all());
    }
    void your_lvl_now() {
        System.out.print("Ваш рівень зараз: ");
    }
    void you_done_lvls(){
        System.out.println("Ви виконали: " + my_lvl);
    }
    void you_done() {
        System.out.println("Все, що ви повинні зробити (в кількостях уроків): " + all());
        System.out.println("Ви виконали зараз (в кількостях уроків): " + (my_lvl * lessons));
        System.out.println("Залишилось зробити (в кількостях уроків): " + (all() - (my_lvl * lessons)));
    }
    void how_much_days_you_spend(){
        System.out.print("Скільки днів ви витратили? : ");
    }
    void you_spend() {
        System.out.println("Ви витратили: " + days + " днів");
        System.out.println("Це приблизно: " + (all() / ((my_lvl * lessons) / days)) + " днів, щоб завершити JavaRush");
        System.out.println("Або " + ((all() / ((my_lvl * lessons) / days)) / 30) + " місяців");
    }
}