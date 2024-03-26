package br.com.mariojp.easytask;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }
	
    
    public void add(Task task) {
    	tasks.add(task);
    }
	
    
    public List<Task> list() {
    	return tasks;
    }
    
    public void complete(Task task) {
    	tasks.get(tasks.indexOf(task)).complete();
    }
	
    
    public void remove(String name) {
    	tasks.removeIf(task -> task.getName().equals(name));
    }
    
    public void remove(Task task) {
    	remove(task.getName());
    }
}
