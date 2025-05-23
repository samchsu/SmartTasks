package com.smarttask.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.smarttask.demo.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}