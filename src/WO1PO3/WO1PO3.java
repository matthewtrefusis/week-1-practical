package WO1PO3;

public class WO1PO3 {
    public static void main(String[] args) {
        String x = "Goodbye.";
        String y = "Hello.";

        String temp = x;
        
        x = y;
        y = temp;

        System.out.printf("%s %n %s", x, y);
    }
}
