import java.util.Scanner;

public class W01P12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] inputs = input.split(" ");

        double hallLength = Double.parseDouble(inputs[0]);
        double hallWidth = Double.parseDouble(inputs[1]);
        double tileSide = Double.parseDouble(inputs[2]);
        double wasteRate = Double.parseDouble(inputs[3]);
        double pricePerTile = Double.parseDouble(inputs[4]);

        int numTiles = (int)Math.ceil(((hallLength * hallWidth) / (tileSide * tileSide)) * ( 1 + wasteRate));
        double cost = numTiles * pricePerTile;

        System.out.printf("Tiles to buy: %d\n", numTiles);
        System.out.printf("Totals cost: £%.2f", cost);

        scanner.close();
    }
}
