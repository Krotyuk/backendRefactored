package ftc.shift.sample.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Lombok (https://projectlombok.org/) инструмент, позволяющий не писать геттеры-сеттеры, конструкторы и тд. Они генерируются автоматом.
 * Его использование не является обязательным, но во многих ситуациях заметно упрощает разработку.
 * Так же его использование не отменяет осознанного подхода к инкапсуляции, а именно необходимости открывать доступ к полям (геттеры-сеттеры).
 * Для dto-классов обычно это не распространяется, т.к. они требуют наличия этих методов, а так же equals/hashCode и конструктора
 */

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Task implements Serializable{

    private String taskId;
    private String userId; //Демо. Потом будет получаться из другого источника
    private String title;
    private String description;
    private String date;
    private String status;
    private String selectedApplyId;
    //private Integer pages;
    //private Boolean isAvailable;

}
