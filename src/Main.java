public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int income = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + income;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int y = 0;
        while (y < 10) {
            y++;
            System.out.print(" " + y + " ");
        }
        System.out.println();
        for (int w = 10; w > 0; w = w - 1) {
            System.out.print(" " + w + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int populationIncrease = population / 1000 * 17;
        int populationDecrease = population / 1000 * 8;
        int i = 0;
        while (i < 10) {
            i++;
            population = population + populationIncrease - populationDecrease;
            System.out.println("Год " + i + ", численность населения составляет " + population + " .");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int total = 15000;
        int month = 0;
        while (total <= 12_000_000) {
            month++;
            total = total + (total * 7 / 100);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (total) + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int total = 15000;
        int month = 0;
        while (total <= 12_000_000) {
            month++;
            total = total + (total * 7 / 100);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + (total) + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int total = 15000;
        int totalMonth = 0;
        while (totalMonth <= 9 * 12) {
            totalMonth++;
            total = total + (total * 7 / 100);
            if (totalMonth % 6 == 0) {
                System.out.println("Месяц " + totalMonth + ", сумма накоплений равна " + (total) + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
      //  int data = 1;
        int friday = 3;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        //   data++;
            friday = friday + 7;
        } while (friday <= 31);
    }

    public static void task8() {
        System.out.println("Задача 8. Первый вариант");
        int i = 0;
        int step = 79;
        int yearNumber = 2023;
        while (((yearNumber - step * i) > 0) && (yearNumber > step * i)) {
            if (yearNumber > step * i) {
                i++;
                if (((yearNumber - 200) < (step * i)) && (yearNumber > (step * i))) {
                    System.out.println("За последние 200 лет комета появлялась в " + step * i + " году.");
                } else if ((yearNumber + 100) < (step * (i + 1))) {
                    System.out.println("В следующие 100 лет появление кометы ожидается в  " + step * i + " году.");
                }
            }
        }
        System.out.println("Задача 8. Второй вариант");
        int year = 0;
        int currentYear = 2020;
        while (year < (currentYear +100)) {
            year = year + step;
            if ((year > (currentYear - 200)) && (year < currentYear)) {
                System.out.println("Второй вариант. За последние 200 лет комета появлялась в " + year + " году.");
            } else if ((year < (currentYear + 100)) && (year > currentYear)) {
                System.out.println("Второй вариантю. В следующие 100 лет появление кометы ожидается в  " + year + " году.");
            }
        }

        //Ну в целом логика правильная, но код можно сильно укоротить. Сделать такое условие цикла пока год меньше
        // текущий год + 100
       // Внутри цикла прибавлять к переменной step 79 на каждой итерации. Также внутри цикла написать условный
        // оператор, если step больше, чем текущий год - 200, то выводить год в консоль.
       // Правда в таком случае в выводе ну будет написано в прошлом была комета или в будущем,
        // но это тоже можно будет добавить)

    }
}
















