package com.smarttask.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smarttask.demo.dto.TaskRequest;
import com.smarttask.demo.model.Task;
import com.smarttask.demo.repository.TaskRepository;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private final OpenAIService openAIService;

    public TaskService(TaskRepository taskRepository, OpenAIService openAIService) {
        this.taskRepository = taskRepository;
		this.openAIService = openAIService;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

	public void deleteTask(Long id) {
    	taskRepository.deleteById(id);
	}

	public List<Task> parseAndSave(TaskRequest request) {
		String input = openAIService.getActionableTasks(request.getInput());

		// Parse input (split by line and remove numbering)
		// Task task = new Task();
		// task.setDescription(mockExtractDescription(input));
		// task.setDueDate(mockExtractDueDate(input));

		// return taskRepository.save(task);

		String[] lines = input.split("\n");
		List<Task> savedTasks = new ArrayList<>();

		for (String line : lines) {
			line = line.trim();
            if (line.isEmpty()) continue;

            // Remove numbering like "1. " or "- "
            line = line.replaceAll("^\\d+\\.\\s*", "").replaceAll("^-\\s*", "");

            Task task = new Task();
            task.setDescription(line);
            savedTasks.add(taskRepository.save(task));
		}

		return savedTasks;
	}

	// private String mockExtractDescription(String input) {
	// 	if (input.contains("by")) {
	// 		return input.split("by")[0].trim();
	// 	}
	// 	return input;
	// }

	// private LocalDateTime mockExtractDueDate(String input) {
	// 	// TODO: replace with real NLP/OpenAI parsing
	// 	return LocalDateTime.now().plusDays(1);
	// }
}