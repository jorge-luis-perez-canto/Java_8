package java8.leccion07.referenciasDeMetodos;

/**
 * @author Jorge Luis Pérez Canto
 */

import java.util.Arrays;

public class MeRefApp {

    public static void referenciaMetodoStatic() {
        System.out.println("Método Referenciado Static");
    }

    public void referenciarMetodoInstanciaObjetoArbitrario() {
        String[] nombres = {"Mito", "Code", "Jorge"};
        // Clase anónima
        /*
        Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
         */


        // Expresión lambda
        //Arrays.sort(nombres, (s1, s2) -> s1.compareToIgnoreCase(s2));

        // Referencias de Métodos (Method References)
        Arrays.sort(nombres, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(nombres));
    }

    public void referenciaMetodoInstanciaObjetoParticular() {
        System.out.println("Método Referido Instancia de un Objeto em particular");
    }

    public void referenciarConstructor() {

        // Función anónima
        /*
        IPersona iper = new IPersona() {
            @Override
            public Persona crear(int id, String nombre) {
                return new Persona(id, nombre);
            }
        };

        Persona per1 = iper.crear(1,"George");
        System.out.println(per1.getId() + " - " + per1.getNombre());

         */

        // Expresión
        /*
        IPersona iper2 = (x, y) -> (new Persona(x, y));
        Persona per2 = iper2.crear(1, "Jorge");
        System.out.println(per2.getId() + " - " + per2.getNombre());

         */


        // Method References
        IPersona iper3 = Persona::new;
        Persona per3 = iper3.crear(1, "Cracker");
        System.out.println(per3.getId() + " - " + per3.getNombre());
    }

    public void operar() {
        //Operacion op = () -> MeRefApp.referenciaMetodoStatic();
        //op.saludar();

        Operacion op2 = MeRefApp::referenciaMetodoStatic;
        op2.saludar();
    }

    public static void main(String[] args) {
        MeRefApp app = new MeRefApp();
        //app.operar();
        //app.referenciarMetodoInstanciaObjetoArtibrario();

        //Operacion op = app::referenciaMetodoInstanciaObjetoParticular;
        //op.saludar();

        app.referenciarConstructor();
    }
}
