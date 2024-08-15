import java.io.BufferedReader;
import java.io.FileReader;

public class EncontrarCodigo {

    public static void main(String[] args) {
        String archivo = "codigos_postales.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                for (String codigo : args){
                    if (linea.contains(codigo)) {
                        System.out.println(linea);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
