package Problem_IV;

public class NewTask implements Command {
    private TaskManager taskManager;
    private Task task;

    public NewTask(TaskManager taskManager, Task task) {
        this.taskManager = taskManager;
        this.task = task;
    }

    @Override
    public void execute() {
        taskManager.createTask(task);
    }

    @Override
    public void undo() {
        taskManager.deleteTask(task);
    }
}
