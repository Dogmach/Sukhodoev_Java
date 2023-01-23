import java.util.Scanner;

public class Application_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int size = scanner.nextInt();
                int[] array = new int[size];
                System.out.println("Введите значения элементов массива: ");

                for (int i = 0; i < array.length; i++) {
                    if (scanner.hasNextInt()) {
                        array[i] = scanner.nextInt();
                    } else {
                        System.out.println("Вы ввели неверный символ, введите число заново: ");
                        i--;
                        scanner.next();
                    }
                }
                /* Вывод элементов массива кратные числу 3 */
                for (int j : array) {
                    if (j % 3 == 0) {
                        System.out.println(j);
                    }
                }
            } else {
                System.out.println("Введёное вами значение не является числом.");
                System.out.println("Введите число заново: ");
                scanner.next();
            }
        }
        scanner.close();
    }
}