/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.escuelaing.app.controllers;

import edu.escuelaing.app.Component;
import edu.escuelaing.app.RequestMapping;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Controlador para manejar solicitudes de "script.js" y pues lo ideal seria poner todos los .js en este controlador.
 * Autor: Daniel Esteban Pérez Bohórquez
 */
@Component
public class JsController {
    
    /**
     * Maneja la solicitud para obtener el contenido del archivo "script.js".
     * 
     * @return Respuesta HTTP que incluye el contenido del archivo "script.js".
     * @throws IOException Si ocurre un error de entrada/salida al leer el archivo.
     */
    @RequestMapping("/script.js")
    public static String getMovementTextScript() throws IOException {
        String response;
        Path path = Paths.get("src/main/resources/script.js");
        String file = Files.readString(path);
        return response = "HTTP/1.1 200 OK\r\n"
                + "Content-Type: application/javascript\r\n"
                + "\r\n"
                + file;
    }
    
}
