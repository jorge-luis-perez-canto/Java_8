package java8.leccion8.ForEachRemoveIfSoft;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jorge Luis Pérez Canto
 */

public class ColeccionApp {
    private List<String> lista;

    public void llenarLista() {
        lista = new ArrayList<>();
        lista.add("MitoCode");
        lista.add("Mito");
        lista.add("Code");
    }

    public void usarForEach() {

        /*
        for (String elemento : lista) {
            System.out.println(elemento);
        }
         */

        //lista.forEach(x -> System.out.println(x));

        //Referencias a métodos
        lista.forEach(System.out::println);
    }

    public void usarRemoveIf() {
        /*
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase("Code")) {
                it.remove();
            }
        }

         */

        lista.removeIf(x -> x.equalsIgnoreCase("Code"));

    }

    public void usarSort(){
        //lista.sort((x,y) -> x.compareTo(y));

        lista.sort(String::compareTo);
    }

    public static void main(String[] args) {
        ColeccionApp app = new ColeccionApp();
        app.llenarLista();
        //app.usarForEach();

        //app.usarRemoveIf();

        app.usarSort();
        app.usarForEach();
    }
}
