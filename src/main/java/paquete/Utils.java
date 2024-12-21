public class Utils {
    public static boolean isValidCurrency(String currency) {
        return currency.matches("^[A-Z]{3}$");
    }
}
