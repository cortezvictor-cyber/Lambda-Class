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
                .filter(n -> n % 2 == 0)      // Filtra solo los números pares
                .map(n -> n * n)              // Eleva cada número al cuadrado
                .collect(Collectors.toSet()); // Recolecta en un Set (elimina duplicados automáticamente)
    }


}
