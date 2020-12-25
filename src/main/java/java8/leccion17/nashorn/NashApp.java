package java8.leccion17.nashorn;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

/**
 * @author Jorge Luis Pérez Canto
 * @date 20/12/2020 17:21
 */

public class NashApp {

    private ScriptEngineManager m;
    private ScriptEngine e;
    private Invocable invocador;

    public NashApp() {
        m = new ScriptEngineManager();
        e = m.getEngineByName("nashorn");
        invocador = (Invocable) e;
    }

    public void llamarFunciones() throws Exception {
        //e.eval("print('JS desde java')");

        e.eval(new FileReader("src/main/java/java8/t17/nashorn/archivo.js"));

        double rpta = (double) invocador.invokeFunction("calcular",2,3);
        System.out.println(rpta);
    }

    public void implementarInterfaz() throws Exception {
        e.eval(new FileReader("src/main/java/java8/t17/nashorn/archivo.js"));

        Object implementacion = e.get("hiloImpl");
        Runnable r = invocador.getInterface(implementacion, Runnable.class);

        Thread th1 = new Thread(r);
        th1.start();

        Thread th2 = new Thread(r);
        th2.start();
    }

    public static void main(String[] args) throws Exception {
        NashApp app = new NashApp();
        //app.llamarFunciones();
        app.implementarInterfaz();
    }
}
