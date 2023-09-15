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


    public static void main(String[] args) throws IOException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        // Inicia el servidor HTTP utilizando el patrón Singleton.
        HttpServer.getInstance().start();
    }
}
