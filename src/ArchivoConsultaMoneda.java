import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ArchivoConsultaMoneda {
    public void guardaJson(Moneda moneda) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter digita = new FileWriter(moneda.getBase_code()+".json");
        digita.write(gson.toJson(moneda));
        digita.close();
    }
}
