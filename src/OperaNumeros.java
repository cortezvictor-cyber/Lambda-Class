import java.util.*;
import java.util.stream.Collectors;
public final class OperaNumeros {
    private OperaNumeros(){}

    //1.Multiplicar
    public static void multiplicar(ArrayList<Integer> lista,int fac){
        if(lista == null) return;
        lista.replaceAll(n-> n== null ? null: n*fac);

    }
    //4.Cuadrados unicos
    public static Set<Integer> cuadradosParesUnicos(ArrayList<Integer> numeros) {
        if (numeros == null) return new HashSet<>();

        return numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toSet());
    }
    // 7. Contador de Frecuencias
    public static Map<String, Integer> contaFrecuencias(ArrayList<String> palabras) {
        Map<String, Integer> frecuencias = new HashMap<>();
        for (String palabra : palabras) {
            frecuencias.merge(palabra, 1, Integer::sum);
        }
        return frecuencias;
    }

    // 10.Tope de Frecuencias
    public static void topeFrecuencia(HashMap<String, Integer> mapaFrecuencias, int maximo) {
        mapaFrecuencias.replaceAll((palabra, frecuencia) -> Math.min(frecuencia, maximo));
    }


}
