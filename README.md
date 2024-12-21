# Conversor de Monedas en Java

## Descripción

Este es un conversor de monedas interactivo desarrollado en Java. Utiliza una API externa para obtener tasas de cambio en tiempo real y permite convertir valores entre diferentes monedas. Es un proyecto simple pero poderoso que demuestra cómo consumir APIs y manejar datos JSON en Java.

---

## Características

- **Interfaz interactiva**: El usuario puede seleccionar monedas y montos a convertir.
- **Tasas de cambio actualizadas**: Obtiene datos en tiempo real desde una API de tipo de cambio.
- **Manejo de errores**: Valida entradas y gestiona fallos en la API.

---

## Requisitos

- **Java 8** o superior.
- **Maven** como gestor de dependencias.
- Acceso a Internet para consumir la API.

---

## Instalación

1. Clona este repositorio:
   ```bash
   git clone https://github.com/SebaOlat3/conversor-monedas-java.git
   cd conversor-monedas-java
Asegúrate de que Maven esté instalado y configurado.

Compila el proyecto y descarga las dependencias:

bash
Copiar código
mvn clean install
Genera el archivo .jar ejecutable:

bash
Copiar código
mvn package
Uso
Ejecuta el archivo .jar generado:

bash
Copiar código
java -jar target/conversor-monedas.jar
Sigue las instrucciones en la consola:

Introduce la moneda de origen (por ejemplo, USD).
Introduce la moneda de destino (por ejemplo, EUR).
Escribe el monto a convertir.
Ejemplo de Uso:

arduino
Copiar código
Bienvenido al conversor de monedas!
Seleccione la moneda origen (por ejemplo, USD): USD
Seleccione la moneda destino (por ejemplo, EUR): EUR
Ingrese el monto a convertir: 100
Resultado: 100.00 USD = 90.12 EUR
Dependencias
El proyecto utiliza las siguientes librerías:

OkHttp: Para realizar solicitudes HTTP.
JSON: Para manejar datos JSON.
Estas dependencias se administran automáticamente mediante Maven.

API utilizada
Este proyecto consume datos de la Exchange Rate API para obtener tasas de cambio actualizadas en tiempo real.

Estructura del Proyecto
less
Copiar código
conversor-monedas-java
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── miempresa/
│   │   │           └── conversor/
│   │   │               ├── Main.java            // Punto de entrada del programa
│   │   │               ├── CurrencyConverter.java // Clase para conversión
│   │   │               ├── ApiClient.java       // Clase para consumir la API
│   │   │               └── Utils.java           // Métodos auxiliares
│   ├── resources/                               // Archivos de configuración, si aplica
├── pom.xml                                     // Archivo de configuración de Maven
├── README.md                                   // Documentación del proyecto
├── .gitignore                                  // Ignorar archivos innecesarios
Contribución
¡Contribuye al desarrollo de este proyecto!

Haz un fork del repositorio.
Crea una rama para tu funcionalidad o corrección:
bash
Copiar código
git checkout -b mi-rama
Haz un commit con tus cambios:
bash
Copiar código
git commit -m "Añadí una nueva funcionalidad"
Sube los cambios a tu repositorio:
bash
Copiar código
git push origin mi-rama
Crea un Pull Request en el repositorio original.
Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo LICENSE para más detalles.

Autor
Sebastián Vásquez
GitHub: SebaOlat3

