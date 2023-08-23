package com.example.demo.Controller;

import com.example.demo.Model.Task;
import com.example.demo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    //para poder usar el método findAll y traerme el repositorio, tengo que usar @Autowired para crear una instancia del mismo
    @Autowired
    private TaskRepository todoRepository;

    //devuelve todas las tareas guardadas
    @GetMapping(value="/tasks")
    public List<Task> getTasks(){
        return todoRepository.findAll();
    }

    //guarda una nueva tarea
    @PostMapping(value="/savetask")
    public String saveTasks(@RequestBody Task task){
        todoRepository.save(task);
        return "Saved task";
    }

    //elimina TODAS las tareas
    @DeleteMapping("/deleteTasks")
    public void deleteTasks(){
        todoRepository.deleteAll();
    }

    //elimina una tarea en específico
    @DeleteMapping("/deleteTask/{id}")
    public void deleteTask(@PathVariable Long id){
        todoRepository.deleteById(id);
    }

    //modifica una tarea ya existente
    @PutMapping("/update/{id}")
    public void updateTask(@RequestBody Task updateTask,@PathVariable Long id){
        //me traigo del repositorio la antigua tarea
        Task oldTask = todoRepository.findById(id).get();

        //le actualizo las propiedades
        oldTask.setNombre(updateTask.getNombre());
        oldTask.setDescripcion(updateTask.getDescripcion());

        //la vuelvo a guardar en el repositorio
        todoRepository.save(updateTask);
    }

}
