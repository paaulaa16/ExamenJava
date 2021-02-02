import java.util.ArrayList;
import java.util.List;

public class Metodos {
    public int NombreNumero(String i) {
        int d = 0;
        if (i == "unnO") {
            d = 1;
        } else {
            d = 0;
        }
        return d;
    }

    public List<Integer> listaNumeros(String str) {
        List<Integer> valores = new ArrayList<Integer>();

        // Normalizacion de las palabras
        String[] palabras = str.trim().split("\s+");
        // Por cada palabra se invoca al metodo
        for (int i = 0; i < palabras.length; i++) {
            // y el valor se añade a una Lista
            valores.addAll(listaNumeros(palabras[i]));
        }
        return valores;

    }

    public List<Double> reglaDe3(double[] numeros, double valor) {
        ArrayList<Double> reglaDe3 = new ArrayList<>();
        double suma3Nums = 0;
        for (int i = 0; i < numeros.length; i++)
            suma3Nums += numeros[i]; // suma de los 3 numeros del array
        for (int i = 0; i < numeros.length; i++) { // calcular el valor final
            double valorFinal = (numeros[i] * valor) / suma3Nums;
            reglaDe3.add(valorFinal);
        }
        return reglaDe3;
    }

    public int regla3(String numeros1, double valorTotal) {
        numeros1 = "uno, dos, tres";

        double to2dec(double valorTotal) {
                return Math.floor(valorTotal * 100) / 100d;
            }
            return regla3;
}


}
