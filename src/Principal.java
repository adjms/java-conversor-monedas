import java.text.StringCharacterIterator;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int salir = 0;
        while (salir != 9){
            String menu = """
                    --<<<<< Menu conversor de monedas >>>>>--
                    [1] (USD) Dólar => Peso argentino (ARS)
                    [2] (ARS) Peso argentino => Dólar (USD)
                    [3] (USD) Dólar => Real brasileño (BRL)
                    [4] (BRL) Real Brasileño => Dólar (USD)
                    [5] (USD) Dólar => Peso colombiano (COP)
                    [6] (COP) Peso colombiano => Dólar (USD)
                    [7] (USD) Dólar => Peso chileno (CLP)
                    [8] (CLP) Peso chileno = Dólar (USD)
                    ----------------------------------------->
                    [9] Salir
                    """;
            System.out.println(menu);
            try {
                System.out.println("Elija una de las opciones válidas");
                //Leer opción del menú
                var opcion = Integer.valueOf(teclado.nextInt());

                if (opcion == 9) {
                    System.out.println("Gracias por utilizar el conversor de monedas.");
                    break;
                }
                System.out.println("Ingrese un valor válido de su moneda para convertir");
                var valor = teclado.next();

                String base = "";
                String conversion = "";
                String valorMoneda = valor;
                switch (opcion){
                    case 1:
                        base = "USD";
                        conversion = "ARS";
                        System.out.println("Esta es la opción: "+opcion+ "- base: "+base + "- conversion: "+conversion+ "- Valor: "+valorMoneda);
                        break;
                    case 2:
                        base = "ARS";
                        conversion = "USD";
                        break;
                    case 3:
                        base = "USD";
                        conversion = "BRL";
                        break;
                    case 4:
                        base = "BRL";
                        conversion = "USD";
                        break;
                    case 5:
                        base = "USD";
                        conversion = "COP";
                        break;
                    case 6:
                        base = "COP";
                        conversion = "USD";
                        break;
                    case 7:
                        base = "COP";
                        conversion = "CLP";
                        break;
                    case 8:
                        base = "CLP";
                        conversion = "USD";
                        break;
                    default:
                        salir = 9;
                }

                ConsultaMoneda consulta = new ConsultaMoneda();
                Moneda moneda = consulta.convierteMoneda(base, conversion, valor);
                //System.out.println("Respuesta API "+moneda);
                System.out.println("El resultado de: "+valor+" "+base+", es igual a: "+moneda.conversion_result()+" "+conversion);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue; // Volver a mostrar el menú si la entrada es incorrecta
            }catch (RuntimeException e){
                System.out.println("Error:_" + e.getMessage());
            }
        }
    }
}
