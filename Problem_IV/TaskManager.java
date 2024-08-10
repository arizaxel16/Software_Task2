package Problem_IV;

public class TaskManager {
    public void createTask(Task task) {
        System.out.println("Task created: " + task.getDescription());
    }

    public void deleteTask(Task task) {
        System.out.println("Task deleted: " + task.getDescription());
    }

    public void editTask(Task oldTask, Task newTask) {
        System.out.println("Task edited\nPrevious Task: " + oldTask.getDescription() + "\nNew Task: " + newTask.getDescription());
    }

    public void completeTask(Task task) {
        System.out.println("Task completed: " + task.getDescription());
    }

    public void uncompleteTask(Task task) {
        System.out.println("Task pending: " + task.getDescription());
    }
}
