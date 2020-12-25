package java8.leccion15.FuncionesDeAltoOrden;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Jorge Luis Pérez Canto
 * @date 19/12/2020 15:58
 */

public class HighApp {

    private Function<String, String> convertirMayusculas = x -> x.toUpperCase();
    private Function<String, String> convertirMinusculas = x -> x.toLowerCase();

    public void imprimir(Function<String, String> funcion, String valor) {
        System.out.println(funcion.apply(valor));
    }

    private Function<String, String> mostrar(String mensaje) {
        return (String x) -> mensaje + x;
    }


    public void filtrar(List<String> lista, Consumer<String> consumidor, int longitud) {
        lista.stream().filter(this.establecerLogicaFiltro(longitud)).forEach(consumidor);
    }

    public Predicate<String> establecerLogicaFiltro(int longitud) {
        return texto -> texto.length() < longitud;
    }


    public void filtrar(List<String> lista, Consumer<String> consumidor, String cadena) {
        lista.stream().filter(this.establecerLogicaFiltro(cadena)).forEach(consumidor);
    }

    public Predicate<String> establecerLogicaFiltro(String cadena) {
        return texto -> texto.contains(cadena);
    }


    public static void main(String[] args) {
        HighApp app = new HighApp();
        //app.imprimir(app.convertirMayusculas, "MitoCode1");
        //app.imprimir(app.convertirMinusculas, "MitoCode2");

        //System.out.println(app.mostrar("Hola ").apply("George"));

        List<String> lista = new ArrayList<>();
        lista.add("Mito");
        lista.add("Code");
        lista.add("MitoCode");

        //app.filtrar(lista, System.out::println, 5);

        app.filtrar(lista, System.out::println, "Mito");
    }

}
