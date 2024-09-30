## Conversor de Monedas
Este es un Challenge de Conversor de Monedas desarrollado en Java, que permite convertir valores entre diferentes monedas utilizando la API de ExchangeRate-API. 
El programa se ejecuta en consola y ofrece un menú interactivo para seleccionar las monedas de origen y destino, así como ingresar el valor que deseas convertir.

## Características
Conversión entre múltiples monedas.
Interfaz de usuario en consola.
Conexión a la API de ExchangeRate-API para obtener tasas de cambio actualizadas.
Manejo de errores y validaciones para entradas no válidas.
Fácil de usar y personalizar.
Monedas soportadas
Las conversiones soportadas incluyen:

USD (Dólar estadounidense)
ARS (Peso argentino)
BRL (Real brasileño)
COP (Peso colombiano)
CLP (Peso chileno)

## Requisitos del sistema
Para ejecutar este proyecto, necesitas:
Java 11 o superior.
Internet para conectarse a la API de conversión de monedas. https://www.exchangerate-api.com/

## Instalación
Clona este repositorio en tu máquina local:
git clone https://github.com/tu-usuario/java-conversor-monedas.git
cd java-conversor-monedas

## Uso
Al ejecutar el programa, verás un menú en la consola con varias opciones de conversión de moneda.
Selecciona la opción correspondiente a la conversión deseada.
Ingresa el valor de la moneda que deseas convertir.
El programa mostrará el resultado de la conversión basado en las tasas de cambio más recientes obtenidas de la API.

--<<<<< Menu conversor de monedas >>>>>--
[1] (USD) Dólar => Peso argentino (ARS)
[2] (ARS) Peso argentino => Dólar (USD)
[3] (USD) Dólar => Real brasileño (BRL)
[4] (BRL) Real Brasileño => Dólar (USD)
[5] (USD) Dólar => Peso colombiano (COP)
[6] (COP) Peso colombiano => Dólar (USD)
[7] (USD) Dólar => Peso chileno (CLP)
[8] (CLP) Peso chileno => Dólar (USD)
----------------------------------------->
[9] Salir

Elija una de las opciones válidas: 1
Ingrese un valor válido de su moneda para convertir: 100
El resultado de: 100 USD, es igual a: 97058.0 ARS

## API Utilizada
Este proyecto utiliza la ExchangeRate-API para obtener las tasas de cambio actuales. 
Para su funcionamiento, necesitas tu propia clave de API, la cual puedes obtener de la página oficial y luego reemplazar en la URL de consulta:
https://www.exchangerate-api.com/

