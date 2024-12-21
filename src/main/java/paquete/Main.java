import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al conversor de monedas!");
        System.out.println("Seleccione la moneda origen (por ejemplo, USD): ");
        String fromCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Seleccione la moneda destino (por ejemplo, EUR): ");
        String toCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Ingrese el monto a convertir: ");
        double amount = scanner.nextDouble();

        try {
            double result = CurrencyConverter.convert(fromCurrency, toCurrency, amount);
            System.out.printf("Resultado: %.2f %s = %.2f %s%n", amount, fromCurrency, result, toCurrency);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
