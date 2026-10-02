import java.util.Scanner;

public class W01P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] list = input.split(" ");
        double u = Double.parseDouble(list[0]);
        double a = Double.parseDouble(list[1]);
        double t = Double.parseDouble(list[2]);

        double v = u + a * t;
        double s = u * t + (0.5 * a * t * t);

        System.out.printf("The final velocity is: %.1f m/s\n", v);
        System.out.printf("The displacement is: %.1f meters", s);

        scanner.close();
    }
}
