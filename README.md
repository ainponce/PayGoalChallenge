# PayGoalChallenge

Este proyecto es parte del Challenge Java Backend para PayGoal.

## Instrucciones para Configuración y Ejecución

### Importar la Base de Datos

1. Asegúrate de tener un servidor de base de datos MySQL en ejecución.
2. Accede a la carpeta `db` en tu terminal o línea de comandos.
3. Importa la base de datos ejecutando el siguiente comando:

    ```bash
    mysql -u tu_usuario -p tu_base_de_datos < paygoal_challenge.sql
    ```

   Asegúrate de reemplazar `tu_usuario` y `tu_base_de_datos` con las credenciales de tu base de datos.

### Importar las Requests de Postman

1. Instala [Postman](https://www.postman.com/) si aún no lo has hecho.
2. Abre Postman.
3. Importa las solicitudes (requests) que se encuentran en la carpeta "request postman".
   - En Postman, ve a "File" -> "Import" -> "Folder" y selecciona la carpeta "request postman".

### Ejecutar el Programa

1. Asegúrate de tener Java y Maven instalados.
2. Abre una terminal o línea de comandos y navega hasta el directorio del proyecto.
3. Ejecuta la aplicación Spring Boot desde su IDE de preferencia.
4. La aplicación estará disponible en [http://localhost:8080](http://localhost:8080).

## Endpoints Disponibles

- `/api/productos/crearProducto`: Crea un producto.
- `/api/productos/eliminarProducto/{id}`: Elimina un producto existente.
- `/api/productos/actualizarProducto`: Actualizar un producto existente.
- `/api/productos/obtenerProducto/{idOrName}`: Obtener un producto por ID o nombre.
- `/api/productos/ordenarPorPrecio`: Muestra todos los productos ordenados por precio.
