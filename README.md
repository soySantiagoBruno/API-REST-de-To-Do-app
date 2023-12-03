# API-REST de una To-Do app
Creación del backend de una API Rest en Java usando Spring Boot. La api es capaz de realizar un CRUD sobre una base de datos (en este caso levantanda en MySQL).

Se hizo uso de los diferentes métodos HTTP como GET, POST, PUT y DELETE.

Para realizar las pruebas a la API, se hizo uso de Postman.

Endpoints desarrollados:
- `/tasks` devuelve todas las tareas guardadas
- `/saveTask` recibe un objeto tarea (JSON) en el body. El formato del JSON es el siguiente: { "nombre":"tarea uno", "descripcion":"descripcion uno"}
- `/deleteTasks` Elimina todas las tareas guardadas
  -`/deleteTask/{id}` Elimina una tarea a partir de su id
- `/update/{id}` Modifica una tarea existente. Se debe pasar una nueva tarea (en formato JSON) en el body.