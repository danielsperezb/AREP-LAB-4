# AREP-LAB-4

En el Taller de Arquitecturas de Servidores de Aplicaciones, Meta Protocolos de Objetos, Patrón IoC y Reflexión, los estudiantes llevaron a cabo la construcción de un servidor web en Java, con capacidades para entregar páginas HTML e imágenes PNG, así como la implementación de un marco de trabajo IoC para el desarrollo de aplicaciones web a partir de POJOs. 

A través de este taller, los participantes crearon un prototipo inicial que demostró las capacidades reflexivas de Java al cargar un bean (POJO) desde la línea de comandos y derivar una aplicación web a partir de él. A medida que avanzaron, perfeccionaron su servidor y framework IoC, permitiendo que el servidor explorara automáticamente el directorio raíz en busca de clases anotadas como componentes, simplificando el proceso de desarrollo de aplicaciones web. Los entregables finales incluyeron el código fuente del proyecto gestionado mediante Maven y su almacenamiento en cuentas de GitHub, junto con un seguimiento y comparación de commits desde el inicio del laboratorio hasta la entrega final.

## Reto


El principal reto de este laboratorio radica en la complejidad de diseñar y desarrollar un servidor web en Java, así como en la implementación de un framework IoC desde cero. Los estudiantes deben comprender profundamente los conceptos de reflexión y la inversión de control, además de enfrentar la tarea de hacer que el servidor sea capaz de cargar dinámicamente clases y componentes anotados. Además, la construcción de una aplicación web de ejemplo que funcione con este servidor agrega un nivel adicional de complejidad, ya que deben integrar todos estos componentes en un sistema cohesivo. En resumen, el reto fundamental de este laboratorio es la síntesis de múltiples conceptos avanzados de programación en un proyecto funcional y coherente.

## Empezando

Estas instrucciones te permitirán obtener una copia del proyecto y ejecutarlo en tu máquina local con fines de desarrollo y pruebas. Consulta la sección de implementación para obtener notas sobre cómo desplegar el proyecto en un sistema en vivo.

### Prerequisitos

¿Qué cosas necesitas instalar para el software?

1. Java Development Kit (JDK): Debes tener instalado el JDK en tu sistema. El JDK incluye el compilador de Java (javac) y las bibliotecas necesarias para desarrollar y ejecutar aplicaciones en Java. Puedes descargar el JDK desde el sitio web oficial de Oracle o utilizar una distribución de OpenJDK.

2. Entorno de desarrollo integrado (IDE) o Editor de texto: Aunque no es estrictamente necesario, es útil tener un entorno de desarrollo integrado como Eclipse, IntelliJ IDEA o NetBeans para escribir, compilar y depurar tus programas de Java. También puedes usar un editor de texto simple como Notepad++ o Visual Studio Code.

3. Configuración del entorno (PATH y CLASSPATH): Debes configurar las variables de entorno PATH y CLASSPATH para que el sistema pueda encontrar las herramientas y bibliotecas de Java. Esto suele hacerse automáticamente durante la instalación del JDK, pero es importante verificar que estén configuradas correctamente.

4. Sistema operativo compatible: Java es compatible con una amplia variedad de sistemas operativos, incluyendo Windows, macOS y varias distribuciones de Linux. Asegúrate de que tu sistema operativo sea compatible con la versión de JDK que estás utilizando.

5. Conexión a Internet (opcional): Si estás utilizando una IDE, es posible que necesites una conexión a Internet para descargar bibliotecas adicionales o actualizaciones.

6. Conocimiento de Java: Por supuesto, debes conocer el lenguaje de programación Java y saber cómo escribir código Java. Esto incluye comprender la sintaxis de Java, la estructura de clases y métodos, y los conceptos fundamentales de programación orientada a objetos.

7. Código fuente o archivo JAR: Debes tener el código fuente de tu programa Java o un archivo JAR compilado que contenga tu programa listo para ser ejecutado.

