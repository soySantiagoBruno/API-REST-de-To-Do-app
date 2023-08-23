package com.example.demo.Repository;

import com.example.demo.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//notar que especifico el tipo de elementos a almacenar (Task) como el tipo de dato que va a tener el ID (Long)
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
