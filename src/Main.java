public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1.1");

        for (int a = 0; a <= 10; a ++) {
            System.out.println(a);
        }

        System.out.println("Exercise 1.2");

        for (int b = 10; b >= 1; b --) {
            System.out.println(b);
        }

        System.out.println("Exercise 1.3");

        for (int c = 0; c <= 17; c += 2) {
            System.out.println(c);
        }

        System.out.println("Exercise 1.4");

        for (int d = 10; d >= -10; d --) {
            System.out.println(d);
        }

        System.out.println("Exercise 2.1");

        for (int i = 1904; i <=2096; i += 4) {
            System.out.println(i + " год является високосный");
        }

        System.out.println("Exercise 2.2");

        for (int f = 7; f <=98; f+= 7) {
            System.out.print( f + " ");
        }

        System.out.println ();

        System.out.println("Exercise 2.3");

        for (int e = 1; e <=512; e *= 2) {
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("Exercise 3.1");

        int deposit = 29_000;
        int sum = 0;
        for (int g = 1; g <=12; g ++) {
            sum += deposit;
            System.out.println("Месяц, " + g + " сумма накоплений равна " + sum + " рублей.");
        }

        System.out.println("Exercise 3.2");

        double sumWhithPersent = 0;
        double persent = 0.01;
        for (int j = 1; j<=12; j ++) {
            sumWhithPersent = (sumWhithPersent + deposit) * (1 + persent);


            System.out.println("Месяц, " + j + " сумма накоплений равна " + sumWhithPersent + " рублей.");
        }

    }
}