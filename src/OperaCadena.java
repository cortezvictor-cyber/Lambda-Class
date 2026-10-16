import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public final  class OperaCadena {
    private OperaCadena() {
    }
    //2.Filtro Selectivo

    public static void filterSe(ArrayList<String> lista, char letra, int n) {
        if (lista == null) return;
        char letraMin = Character.toLowerCase(letra);


        lista.removeIf(s -> {
            if (s == null) return true;
            String lower = s.toLowerCase();
            boolean empiezaConLetra = !lower.isEmpty() && lower.charAt(0) == letraMin;
            boolean longitudMenor = s.length() < n;

            return empiezaConLetra || longitudMenor;
        });
    }

    //3.Conversor de Mayúsculas (ArrayList)
    public static ArrayList<String> covierteMay(ArrayList<String> palabra) {
if(palabra==null) return new ArrayList<>();
return palabra.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));
    }
    // 5. Mapa de Longitudes
    public static Map<String, Integer> mapaDeLongitudes(ArrayList<String> palabras) {
        return palabras.stream()
                .collect(Collectors.toMap(
                        palabra -> palabra,
                        String::length,
                        (v1, v2) -> v1
                ));
    }
    //6 Modifica Inventario


}





