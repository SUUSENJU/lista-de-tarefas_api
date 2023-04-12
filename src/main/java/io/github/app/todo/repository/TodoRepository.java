package io.github.app.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.app.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	
}
