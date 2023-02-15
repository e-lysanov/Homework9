import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int[] arr = generateRandomArray();
//        System.out.println(Arrays.toString(arr));

        int total = 0;
        for (int payout: arr) {
            total += payout;
        }

        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int[] arr = generateRandomArray();

        int maximalPayout = 99_000;
        int minimalPayout = 200_001;

        for (int payout : arr) {
            if (maximalPayout < payout) {
                maximalPayout = payout;
            }
            if (minimalPayout > payout) {
                minimalPayout = payout;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minimalPayout + " рублей. Максимальная сумма трат за день составила " + maximalPayout + " рублей.");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int[] arr = generateRandomArray();

        double total = 0;
        for (int payout: arr) {
            total += payout;
        }

        double averagePayout = total / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayout + " рублей");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//        вывод перевернутого ФИ
//        for (char letter: reverseFullName) {
//            System.out.print(letter);
//        }
//        System.out.println();
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}