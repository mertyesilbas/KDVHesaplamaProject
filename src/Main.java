import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {

        // Create variables
        double inputValue, withKDV, valueKDV, amountKDV;

        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.println("KDV'sini hesaplamak istediğiniz miktarı giriniz: ");
        inputValue = Math.abs(scanner.nextDouble());

        // Calculations
        valueKDV = (inputValue >= 1000) ? 0.08 : 0.18;
        withKDV = inputValue * (1 + valueKDV);
        amountKDV = withKDV - inputValue;
        System.out.println("KDV'siz Fiyatı: " + df.format(inputValue) + "\n" + "KDV'li Fiyatı: " + df.format(withKDV) + "\n" + "KDV Tutarı: " + df.format(amountKDV) + "\n");

    }
}