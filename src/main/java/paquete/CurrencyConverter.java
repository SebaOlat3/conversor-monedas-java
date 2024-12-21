public class CurrencyConverter {
    public static double convert(String fromCurrency, String toCurrency, double amount) throws Exception {
        double rate = ApiClient.getExchangeRate(fromCurrency, toCurrency);
        return amount * rate;
    }
}
