package sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import sample.jpa.TaskRepository;
import sample.model.Task;

public class StartupRunner implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {
        // Generate a new record.
        Task task = new Task();
        task.setTaskName("task1");
        Task savedTask = taskRepository.save(task);
        System.out.println(savedTask);

        Thread.sleep(1000);

        // Update the record after 1sec.
        savedTask.setTaskName("task2");
        Task savedTask2 = taskRepository.save(savedTask);
        System.out.println(savedTask2);
    }
}