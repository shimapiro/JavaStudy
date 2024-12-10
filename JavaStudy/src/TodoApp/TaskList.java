package TodoApp;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
	private List<Task> tasks;

	public TaskList() {
		tasks = new ArrayList<Task>();
	}

	public void addTask(String description) {
		Task task = new Task(description);
		tasks.add(task);
		System.out.println("タスクを追加しました" + description);
	}

	public void displayTasks() {
		if (tasks.isEmpty()) {
			System.out.println("タスクはありません！");
			return;
		}
		System.out.println("現在のタスク一覧");
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + ":" + tasks.get(i).getDescription());
		}
	}

}
