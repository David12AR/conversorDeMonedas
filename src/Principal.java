import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        Scanner opcion = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        try {
            var menu = 0;
            while (menu != 7){
                System.out.println("************************************************\n" +
                        "Sea bievenido/a al Conversor de Moneda\n" +
                        "\n" +
                        "1) Dolar =>> Peso argentino\n" +
                        "2) Peso argentino =>> Dólar\n" +
                        "3) Dólar =>> Real brasileño\n" +
                        "4) Real brasileño =>> Dólar\n" +
                        "5) Dólar =>> Peso colombiano\n" +
                        "6) Peso colombiano =>> Dólar\n" +
                        "7) Salir\n" +
                        "\n" +
                        "Elija una opción valida:\n" +
                        "\n" +
                        "*************************************************");
                menu = opcion.nextInt();

                switch (menu){
                    case 1:
                        System.out.println("Ingresa el valor que deseas convertir");
                        var monto = lectura.nextDouble();
                        Moneda moneda = consulta.buscaMoneda("USD","ARS",monto);
                        System.out.println(moneda);
                        ArchivoConsultaMoneda archivo = new ArchivoConsultaMoneda();
                        archivo.guardaJson(moneda);
                        break;
                    case 2:
                        System.out.println("Ingresa el valor que deseas convertir");
                        monto = lectura.nextDouble();
                        Moneda moneda2 = consulta.buscaMoneda("ARS","USD",monto);
                }
            }

        } catch (NumberFormatException | IOException e) {
            System.out.println("Divisa no encontrada");
        }


    }
}
