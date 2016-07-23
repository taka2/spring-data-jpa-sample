package sample.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
