import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.time.LocalDateTime;

public class ArchivoHistorial {

    public void guardarH(List<Moneda> historial) {
        try (FileWriter escritor = new FileWriter("historial_conversiones.txt")) {
            for (Moneda m : historial) {
                escritor.write(m.toString() + "\n");
            }
            System.out.println("Historial guardado en 'historial_conversiones.txt'");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
