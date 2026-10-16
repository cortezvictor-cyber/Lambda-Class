import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

                // 1. El Multiplicador
                ArrayList<Integer> numeros = new ArrayList<>();
                numeros.add(2);
                numeros.add(4);
                numeros.add(6);

                OperaNumeros.multiplicar(numeros, 6);
                System.out.println("1.Multiplicacion  : " + numeros);

        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("Cancion");
        cadenas.add("Camion");
        cadenas.add("Calor");
        cadenas.add("Carlos");
        cadenas.add("Amor");


        OperaCadena.filterSe(cadenas, 'C', 4);
        System.out.println("2.Filter: " + cadenas);

//  3. Conversor de Mayúsculas
        ArrayList<String> minis = new ArrayList<>();
        minis.add("halago");
        minis.add("terco");
        minis.add("envejezco");

        ArrayList<String> mayus = OperaCadena.covierteMay(minis);
        System.out.println("3. Palabras en mayúsculas: " + mayus);

        // --- 4. Cuadrados Únicos ---
        ArrayList<Integer> conDuplicados = new ArrayList<>();
        conDuplicados.add(10);
        conDuplicados.add(10);
        conDuplicados.add(8);
        conDuplicados.add(7); //Como es impar no debe aceptarlo
        conDuplicados.add(8);

        Set<Integer> cuadrados = OperaNumeros.cuadradosParesUnicos(conDuplicados);
        System.out.println("4. Cuadrados de solo par: " + cuadrados);
        //  5. Mapa de Longitudes
        ArrayList<String> longPalabra = new ArrayList<>();
        longPalabra.add("jamoncillo");
        longPalabra.add("Aminoacido");
        longPalabra.add("Paracetamol");

        Map<String, Integer> longitudes = OperaCadena.mapaDeLongitudes(longPalabra);
        System.out.println("5. Mapa de longitudes: " + longitudes);
        //6.Inventario de 10%
        HashMap<String,Double> inventa=new HashMap<>();
        inventa.put("Laptop",1800.0);
        inventa.put("lapiz",13.5);
        inventa.put("Lentes Ray-ban",9740.35);
        System.out.println("6.Aplicando Descuento");
        OperaCadena.descuento(inventa);

        // --- 7. Contador de Frecuencias ---
        ArrayList<String> listaP = new ArrayList<>();
        listaP.add("Tarea");
        listaP.add("Viernes");
        listaP.add("Tarea");
        listaP.add("Viernes");
        listaP.add("Tarea");
        listaP.add("Vamos");

        Map<String, Integer> frecuencias = OperaNumeros.contaFrecuencias(listaP);
        System.out.println("7. Frecuencias de Aparicion: " + frecuencias);

//  8. Clasificador de Palabras
        HashMap<String, Integer> mapaFrec = new HashMap<>();
        mapaFrec.put("Bandana", 6);
        mapaFrec.put("Multijugos", 3);
        mapaFrec.put("Severus", 1);
        ArrayList<String> pocasVeces = OperaCadena.palafrecuencia(mapaFrec, 5);
        System.out.println("8. Palabras con frecuencia menor a 5: " + pocasVeces);
        // 9. Deduplicación de Palabras
        String frase = "Java tarea para el viernes";
        Set<String> unicas = OperaCadena.deduplicapalabra(frase, 5);
        System.out.println("9. Palabras únicas : " + unicas);
        // --- 10. El Tope de Frecuencias ---
        HashMap<String, Integer> mapaTope = new HashMap<>();
        mapaTope.put("Canto", 5);
        mapaTope.put("Java", 2);
        mapaTope.put("Linux", 4);

        // Limita todas las frecuencias a un máximo de 3
        OperaNumeros.topeFrecuencia(mapaTope, 3);
        System.out.println("10. Topes aplicados : " + mapaTope);

    }

            }



