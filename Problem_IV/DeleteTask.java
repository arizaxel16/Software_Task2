package Problem_IV;

public class DeleteTask implements Command {
    private TaskManager taskManager;
    private Task task;

    public DeleteTask(TaskManager taskManager, Task task) {
        this.taskManager = taskManager;
        this.task = task;
    }

    @Override
    public void execute() {
        taskManager.deleteTask(task);
    }

    @Override
    public void undo() {
        taskManager.createTask(task);
    }
}
