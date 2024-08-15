
import java.io.BufferedReader;
import java.io.FileReader;

/* Contar cuantos códigos postales corresponden a asentamientos rurales
y cantos a asentamientos rurales
 */

public class Main {
    public static void main(String[] args) {

        String archivo = "codigos_postales.csv";
        int conteoUrbanos = 0;
        int conteoRurales = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            
            while ((linea = br.readLine()) != null) {
                if (linea.contains("Urbano")) {
                    conteoUrbanos++;
                } else if (linea.contains("Rural")) {
                    conteoRurales++;
                }
            }
            System.out.println("Asentamientos Urbanos: " + conteoUrbanos);
            System.out.println("Asentamientos Rurales: " + conteoRurales);
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
        
    
    }
}