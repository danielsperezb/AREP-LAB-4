/**
 * Anotación Component
 *
 * Esta anotación marca una clase como un componente de la aplicación.
 * Los componentes marcados con esta anotación pueden ser escaneados y gestionados por el framework de la aplicación.
 *
 * Autor: Daniel Perez
 * Fecha: 21 de septiembre de 2023
 */

package edu.escuelaing.app;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
}
