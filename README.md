Proyecto de Colección de Vinilos

Este proyecto fue desarrollado como parte de la Evidencia01 para el curso de Programación Orientada a Objetos.
El objetivo de este proyecto es crear un mantenedor de discos de vinilo para un coleccionista, donde se puedan buscar, agregar y quitar discos.

Descripción General

Este proyecto busca crear un sistema que pueda guardar información de discos de vinilo con toda su información importante, como nombre, autor y año de lanzamiento, así como tambien dar herramientas para buscar un disco en particular, agregar un nuevo disco a la colección o eliminar uno en caso de ser vendido.

Requisitos

-Lenguaje de programación Java
-Uso de la librería Scanner 
-IntelliJ

Instrucciones de Uso

1. Primero se debe ejecutar el archivo java del código, se recomienda utilizar el programa IntelliJ ya que ahí fue donde el código fue escrito y compilado.
2. A continuación, el programa le preguntará cuántos discos desea agregar, a lo que usted debe responder con un número.
3. Luego, debe ingresar el nombre, autor y año de lanzamiento de los discos que va a agregar, uno por uno, hasta agregar todos los discos solicitados.
4. Finalmente, los datos ingresados serán almacenados en la matriz.
5. Posterior a eso, el programa le pedirá el nombre de un disco para que el programa sea capaz de buscarlo. En caso de no existir, el programa le notificará sobre ello.
6. Finalmente, el código finalizará mostrando la capacidad ocupada y la cantidad disponible para almacenar discos.

Descripción de las funciones principales.
El código consta de cuatro funciones principales, las cuales son:
- agregarDisco: Sus parámetros son la matriz y el Scanner. Su función es pedirle al usuario una cantidad de discos que desee agregar y luego ejecuta un bucle en donde el usuario debe escribir toda la información que el programa le pida para poder añadir tal cantidad de discos. Todo esto lo hará mientras existan filas vacías en la matriz, el método se encarga de analizar la existencia de dichas filas antes de ejectuar todas estas acciones. En caso de no haber suficientes, enviará un mensaje al usuario diciendo que no hay espacio disponible para guardar todos los discos.
- buscarVinilo: Sus parametros son la matriz y el Scanner. Este método busca un disco aceptando como parámetro un nombre que el usuario escogió para iniciar la búsqueda, y se recorre toda la matriz en busca de una coincidencia en las filas de la misma. En caso de hallar dicha coincidencia, el método devolverá toda la información almacenada del disco, y en caso de que el nombre ingresado no se encuentre, el programa arrojará un mensaje diciendo que el disco solicitado por el usuario no se encuentra.
- contarColeccion: El único parámetro que necesita es la matriz. Lo que hace es recorrer toda la matriz definida inicialmente en busca de filas que se encuentren llenas con los datos de los discos que el usuario añadió anteriormente. El método inicia con un conteo ''discosRegistrados'' que se define por defecto en 0, y por cada fila de la matriz en donde se encuentre un disco, se sumará a este conteo. Finalmente, este método devuelve el conteo total de filas con información.
- contarDisponible: Sigue la misma lógica que el método anterior, con la diferencia de que el conteo inicial, en este caso ''estaVacio'', aumenta en uno cuando el programa encuentra una fila vacía.

Agradecimientos.
Agradecimientos especiales a mi profesor del curso de Programación Orientada a Objetos por su apoyo y orientación
