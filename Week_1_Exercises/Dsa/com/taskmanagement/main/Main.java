package com.taskmanagement.main;

import com.taskmanagement.model.Task;
import com.taskmanagement.linkedlist.TaskLinkedList;

public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Adding tasks
        taskList.addTask(new Task("T001", "Design System Architecture", "In Progress"));
        taskList.addTask(new Task("T002", "Develop User Interface", "Not Started"));
        taskList.addTask(new Task("T003", "Database Setup", "Completed"));

        // Display all tasks
        System.out.println("Task List:");
        taskList.traverseTasks();

        // Search for a task
        Task task = taskList.searchTask("T002");
        System.out.println("Search Result: " + (task != null ? task : "Task not found"));

        // Delete a task
        taskList.deleteTask("T002");

        // Display all tasks after deletion
        System.out.println("Task List After Deletion:");
        taskList.traverseTasks();
    }
}
