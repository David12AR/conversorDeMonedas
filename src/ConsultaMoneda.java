import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
public Moneda buscaMoneda(String divisa,String divisaDos, double monto){
URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5d6ab2953202ce74f5d494bf/pair/"+divisa+"/"+divisaDos+"/"+monto);

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(direccion)
            .build();


    try{
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

        return new Moneda(
                json.get("base_code").getAsString(),
                json.get("target_code").getAsString(),
                json.get("conversion_result").getAsDouble(),
                monto

        );
    } catch (Exception e) {
        throw new RuntimeException("No encontré esa divisa");
    }
}


}
