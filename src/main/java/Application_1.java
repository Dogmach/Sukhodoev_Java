import java.util.Scanner;

public class Application_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и нажмите \"Enter\": ");
        int i = scanner.nextInt();

        if (i > 7) {
            System.out.println("Привет");
        }
    }
}
