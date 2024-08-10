package Problem_IV;

public class EditTask implements Command {
    private TaskManager taskManager;
    private Task oldTask;
    private Task newTask;

    public EditTask(TaskManager taskManager, Task oldTask, Task newTask) {
        this.taskManager = taskManager;
        this.oldTask = oldTask;
        this.newTask = newTask;
    }

    @Override
    public void execute() {
        taskManager.editTask(oldTask, newTask);
    }

    @Override
    public void undo() {
        taskManager.editTask(newTask, oldTask);
    }
}
