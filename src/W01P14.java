import java.util.Scanner;

public class W01P14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] inputs = input.split(" ");

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);

        int total = a * 48 + b * 40 + c * 32;

        System.out.printf("Total UCAS points: %d", total);

        scanner.close();
    }
}