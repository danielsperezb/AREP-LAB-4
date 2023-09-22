/**
 * Clase PngController
 *
 * Esta clase es un controlador que maneja solicitudes para imágenes PNG.
 * Proporciona el contenido de diferentes imágenes PNG cuando se solicitan a través de rutas específicas.
 *
 * Autor: Daniel Perez
 * Fecha: 21 de septiembre de 2023
 */

package edu.escuelaing.app.controllers;

import edu.escuelaing.app.Component;
import edu.escuelaing.app.HttpServer;
import edu.escuelaing.app.RequestMapping;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;

@Component
public class PngController {

    /**
     * Maneja las solicitudes GET para la imagen logo.png.
     *
     * @throws IOException Si ocurre un error al procesar la imagen.
     */
    @RequestMapping("/logo.png")
    public static void getLogoPngImage() throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File("src/main/resources/logo.png"));
        getImageResponse(bufferedImage);
    }

    /**
     * Maneja las solicitudes GET para la imagen madrid.png.
     *
     * @throws IOException Si ocurre un error al procesar la imagen.
     */
    @RequestMapping("/madrid.png")
    public static void getTeamPngImage() throws IOException {
        BufferedImage bufferedImage = ImageIO.read(new File("src/main/resources/madrid.png"));
        getImageResponse(bufferedImage);
    }

    /**
     * Genera la respuesta HTTP para la imagen.
     *
     * @param bufferedImage La imagen a enviar en la respuesta.
     * @throws IOException Si ocurre un error al generar la respuesta.
     */
    private static String getImageResponse(BufferedImage bufferedImage) throws IOException {
        String response;
        response = """
                HTTP/1.1 200 OK\r
                Content-Type: image/png\r
                \r
                """;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HttpServer server = HttpServer.getInstance();
        DataOutputStream dataOutputStream = new DataOutputStream(server.getOutputStream());
        ImageIO.write(bufferedImage, "png", byteArrayOutputStream);
        dataOutputStream.writeBytes(response);
        dataOutputStream.write(byteArrayOutputStream.toByteArray());

        return response;
    }
}
