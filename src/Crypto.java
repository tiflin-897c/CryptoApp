import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Scanner;

public class Crypto {

    public static String cifrar(String mensaje, SecretKey clave) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, clave);
        byte[] mensajeCifrado = cipher.doFinal(mensaje.getBytes());
        return Base64.getEncoder().encodeToString(mensajeCifrado);
    }

    public static String descifrar(String mensajeCifrado, SecretKey clave) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, clave);
        byte[] mensajeDescifrado = cipher.doFinal(Base64.getDecoder().decode(mensajeCifrado));
        return new String(mensajeDescifrado);
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            SecretKey clave = KeyGenerator.getInstance("AES").generateKey();
            int opcion;

            do {
                System.out.println("Menú:");
                System.out.println("1. Cifrar un mensaje");
                System.out.println("2. Descifrar un mensaje");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el mensaje a cifrar: ");
                        String mensaje = scanner.nextLine();
                        String mensajeCifrado = cifrar(mensaje, clave);
                        System.out.println("Mensaje cifrado: " + mensajeCifrado);
                        break;
                    case 2:
                        System.out.print("Ingrese el mensaje cifrado: ");
                        String mensajeDescifrar = scanner.nextLine();
                        String mensajeDescifrado = descifrar(mensajeDescifrar, clave);
                        System.out.println("Mensaje descifrado: " + mensajeDescifrado);
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
                System.out.println();
            } while (opcion != 3);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}