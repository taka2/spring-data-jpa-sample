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
        Task task = new Task();
        task.setId(1L);
        Task savedTask = taskRepository.save(task);
        System.out.println(savedTask);
    }
}