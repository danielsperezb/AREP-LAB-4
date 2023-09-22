/**
 * Clase CssController
 *
 * Esta clase es un controlador que maneja las solicitudes para el archivo style.css.
 * Proporciona el contenido del archivo CSS cuando se solicita a través de la ruta "/style.css".
 *
 * Autor: Daniel Esteban Perez Bohorquez
 * Fecha: 21 de septiembre de 2023
 */

package edu.escuelaing.app.controllers;

import edu.escuelaing.app.Component;
import edu.escuelaing.app.RequestMapping;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class CssController {

    /**
     * Método getStyleCss
     *
     * Este método maneja las solicitudes GET para el archivo style.css.
     *
     * @return Una cadena de respuesta HTTP que incluye el contenido del archivo CSS.
     * @throws IOException Si ocurre un error al leer el archivo style.css.
     */
    @RequestMapping("/style.css")
    public static String getStyleCss() throws IOException {
        String response;
        Path path = Paths.get("src/main/resources/style.css");
        String file = Files.readString(path);
        return response = "HTTP/1.1 200 OK\r\n"
                + "Content-Type: text/css\r\n"
                + "\r\n"
                + file;
    }
}
