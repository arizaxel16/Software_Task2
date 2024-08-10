package Problem_IV;

public class App {
    public static void main(String[] args) {
        ServiceManager serviceManager = new ServiceManager();

        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");

        System.out.println("Testing Task Creation:");
        serviceManager.createTask(task1);
        serviceManager.createTask(task2);
        
        System.out.println("\nTesting Task Editing:");
        Task updatedTask1 = new Task("Updated Task 1");
        serviceManager.editTask(task1, updatedTask1);
        
        System.out.println("\nTesting Task Completion:");
        serviceManager.completeTask(updatedTask1);

        System.out.println("\nTesting Task Deletion:");
        serviceManager.deleteTask(task2);
        
        System.out.println("\nTesting Undo Functionality:");
        serviceManager.undoLastAction();
        serviceManager.undoLastAction();
        serviceManager.undoLastAction();
        serviceManager.undoLastAction();
    }
}
