package Problem_IV;

public class ServiceManager {
    private CommandManager commandManager;
    private TaskManager taskManager;

    public ServiceManager() {
        this.commandManager = new CommandManager();
        this.taskManager = new TaskManager();
    }

    public void createTask(Task task) {
        Command createTask = new NewTask(taskManager, task);
        commandManager.executeCommand(createTask);
    }

    public void editTask(Task oldTask, Task newTask) {
        Command editTask = new EditTask(taskManager, oldTask, newTask);
        commandManager.executeCommand(editTask);
    }

    public void deleteTask(Task task) {
        Command deleteTask = new DeleteTask(taskManager, task);
        commandManager.executeCommand(deleteTask);
    }

    public void completeTask(Task task) {
        Command completeTask = new CompleteTask(taskManager, task);
        commandManager.executeCommand(completeTask);
    }

    public void undoLastAction() {
        commandManager.undoLastCommand();
    }
}
