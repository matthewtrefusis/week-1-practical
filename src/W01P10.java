import java.util.Scanner;

public class W01P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] list = input.split(" ");
        double base = Double.parseDouble(list[0]);
        double height = Double.parseDouble(list[1]);

        double area = 0.5 * base * height;

        System.out.printf("The area of the triangle is: %.2f cm^2", area);

        scanner.close();
    }
}
