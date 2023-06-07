import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    private static void task1() {
        System.out.println("Задача 1");

        int[] troika = new int[3];
        troika[0] = 1;
        troika[1] = 2;
        troika[2] = 3;
        double[] fractions = {1.57, 7.654, 9.986};
        int[] random = {10, 20, 30, 40, 50};
    }

    private static void task2() {
        System.out.println("Задача 2");

        int[] troika = new int[3];
        troika[0] = 1;
        troika[1] = 2;
        troika[2] = 3;
        double[] fractions = {1.57, 7.654, 9.986};
        int[] random = {10, 20, 30, 40, 50};

        for (int i = 0; i < troika.length; i++) {
            System.out.print(troika[i]);
            if (i != troika.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i]);
            if (i != fractions.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < random.length; i++) {
            System.out.print(random[i]);
            if (i != random.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");

        int[] troika = new int[3];
        troika[0] = 1;
        troika[1] = 2;
        troika[2] = 3;
        double[] fractions = {1.57, 7.654, 9.986};
        int[] random = {10, 20, 30, 40, 50};

        for (int i = troika.length - 1; i >= 0; i--) {
            System.out.print(troika[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = fractions.length - 1; i >= 0; i--) {
            System.out.print(fractions[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = random.length - 1; i >= 0; i--) {
            System.out.print(random[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задача 4");

        int[] troika = {1, 2, 3};
        for (int i = 0; i < troika.length; i++) {
            if (troika[i] % 2 != 0) {
                troika[i] += 1;
            }
            System.out.println(Arrays.toString(troika));
        }
    }
}