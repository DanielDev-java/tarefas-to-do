package com.dev.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.backend.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
