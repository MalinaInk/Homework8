import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Пример из видео:
        int salary = 65_535; //зп
        int total = 0;//суммарная зп
        //int i = 0; //объявляем вне условий цикла, чтобы использовать далее
        while (total < 1_000_000) { //когда заработаем лям?
            total = total + total / 100; //прибавляем процент накопления
            total = total + salary; //каждую зп складываем в сумму
            System.out.println(total); //выводим
            // System.out.println("Месяц " + i + " Итого " + total); //помесячная динамика роста
        }
        //Пример-2

        //Задание 1
        salary = 65_535;
        int i = 0;
        total = 0;
        while (total < 2_459_000) {
            i = i + 1;
            total = total + total / 100;
            total = total + salary;
            System.out.println(total);
        }
        System.out.printf("Месяц %d сумма накоплений равна %d рублей\n", i, total);

        //Задание 2
        int k = 0;
        while (k < 10) {
            k = k + 1;
            System.out.print(k + " ");
        }
        System.out.println(" ");
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        int population = 12_000_000;
        int year = 0;
        while (year <= 10) {
            int fertility = population / 1000 * 17;
            int mortality = population / 1000 * 8;
            year = year + 1;
            population = population + fertility - mortality;
            System.out.printf("\nГод %d, численность населения составляет %d", year, population);
        }

        task2();
        task3();
        task4();
        task5();
        task6();
    }

    private static void task2() {
        double percent = 0;
        double total = 15_000;
        int i = 0;
        while (total <= 12_000_000) {
            if (i % 6 == 0) {
                System.out.printf("Месяц %d сумма накоплений %f\n", i, total);
            }
            i = i + 1;
            percent = total * 7 / 100;
            total = total + percent;
        }
        System.out.printf("Для накопления 12 миллионов необходимо %d месяцев\n", i);
    }

    private static void task3() {
        double percent = 0;
        double total = 15_000;
        int i = 0;
        while (i <= 9 * 12) {
            if (i % 6 == 0) {
                System.out.printf("Месяц %d сумма накоплений %f\n", i, total);
            }
            i = i + 1;
            percent = total * 7 / 100;
            total = total + percent;
        }
        System.out.printf("За это время накопится следующая сумма: %f\n", total);
    }

    private static void task4() {
        int firstFridayInMonth = 4;
        while (firstFridayInMonth <= 30) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", firstFridayInMonth);
            firstFridayInMonth = firstFridayInMonth + 7;
        }
    }

    private static void task5() {
        int startYear = 2022;
        int startPeriod = startYear - 200;
        int endPeriod = startYear + 100;
        for (int i = startPeriod; i <= endPeriod; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void task6() {
        int firstMultiplier = 2;
        int secondMultiplier = 1;
        int result = 0;
        for (int i = secondMultiplier; i <= 10; i++) {
            result = firstMultiplier * i;
            System.out.println(firstMultiplier + "*" + i + "=" + result);
        }
    }
}



