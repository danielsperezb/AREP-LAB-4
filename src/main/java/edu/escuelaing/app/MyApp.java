package edu.escuelaing.app;

import edu.escuelaing.app.HttpServer;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Clase principal de la aplicación.
 * Autor: Daniel Esteban Pérez Bohórquez
 * Fecha: 21 de septiembre de 2023
 */
public class MyApp {

    /**
     * Método principal de la aplicación que inicia el servidor HTTP.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
     * @throws IOException Controlada
     * @throws InvocationTargetException Controlada
     * @throws IllegalAccessException Controlada
     * @throws ClassNotFoundException Controlada
     */
    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        // Inicia el servidor HTTP utilizando el patrón Singleton.
        HttpServer.getInstance().start();
    }
}
