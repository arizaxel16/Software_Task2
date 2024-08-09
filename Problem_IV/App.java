package Problem_IV;

public class App
{
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        CommandManager commandManager = new CommandManager();
        ServiceManager taskService = new ServiceManager(commandManager, taskManager);
        taskService.createTask("Tarea 1");
        taskService.editTask("Tarea 1", "Nuevo contenido");
        taskService.undoLastAction();
        taskService.deleteTask("Tarea 1");
        taskService.undoLastAction();
    }
}
