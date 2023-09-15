/**
 * Clase HelloController
 *
 * Esta clase es un controlador que maneja las solicitudes para la ruta "/".
 * Devuelve un saludo simple cuando se accede a través de la ruta raíz "/".
 * EJEMPLO PLANTEADO EN ESTE LABORATORIO COMO GUIA
 *
 * Autor: Daniel Esteban Perez Bohorquez
 * Fecha: 21 de septiembre de 2023
 */

package edu.escuelaing.app.controllers;

import edu.escuelaing.app.Component;
import edu.escuelaing.app.RequestMapping;

@Component
public class HelloController {

    /**
     * DADO ENUNCIADO DEL PROBLEMA
     */
    @RequestMapping("/")
    public static String getHello() {
        return "Greetings from Spring Boot!";
    }
}
