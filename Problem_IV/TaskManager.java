package Problem_IV;

public class TaskManager {
    public void createTask(String task) {
        System.out.println("Tarea creada: " + task);
    }

    public void deleteTask(String task) {
        System.out.println("Tarea eliminada: " + task);
    }

    public void editTask(String task, String newContent) {
        System.out.println("Tarea editada, estado previo: " + task + " estado actual: " + newContent);
    }

    public void completeTask(String task) {
        System.out.println("Tarea completada: " + task);
    }

    public void uncompleteTask(String task) {
        System.out.println("Tarea no completadada: " + task);
    }

    public String getTask(String task) {
        return "Contenido anterior de la " + task;
    }
}
