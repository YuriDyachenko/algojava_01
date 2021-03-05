package kurs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("- - - - - Задание 1.1 - - - - -");
        System.out.println("На самом деле мы все выполняем каждый день очень сложные алгоритмы, просто этого не замечаем.");
        System.out.println("Тот же алгоритм 'сделать чай' на самом деле можно расписать на десятки листов А4.");
        System.out.println("Доводя до абсурда: толкнуть дверь на кухню - если не открылась, толкнуть сильнее и т.п.");
        System.out.println("Не будем тратить много времени на структуры данных - пусть это будет тот же кошелек с деньгами.");
        System.out.println("Некоторые там даже купюры упорядочивают, складывая один номинал рядышком.");
        System.out.println("Ну а то, что мелочь - в отдельном отделениии - это уж четко почти у всех, :).");

        System.out.println("- - - - - Задание 1.2 - - - - -");
        System.out.println("Алгоритмы: сортировки, поиска, определения максимума и минимума, подсчет числа входждения и т.п.");
        System.out.println("Структуры данных: классы, массивы, списки, мапы.");

        System.out.println("- - - - - Задание 1.3 - - - - -");
        int currentYear = 2021;
	    String homeWorkName = "ДЗ №1";
	    Person ivan = new Person("Иван", 33);
        int[] monthNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String[] monthNames = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август" +
                "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        Person[] people = {ivan,
                new Person("Николай", 45),
                new Person("Сергей", 55),
                new Person("Иван", 33)};

        System.out.println("currentYear = " + currentYear);
        System.out.println("homeWorkName = " + homeWorkName);
        System.out.println("ivan = " + ivan);
        System.out.println("monthNumbers = " + Arrays.toString(monthNumbers));
        System.out.println("monthNames = " + Arrays.toString(monthNames));
        System.out.println("people = " + Arrays.toString(people));

        System.out.println("- - - - - Задание 1.4 - - - - -");
        int covidYear = 2020;
        System.out.println("(covidYear == currentYear) = " + (covidYear == currentYear));
        String futureHomeWorkName = "ДЗ №2";
        System.out.println("(futureHomeWorkName.equals(homeWorkName)) = " + (futureHomeWorkName.equals(homeWorkName)));
        System.out.println("(ivan == people[0]) = " + (ivan == people[0]));
        System.out.println("(ivan == people[3]) = " + (ivan == people[3]));
        System.out.println("(ivan.equals(people[3])) = " + (ivan.equals(people[3])));

        Duration duration = new Duration();
        duration.fix("Поиск месяца по номеру 10");
        for (int i = 0; i < monthNumbers.length; i++) {
            if (monthNumbers[i] == 10) {
                System.out.println("  найден месяц по номеру 10 в позиции " + i);
                break;
            }
        }
        duration.out("Поиск месяца по имени Октябрь");
        for (int i = 0; i < monthNames.length; i++) {
            if ("Октябрь".equals(monthNames[i])) {
                System.out.println("  найден месяц по имени Октябрь в позиции " + i);
                break;
            }
        }
        duration.out("Поиск Ивана 33 года среди людей");
        for (int i = 0; i < people.length; i++) {
            if (ivan.equals(people[i])) {
                System.out.println("  найден Иван 33 года в позиции " + i);
            }
        }
        duration.out();
    }
}
