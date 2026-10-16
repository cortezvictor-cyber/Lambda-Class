import java.util.*;
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
public static void descuento(HashMap<String, Double> inven) {

    System.out.println("Tienda de 10%");
    inven.forEach((producto, precio) -> {
        double precioDescuento = precio * 0.90;
        System.out.println("Producto:"+producto+ "| Precio Original:" +precio+ "| Precio con Descuento:"+precioDescuento);
    });
    }
    // 8. Clasificador de Palabras (HashMap)
    public static ArrayList<String> palafrecuencia(HashMap<String, Integer> mapaFrecuencia, int maxFrecuencia) {
        return mapaFrecuencia.entrySet().stream()
                .filter(entry -> entry.getValue() < maxFrecuencia)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // 9. Deduplicación de Palabras (HashSet)
    public static Set<String> deduplicapalabra(String frase, int mLetras) {
        String[] palabrasArray = frase.split("\\s+");
        return Arrays.stream(palabrasArray)
                .map(String::toLowerCase)
                .filter(s -> s.length() >= mLetras)
                .collect(Collectors.toSet());
    }
}






