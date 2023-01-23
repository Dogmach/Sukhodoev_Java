import java.util.Scanner;

public class Application_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя и нажмите\"Enter\": ");
        String name = sc.nextLine();
        String name_v = "Вячеслав";

        if (name.equals(name_v)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени.");
        }
    }
}