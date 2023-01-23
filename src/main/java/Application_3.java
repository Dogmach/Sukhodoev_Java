import java.util.Scanner;

public class Application_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        if (scanner.hasNextInt()) {
            int size = scanner.nextInt();
            int array[] = new int[size];

            System.out.println("Вводите значения элементов массива: ");

            for (int i = 0; i < array.length; i++) {
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                } else {
                    scanner.close();
                }
            }

            /* Вывод элементов массива кратные числу 3 */

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 3 == 0) {
                    System.out.println(array[i]);
                }
            }
            scanner.close();
        }
        else {
            System.out.println("Введёное вами значение не является числом.");
        }
    }
}