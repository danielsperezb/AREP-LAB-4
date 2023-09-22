/**
 * Clase HtmlController
 *
 * Esta clase es un controlador que maneja solicitudes para varios archivos HTML.
 * Proporciona el contenido de diferentes páginas HTML cuando se solicitan a través de rutas específicas.
 *
 * Autor: [Tu Nombre]
 * Fecha: [Fecha Actual]
 */

package edu.escuelaing.app.controllers;

import edu.escuelaing.app.Component;
import edu.escuelaing.app.RequestMapping;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class HtmlController {

    // Tipo de contenido para respuestas HTML
    private static final String CONTENT_TYPE_HTML = "Content-Type: text/html\r\n\r\n";

    /**
     * Lee un archivo HTML del sistema de archivos.
     *
     * @param filename El nombre del archivo HTML a leer.
     * @return El contenido del archivo HTML como una cadena.
     * @throws IOException Si ocurre un error al leer el archivo HTML.
     */
    private static String readHtmlFile(String filename) throws IOException {
        Path path = Paths.get("src/main/resources/" + filename);
        return Files.readString(path);
    }

    /**
     * Maneja las solicitudes GET para el archivo page.html.
     *
     * @return Una respuesta HTTP que incluye el contenido del archivo page.html.
     * @throws IOException Si ocurre un error al leer el archivo page.html.
     */
    @RequestMapping("/page.html")
    public static String getHtmlExclusivePage() throws IOException {
        return "HTTP/1.1 200 OK\r\n" + CONTENT_TYPE_HTML + readHtmlFile("page.html");
    }

    /**
     * Maneja las solicitudes GET para el archivo principal.html.
     *
     * @return Una respuesta HTTP que incluye el contenido del archivo principal.html.
     * @throws IOException Si ocurre un error al leer el archivo principal.html.
     */
    @RequestMapping("/principal.html")
    public static String getHtmlWithCssAndJsPage() throws IOException {
        return "HTTP/1.1 200 OK\r\n" + CONTENT_TYPE_HTML + readHtmlFile("principal.html");
    }

    /**
     * Maneja las solicitudes GET para el archivo noEncontrado.html.
     *
     * @return Una respuesta HTTP que incluye el contenido del archivo noEncontrado.html.
     * @throws IOException Si ocurre un error al leer el archivo noEncontrado.html.
     */
    @RequestMapping("/noEncontrado.html")
    public static String getErrorPage() throws IOException {
        return "HTTP/1.1 200 OK\r\n" + CONTENT_TYPE_HTML + readHtmlFile("noEncontrado.html");
    }
}