8. Conocimientos basicos en linea de comando (CMD) de tu computadora.

En este caso, el codigo fuente lo encuentas en esta REPOSITORIO GITHUB.

### Instalación

Una serie de pasos a seguir para configurar un entorno de desarrollo.

Primer Paso (Donde encontramos dos opciones)

- Primera Opcion: Fork del repositorio: En lugar de clonar directamente el repositorio original, crea un "fork" (una copia) del repositorio en tu cuenta de GitHub. Esto se hace haciendo clic en el botón "Fork" en la parte superior derecha de la página del repositorio original en GitHub. Esto creará una copia del repositorio en tu cuenta de GitHub.
- Segunda Opcion: Descarga el ZIP de este repositorio.

Segundo Paso

- Abre el proyecto (Carpeta donde se encuentra el proyecto) en tu IDLE preferido. En este ejemplo de Instalacion lo haremos en NETBEANS.
![image](https://github.com/danielsperezb/AREP-LAB-4/assets/101849347/09931f93-aa90-4d81-bcb6-df2c62194d30)

- Vamos a la clase MyApp.java

Tercer Paso  (Donde encontramos dos opciones)

- Primera Opcion: Arrancarlo directamente desde MyApp.java:

  ![image](https://github.com/danielsperezb/AREP-LAB-4/assets/101849347/7aca8c4b-79a1-45e2-8363-6b232901f9f5)

- Segunda Opcion: Arrancarlo con cmd:
  a) Clic derecho en la carpeta donde esta el proyecto: Opcion -> Abrir en Terminal
  ![image](https://github.com/danielsperezb/AREP-LAB-4/assets/101849347/d4b27a18-1153-4b9d-ba6b-c344cfd1b9bd)
  b) mvn package
  ![image](https://github.com/danielsperezb/AREP-LAB-4/assets/101849347/e5957ce3-f31e-4fc0-8ad6-9b24eed94f5c)

  c) mvn compile (Opcional)
  ![image](https://github.com/danielsperezb/AREP-LAB-4/assets/101849347/134c00e5-43a9-4195-859c-0b209968710a)

  d)  Pon lo siguiente:   java -cp target/Taller4AREP-1.0-SNAPSHOT.jar edu.escuelaing.app.MyApp
  ![image](https://github.com/danielsperezb/AREP-LAB-4/assets/101849347/e9eb47f9-64a0-41a4-a16f-b341ee257307)
  Asegurate tener el puerto 35000 abierto, sino puedes despegarlo puedes cambiarlo (HTTP Server, ultimo atributo, llamado PORT):
  ![image](https://github.com/danielsperezb/AREP-LAB-4/assets/101849347/2a1e48dd-99e9-4fe8-9f59-61305ca9735a)
  Cuando funcione:
  ![image](https://github.com/danielsperezb/AREP-LAB-4/assets/101849347/cf1a64cf-30d5-4d62-9f05-a62a2220a4d9)

  e) Abre el siguiente link: http://localhost:35000/, puede ser en el navegador FIREFOX

  ![image](https://github.com/danielsperezb/AREP-LAB-4/assets/101849347/120de0d7-617e-435c-82f4-164f02f9c5bd)

  f) Y estariamos listos para hacer las pruebas correspondientes.

## Ejecución de las pruebas


### Desglose de pruebas de extremo a extremo



#### Pruebas con fundamentos de finalización

1. Archivo HTML



2. Archivo CSS


3. Archivo JS


4. Archivo PNG


5. Archivo JPG



## Implementación

1. 

## Construido con

- [Maven](https://maven.apache.org/) - Administración de dependencias
- [README](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2) - Creé este README basado en la plantilla de https://gist.github.com/PurpleBooth.

## Autores

- **Daniel Esteban Perez Bohorquez**

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE.md](LICENSE.md) para obtener más detalles.

## Agradecimientos

- Escuela Colombiana de Ingeniería
