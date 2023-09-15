/**
 * Clase HttpServer
 *
 * Esta clase representa un servidor HTTP simple que escucha en un puerto y maneja las solicitudes HTTP entrantes.
 * Utiliza reflexión para escanear controladores marcados con anotaciones y enrutar las solicitudes a los métodos correspondientes.
 *
 * Autor: Daniel Perez
 * Fecha: 21 de septiembre de 2023
 */

package edu.escuelaing.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.*;
import edu.escuelaing.app.RequestMapping;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class HttpServer {

    private static final HttpServer _instance = new HttpServer();

    private static final Map<String, Method> servicios = new HashMap<>();

    public static HttpServer getInstance() {
        return _instance;
    }

    private OutputStream outputStream;
    private static final int PORT = 35000; 

    /**
     * Inicia el servidor HTTP y maneja las solicitudes entrantes.

     */
    public void start() throws ClassNotFoundException, IOException, IllegalAccessException, InvocationTargetException {


        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(PORT);

        } catch (IOException e) {
            System.err.println("Could not listen on port: " + PORT);
            System.exit(1);
        }

        while (true) {

            Socket clientSocket = null;
            try {
                System.out.println("\nListo para recibir... \n");
                clientSocket = serverSocket.accept();
            } catch (IOException e) {
                System.err.println("Accept failed.");
                System.exit(1);
            }

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            clientSocket.getInputStream()
                    ));

            outputStream = clientSocket.getOutputStream();

            String input, response;
            boolean firstLine = true;
            String urlString = "";
            while ((input = in.readLine()) != null) {
                System.out.println("Received: " + input);
                if (firstLine) {
                    firstLine = false;
                    urlString = input.split(" ")[1];
                    System.out.println("Data request: " + input);

                }

                if (!in.ready()) {
                    break;
                }

            }

         

            out.println(response);

            out.close();
            in.close();
            clientSocket.close();
        }
    }

    /**
     * Obtiene el flujo de salida.
     *
     * @return El flujo de salida.
     */
    public OutputStream getOutputStream() {
        return this.outputStream;
    }

   
}
