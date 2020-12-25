package java8.leccion9.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jorge Luis Pérez Canto
 */

public class StreamsApp {
    private List<String> lista;
    private List<String> numeros;

    public StreamsApp() {
        lista = new ArrayList<>();
        lista.add("Mito");
        lista.add("Code");
        lista.add("Jorge");
        lista.add("MitoCode");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
    }

    public void filtrar() {
        lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
    }

    public void ordenar() {
        //Ascendente
        //lista.stream().sorted().forEach(System.out::println);

        //Descendente
        lista.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);
    }

    public void transformar() {
        // Convertir a mayúsculas
        //lista.stream().map(String::toUpperCase).forEach(System.out::println);


        // Convertir a entero y aumentar cada elemento una unidad
        // Imperativa
        /*
        for (String x : numeros) {
            int num = Integer.parseInt(x) + 1;
            System.out.println(num);
        }

         */

        // Api Stream
        numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);

    }

    public void limitar() {
        lista.stream().limit(2).forEach(System.out::println);
    }

    public void contar() {
        long x = lista.stream().count();
        System.out.println(x);
    }

    public static void main(String[] args) {
        StreamsApp app = new StreamsApp();
        //app.filtrar();
        //app.ordenar();
        //app.transformar();
        //app.limitar();
        app.contar();
    }

}
