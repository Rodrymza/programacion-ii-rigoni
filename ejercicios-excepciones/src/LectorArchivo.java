import java.io.*;

public class LectorArchivo {
    public LectorArchivo(){};

    public void leerArchivo(String ruta) throws FileNotFoundException, IOException {
        File archivo = new File(ruta);
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        System.out.println(br.readLine());
    }

}
