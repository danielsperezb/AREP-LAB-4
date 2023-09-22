/**
 * Clase JpgController
 *
 * Esta clase es un controlador que maneja solicitudes para imágenes JPG.
 * Proporciona el contenido de la imagen Piolín cuando se solicita a través de la ruta "/piolin.jpg".
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
import javax.imageio.ImageIO;

@Component
public class JpgController {

    /**
     * Maneja las solicitudes GET para la imagen piolin.jpg.
     *
     * @return Una respuesta HTTP que incluye el contenido de la imagen JPEG.
     * @throws IOException Si ocurre un error al procesar la imagen.
     */
    @RequestMapping("/piolin.jpg")
    public static String getLogoPngImage() throws IOException {
        String response;
        response = """
                HTTP/1.1 200 OK\r
                Content-Type: image/jpg\r
                \r
                """;
        BufferedImage bufferedImage = ImageIO.read(new File("src/main/resources/piolin.jpg"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HttpServer server = HttpServer.getInstance();
        DataOutputStream dataOutputStream = new DataOutputStream(server.getOutputStream());
        ImageIO.write(bufferedImage, "jpg", byteArrayOutputStream);
        dataOutputStream.writeBytes(response);
        dataOutputStream.write(byteArrayOutputStream.toByteArray());
        return response;
    }
}
