import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Llamadas de prueba (el main queda corto y limpio)
        System.out.println("1. Multiplicador: " + multiplicar(new ArrayList<>(Arrays.asList(1, 2, 3, 4)), 2));
        System.out.println("2. Filtro: " + filtrar(new ArrayList<>(Arrays.asList("casa", "auto", "sol")), 'a', 4));
        System.out.println("3. Mayúsculas: " + aMayusculas(new ArrayList<>(Arrays.asList("hola", "java"))));
        System.out.println("4. Cuadrados: " + cuadradosUnicos(new ArrayList<>(Arrays.asList(2, 2, 4, 6))));
        System.out.println("5. Longitudes: " + mapaLongitudes(new ArrayList<>(Arrays.asList("java", "code"))));

        HashMap<String, Double> inv = new HashMap<>(); inv.put("Manzana", 20.0);
        System.out.print("6. Inventario: "); inventarioDescuento(inv);

        System.out.println("7. Frecuencias: " + contarFrecuencias(new ArrayList<>(Arrays.asList("a", "b", "a"))));

        HashMap<String, Integer> mapa = new HashMap<>(); mapa.put("java", 3); mapa.put("py", 1);
        System.out.println("8. Clasificador: " + clasificar(mapa, 2));
        System.out.println("9. Deduplicar: " + deduplicapalabra("Hola HOLA java java", 3));

        HashMap<String, Integer> tope = new HashMap<>(); tope.put("manzana", 10);
        System.out.println("10. Tope: " + topeFrecuencias(tope, 5));
    }

    // --- TUS 10 MÉTODOS ---
    public static ArrayList<Integer> multiplicar(ArrayList<Integer> l, int f) {
        l.replaceAll(n -> n * f); return l;
    }
    public static ArrayList<String> filtrar(ArrayList<String> l, char c, int n) {
        l.removeIf(s -> s.startsWith(String.valueOf(c)) || s.length() < n); return l;
    }
    public static ArrayList<String> aMayusculas(ArrayList<String> l) {
        return l.stream().map(String::toUpperCase).collect(Collectors.toCollection(ArrayList::new));
    }
    public static Set<Integer> cuadradosUnicos(ArrayList<Integer> l) {
        return l.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toSet());
    }
    public static Map<String, Integer> mapaLongitudes(ArrayList<String> l) {
        return l.stream().collect(Collectors.toMap(s -> s, String::length, (k1, k2) -> k1));
    }
    public static void inventarioDescuento(HashMap<String, Double> inv) {
        inv.forEach((k, v) -> System.out.print(k + ": " + (v * 0.9)));
        System.out.println();
    }
    public static HashMap<String, Integer> contarFrecuencias(ArrayList<String> l) {
        HashMap<String, Integer> m = new HashMap<>();
        l.forEach(p -> m.merge(p, 1, Integer::sum));
        return m;
    }
    public static ArrayList<String> clasificar(HashMap<String, Integer> m, int lim) {
        return m.entrySet().stream().filter(e -> e.getValue() < lim).map(Map.Entry::getKey).collect(Collectors.toCollection(ArrayList::new));
    }
    public static Set<String> deduplicapalabra(String f, int m) {
        return Arrays.stream(f.split("\\s+")).map(String::toLowerCase).filter(s -> s.length() >= m).collect(Collectors.toSet());
    }
    public static HashMap<String, Integer> topeFrecuencias(HashMap<String, Integer> m, int max) {
        m.replaceAll((k, v) -> v > max ? max : v); return m;
    }
}
