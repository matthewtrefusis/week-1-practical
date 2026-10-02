import java.util.Scanner;

public class W01P13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] inputs = input.split(" ");

        double d1 = Double.parseDouble(inputs[0]);
        double s1 = Double.parseDouble(inputs[1]);
        int r1 = Integer.parseInt(inputs[2]);
        double d2 = Double.parseDouble(inputs[3]);
        double s2 = Double.parseDouble(inputs[4]);
        int r2 = Integer.parseInt(inputs[5]);

        double time = (d1 / s1) + (r1 / 60.0) + (d2 / s2) + (r2 / 60.0);
        double avgSpeed = (d1 + d2) / time;
        int hours = (int)Math.floor(time);
        int mins = (int)Math.round((time - hours) * 60);

        System.out.printf("Total travel time: %d hours %d minutes\n", hours, mins);
        System.out.printf("Overall average speed: %.2f km/h", avgSpeed);

        scanner.close();
    }
}
