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
    
    public void complete(String name) {
    	tasks.forEach(task -> {
    		if(task.compareName(name))
    			task.complete();
    	});
    }
    
    public void edit(String name,String newName) {
    	tasks.forEach(task -> {
    		if(task.compareName(name))
    			task.setName(newName);
    	});
    }
	
    
    public void remove(String name) {
    	tasks.removeIf(task -> task.getName().equals(name));
    }
}
