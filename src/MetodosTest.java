import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class MetodosTest {

    @Test
    @DisplayName("nombreNumero")
    public void test1(){
        //preparacion
        Metodos m = new Metodos();
        //ejecucion
        int d = m.NombreNumero(1);
        //confirmacion
        assertEquals("1", d);
    }

    @Test
    @DisplayName("listaNumeros")
    public void test2(){
        //preparacion
        Metodos m = new Metodos();
        //ejecucion
        int valores = m.listaNumeros("uUno DoOS");
        //confirmacion
        assertEquals("uUno DoOS", valores);
    }

    @Test
    @DisplayName("reglaDe3")
    public void test3(){
        //preparacion
        Metodos m = new Metodos();
        //ejecucion
        int reglaDe3 = m.reglaDe3({1,2.3}, 60);
        //confirmacion
        assertEquals("10d, 20d, 30d", reglaDe3);
    }

    @Test
    @DisplayName("regla3")
    public void test4(){
        //preparacion
        Metodos m = new Metodos();
        //ejecucion
        int result = m.regla3("uno, dos, tres");
        //confirmacion
        assertEquals("uno, dos, tres", result);
    }

    
}
