import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       
       Metodos m = new metodos();
       //ejecucion
        System.out.println("Hello, World!");
        System.out.println(m.NombreNumero(1));

        String palabras = "uUno DoOS";
        System.out.println(m.listaNumeros(palabras, [1,2]));

        ArrayList<Integer> array = new ArrayList<Integer>(List.of(1,2,3));
        System.out.println(m.reglaDe3({1,2,3}, 60);
    
        ArrayList<String> array = new ArrayList<String>(List.of("uno, dos, tres"));
        System.out.println(m.regla3("uno, dos, tres", 100);
    }
}
