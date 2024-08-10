package Problem_IV;

public class CompleteTask implements Command {
    private TaskManager taskManager;
    private Task task;

    public CompleteTask(TaskManager taskManager, Task task) {
        this.taskManager = taskManager;
        this.task = task;
    }

    @Override
    public void execute() {
        taskManager.completeTask(task);
    }

    @Override
    public void undo() {
        taskManager.uncompleteTask(task);
    }
}
