/**
 * Anotación RequestMapping
 *
 * Esta anotación se utiliza para mapear una ruta a un controlador o método de manejo en una aplicación.
 * Proporciona información sobre la ruta a la que se debe dirigir una solicitud HTTP.
 *
 * Autor: Daniel Perez
 * Fecha: 21 de septiembre de 2023
 */

package edu.escuelaing.app;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {
    String value();
}
