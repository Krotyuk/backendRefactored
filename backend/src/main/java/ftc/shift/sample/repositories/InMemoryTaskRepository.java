package ftc.shift.sample.repositories;

import ftc.shift.sample.models.Task;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Реализиция, хранящая все данные в памяти приложения
 */
@Repository
public class InMemoryTaskRepository implements TaskRepository {

  private Map<String, Task> taskCache = new HashMap<>();

  public InMemoryTaskRepository() {
    taskCache.put("1", new Task("1","3","Перенести бабушку","С пятого на первый этаж!","05.05.2005", "true", "45"));
    taskCache.put("2", new Task());
  }


  @Override
  public Task fetchTask(final String id) {
    return taskCache.get(id);
  }

  @Override
  public Task updateTask(final Task task) {
    taskCache.put(task.getTaskId(), task);
    return task;
  }

  @Override
  public void deleteTask(final String id) {
    taskCache.remove(id);
  }

  @Override
  public Task createTask(final Task task) {
    task.setTaskId(String.valueOf(System.currentTimeMillis()));  //очень плохой способ генерировать Id, тут только для примера
    taskCache.put(task.getTaskId(), task);
    return task;
  }

  @Override
  public Collection<Task> getAllTasks() {
    return taskCache.values();
  }

}
