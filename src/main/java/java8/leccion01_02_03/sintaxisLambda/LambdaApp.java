package java8.leccion01_02_03.sintaxisLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Jorge Luis Pérez Canto
 */

public class LambdaApp
{
    public void ordenar() {
        List<String> lista = new ArrayList<>();
        lista.add("Mitocode");
        lista.add("Code");
        lista.add("Mito");

        // JDK < 1.7
		/*
		Collections.sort(lista, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}

		});
		*/

        // Lambda
        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    public void calcular() {

        // Imperativo
		/*
		Operacion op = new Operacion() {

			@Override
			public double calcularPromedio(double n1, double n2) {
				return (n1+n2)/2;
			}
		};
		*/

        // Declarativo
        //Operacion op = (double p1, double p2) -> (p1+p2)/2;


        //System.out.println(op.calcularPromedio(2, 3));

    }

    public static void main( String[] args )
    {
        LambdaApp app = new LambdaApp();
        app.ordenar();
        app.calcular();
    }
}
