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
            System.out.println(f);
        }

        System.out.println("Exercise 2.3");

        for (int e = 1; e <=512; e *= 2) {
            System.out.println(e);
        }

        System.out.println("Exercise 3.1");

        int deposit = 0;
        for (int g = 1; g <=12; g ++) {
            deposit += 29000;
            System.out.println("Месяц, " + g + " сумма накоплений равна " + deposit + " рублей.");
        }

        System.out.println("Exercise 3.2");

        int depositA = 0;
        for (int j = 1; j<=12; j ++) {
            depositA += 29000;
            depositA = depositA + depositA/100;

            System.out.println("Месяц, " + j + " сумма накоплений равна " + depositA + " рублей.");
        }

    }
}