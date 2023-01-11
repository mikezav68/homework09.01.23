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
        task9();
        task10();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i +1)
        {
            System.out.println(i);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        for (int c = 10; c >= 1; c = c - 1)
        {
            System.out.println(c);
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        for (int a = 0; a < 17; a = a +2)
        {
            System.out.println(a);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        for (int b = 10; b >= -10; b = b - 1)
        {
            System.out.println(b);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        for (int y = 1904; y <= 2096; y = y + 4)
            System.out.println(y + " год является високосным");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        for (int d = 7; d <= 98; d = d + 7)
        {
            System.out.print(d + " ");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        for (int e = 1; e <= 512; e = e * 2)
            System.out.print(e + " ");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int deposit = 29000;
        int total  = 0;
        for (int f = 1; f <= 12; f++ ) {
            total = total + deposit;
            System.out.println("Месяц " + f + ", сумма накоплений равна " + total);
        }
    }
    public static void task9 () {
        System.out.println("Задача 9");
        int dep = 29000;
        int totalDep  = 0;
        for (int g = 1; g <= 12; g++ ) {
            totalDep = totalDep + totalDep / 100;
            totalDep = totalDep + dep;
            System.out.println("Месяц " + g + ", сумма накоплений равна " + totalDep);
        }
    }
    public static void task10 () {
        System.out.println("Задача 10");
        int result = 0;
        for (int h = 1; h <=10; h++) {
            result = 2 * h;
            System.out.println("2*" + h + "=" + result);
        }
    }
}