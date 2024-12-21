import okhttp3.*;
import org.json.JSONObject;

public class ApiClient {
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/";

    public static double getExchangeRate(String fromCurrency, String toCurrency) throws Exception {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(API_URL + fromCurrency)
                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new Exception("Error al obtener datos de la API");
        }

        String responseData = response.body().string();
        JSONObject json = new JSONObject(responseData);
        JSONObject rates = json.getJSONObject("rates");
        return rates.getDouble(toCurrency);
    }
}
