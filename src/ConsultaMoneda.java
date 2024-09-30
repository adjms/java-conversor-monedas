import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    static public Moneda convierteMoneda(String monedaBase, String monedaConvertir, String valor){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/025ef93566c48eb784ac205c/pair/" +
                monedaBase+"/"+monedaConvertir+"/"+valor);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println("Resultado: " + new Gson().fromJson(response.body(), Moneda.class));
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e){
            throw new RuntimeException("No se realizó la conversión de moneda...\n" + direccion);

        }
    }
}
