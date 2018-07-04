package ftc.shift.sample.api;


import ftc.shift.sample.models.Task;
import ftc.shift.sample.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class TasksController {

  private static final String TASKS_PATH = Resources.API_PREFIX + "tasks";

  @Autowired
  private TaskService service;

  @GetMapping(TASKS_PATH + "/{id}")
  public @ResponseBody
  BaseResponse<Task> readTask(@PathVariable String id) {
    BaseResponse<Task> response = new BaseResponse<>();
    Task task = service.provideTask(id);

    if (null == task) {
      response.setStatus("TASK_NOT_EXIST");  //для статусов  можно сделать отдельные Enum-ы или вынести как строковые константы
      response.setMessage("Книга не найдена!");
    } else {
      response.setData(task);
    }
    return response;
  }

  @GetMapping(TASKS_PATH)
  public @ResponseBody
  BaseResponse<Collection<Task>> listTasks() {
    BaseResponse<Collection<Task>> response = new BaseResponse<>();
    Collection<Task> result = service.provideTasks();
    response.setData(result);
    return response;
  }

  @PostMapping(TASKS_PATH)
  public @ResponseBody
  BaseResponse<Task> createTask(@RequestBody Task task) {
    BaseResponse<Task> response = new BaseResponse<>();
    Task result = service.createTask(task);
    response.setData(result);
    return response;
  }

  @DeleteMapping(TASKS_PATH + "/{id}")
  public @ResponseBody
  BaseResponse deleteTask(@PathVariable String id) {
    service.deleteTask(id);
    return new BaseResponse(); //нет тела, только статус
  }

  @PatchMapping(TASKS_PATH + "/{id}")
  public @ResponseBody
  BaseResponse<Task> updateTask(@PathVariable String id, @RequestBody Task task) {
    BaseResponse<Task> response = new BaseResponse<>();
    Task result = service.updateTask(task);
    response.setData(result);
    return response;
  }

}