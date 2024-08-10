package Problem_IV;

public class TaskManager {
    public void createTask(Task task) {
        System.out.println("Task created: " + task);
    }

    public void deleteTask(Task task) {
        System.out.println("Task deleted: " + task);
    }

    public void editTask(Task oldTask, Task newTask) {
        System.out.println("Task edited\n Previous Task: " + oldTask + "\nNew Task: " + newTask);
    }

    public void completeTask(Task task) {
        System.out.println("Task completed: " + task);
    }

    public void uncompleteTask(Task task) {
        System.out.println("Task pending: " + task);
    }
}
