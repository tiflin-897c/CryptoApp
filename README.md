# Cifrador AES en Java (Crypto.java)

Aplicación de consola en Java que permite cifrar y descifrar mensajes usando el algoritmo de cifrado simétrico **AES (Advanced Encryption Standard)**. Usa una clave secreta generada automáticamente al iniciar.

## 🔐 Características

- Cifrado de texto plano usando AES.
- Descifrado de mensajes cifrados previamente.
- Codificación y decodificación Base64 para facilitar la entrada/salida.
- Interfaz simple en consola.

## 🛠️ Tecnologías

- Java SE
- `javax.crypto` para cifrado AES
- `java.util.Base64` para codificación
- `java.util.Scanner` para entrada por consola

🧪 Ejemplo de uso

- Se muestra un menú con tres opciones: cifrar, descifrar o salir.
- El usuario puede ingresar un mensaje para cifrar.
- El programa muestra el mensaje cifrado en Base64.
- Luego puede ingresar ese mensaje cifrado para obtener el mensaje original.
- El programa continúa hasta que se selecciona la opción de salir.


