import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        Scanner opcion = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        List<Moneda> historialConversiones = new ArrayList<>();

        try {
            var menu = 0;
            while (menu != 11) {
                System.out.println("************************************************\n" +
                        "Sea bievenido/a al Conversor de Moneda\n" +
                        "\n" +
                        "1) Dolar =>> Peso argentino\n" +
                        "2) Peso argentino =>> Dólar\n" +
                        "3) Dólar =>> Real brasileño\n" +
                        "4) Real brasileño =>> Dólar\n" +
                        "5) Dólar =>> Peso colombiano\n" +
                        "6) Peso colombiano =>> Dólar\n" +
                        "7) Euro =>> Peso mexicano\n" +
                        "8) Peso mexicano =>> Euro\n" +
                        "9) Euro =>> Peso chileno\n" +
                        "10) Peso chileno =>> Euro\n" +
                        "11) Salir y verificar el historial de  conversiones\n" +
                        "\n"+
                        "Elija una opción valida:\n" +
                        "\n" +
                        "*************************************************");
                menu = opcion.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println("Ingresa el valor que deseas convertir de USD a ARS:");
                        var monto = lectura.nextDouble();
                        Moneda moneda = consulta.buscaMoneda("USD", "ARS", monto);
                        System.out.println(moneda);
                        ArchivoConsultaMoneda archivo = new ArchivoConsultaMoneda();
                        archivo.guardaJson(moneda);
                        historialConversiones.add(moneda);
                        break;
                    case 2:
                        System.out.println("Ingresa el valor que deseas convertir de ARS a USD:");
                        var monto2 = lectura.nextDouble();
                        Moneda moneda2 = consulta.buscaMoneda("ARS", "USD", monto2);
                        System.out.println(moneda2);
                        ArchivoConsultaMoneda archivo2 = new ArchivoConsultaMoneda();
                        archivo2.guardaJson(moneda2);
                        historialConversiones.add(moneda2);
                        break;
                    case 3:
                        System.out.println("Ingresa el valor que deseas convertir de USD a BRL:");
                        var monto3 = lectura.nextDouble();
                        Moneda moneda3 = consulta.buscaMoneda("USD", "BRL", monto3);
                        System.out.println(moneda3);
                        ArchivoConsultaMoneda archivo3 = new ArchivoConsultaMoneda();
                        archivo3.guardaJson(moneda3);
                        historialConversiones.add(moneda3);
                        break;
                    case 4:
                        System.out.println("Ingresa el valor que deseas convertir de BRL a USD:");
                        var monto4 = lectura.nextDouble();
                        Moneda moneda4 = consulta.buscaMoneda("BRL", "USD", monto4);
                        System.out.println(moneda4);
                        ArchivoConsultaMoneda archivo4 = new ArchivoConsultaMoneda();
                        archivo4.guardaJson(moneda4);
                        historialConversiones.add(moneda4);
                        break;
                    case 5:
                        System.out.println("Ingresa el valor que deseas convertir de USD a COP:");
                        var monto5 = lectura.nextDouble();
                        Moneda moneda5 = consulta.buscaMoneda("USD", "COP", monto5);
                        System.out.println(moneda5);
                        ArchivoConsultaMoneda archivo5 = new ArchivoConsultaMoneda();
                        archivo5.guardaJson(moneda5);
                        historialConversiones.add(moneda5);
                        break;
                    case 6:
                        System.out.println("Ingresa el valor que deseas convertir de COP a USD:");
                        var monto6 = lectura.nextDouble();
                        Moneda moneda6 = consulta.buscaMoneda("COP", "USD", monto6);
                        System.out.println(moneda6);
                        ArchivoConsultaMoneda archivo6 = new ArchivoConsultaMoneda();
                        archivo6.guardaJson(moneda6);
                        historialConversiones.add(moneda6);
                        break;
                    case 7:
                        System.out.println("Ingresa el valor que deseas convertir de EUR a MXN:");
                        var monto7 = lectura.nextDouble();
                        Moneda moneda7 = consulta.buscaMoneda("EUR", "MXN", monto7);
                        System.out.println(moneda7);
                        ArchivoConsultaMoneda archivo7 = new ArchivoConsultaMoneda();
                        archivo7.guardaJson(moneda7);
                        historialConversiones.add(moneda7);
                        break;
                    case 8:
                        System.out.println("Ingresa el valor que deseas convertir de MXN a EUR:");
                        var monto8 = lectura.nextDouble();
                        Moneda moneda8 = consulta.buscaMoneda("MXN", "EUR", monto8);
                        System.out.println(moneda8);
                        ArchivoConsultaMoneda archivo8 = new ArchivoConsultaMoneda();
                        archivo8.guardaJson(moneda8);
                        historialConversiones.add(moneda8);
                        break;
                    case 9:
                        System.out.println("Ingresa el valor que deseas convertir de EUR a CLP:");
                        var monto9 = lectura.nextDouble();
                        Moneda moneda9 = consulta.buscaMoneda("EUR", "CLP", monto9);
                        System.out.println(moneda9);
                        ArchivoConsultaMoneda archivo9 = new ArchivoConsultaMoneda();
                        archivo9.guardaJson(moneda9);
                        historialConversiones.add(moneda9);
                        break;
                    case 10:
                        System.out.println("Ingresa el valor que deseas convertir de CLP a EUR:");
                        var monto10 = lectura.nextDouble();
                        Moneda moneda10 = consulta.buscaMoneda("CLP", "EUR", monto10);
                        System.out.println(moneda10);
                        ArchivoConsultaMoneda archivo10 = new ArchivoConsultaMoneda();
                        archivo10.guardaJson(moneda10);
                        historialConversiones.add(moneda10);
                        break;
                    case 11:
                        ArchivoHistorial imprimirHistorial = new ArchivoHistorial();
                        if (historialConversiones.isEmpty()) {
                            System.out.println("No se han realizado conversiones");
                        } else {
                            System.out.println("Historial conversiones");
                            for (Moneda h : historialConversiones) {
                                System.out.println(h);

                            }
                            Scanner impresion = new Scanner(System.in);
                            System.out.println("¿Desea el historial impreso en un archivo?");
                            System.out.println("Oprima 1 para si y 0 para no");
                            var leer = impresion.nextInt();
                            switch (leer) {
                                case 1:
                                    imprimirHistorial.guardarH(historialConversiones);
                                case 0:
                                    break;
                                default:
                                    System.out.println("No ingresó una opción valida");
                            }

                        }
                        break;
                    default:
                        System.out.println("La opción ingresada no es valida, por favor digite una opción de las que se encuentran en el menú.");
                }
            }
            System.out.println("Gracias por utilizar el servicio de conversión de monedas");

        } catch (InputMismatchException e) {
            System.out.println("Por favor ingresar solamente números");
        } catch (IOException e) {
            System.out.println("No se pudó guardar el archivo");
        }
    }
}
