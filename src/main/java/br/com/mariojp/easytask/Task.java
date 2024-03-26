package br.com.mariojp.easytask;

public class Task {

	private String name;
	
	private boolean isComplete;

	public Task(String name) {
		this.name = name;
		this.isComplete = false;
	}

	public boolean compareName(String name) {
		return this.name.equals(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void complete() {
		isComplete = true;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	@Override
	public String toString() {
		if(isComplete)
			return name + " [Completa]";
		else
			return name + " [Aberta]";
	}
	
}
