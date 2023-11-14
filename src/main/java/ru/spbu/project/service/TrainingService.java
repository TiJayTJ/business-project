package ru.spbu.project.service;


import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import ru.spbu.project.models.Employee;
import ru.spbu.project.models.Leader;
import ru.spbu.project.models.Practice;
import ru.spbu.project.enums.Stage;
import ru.spbu.project.models.Test;

/**
 * Интерфейс сервиса клиента.
 */
public interface TrainingService {

  /**
   * Подача заявки на обучение сотрудника руководителем.
   *
   * @param leader   руководитель, подающий заявку
   * @param employee сотрудник, идущий на обучение
   * @return успешно внесены изменения или нет
   */
  boolean applyForTraining(Leader leader, Employee employee);

  /**
   * Подтверждение согласия сотрудника на обучение.
   *
   * @param employee сотрудник, принимающий решение
   * @param answer   согласен сотрудник на обучение, или нет
   * @return успешно внесены изменения или нет
   */
  boolean acceptTraining(Employee employee, Boolean answer);

  /**
   * Входное тестирование.
   *
   * @param employee кто проходит тестирование
   * @param test     проходимый тест
   * @return успешно внесены изменения или нет
   */
  boolean entryTest(Employee employee, Test test);

  /**
   * Прохождение модуля сотрудником.
   *
   * @param employee     сотрудник, проходящий модуль
   * @param moduleNumber номер модуля
   * @param moduleTest   тест для данного модуля
   * @return успешно внесены изменения или нет
   */
  boolean moduleCompletion(Employee employee, int moduleNumber, Test moduleTest);

  /**
   * Прохождение практического задания сотрудником.
   *
   * @param employee           сотрудник, проходящий задание
   * @param practiceTaskNumber номер задания
   * @param practiceTask       объект теста для данного задания
   * @return успешно внесены изменения или нет
   */
  boolean practiceTaskCompletion(Employee employee, int practiceTaskNumber, Test practiceTask);

  /**
   * Направление сотрудника на производственную практику.
   *
   * @param employee сотрудник, направляемый на практику
   * @param practice объект практики, на которую направляется сотрудник
   * @return успешно внесены изменения или нет
   */
  boolean sendEmployeeOnInternship(Employee employee, Practice practice);

  /**
   * Подтверждение направления на практику сотрудником.
   *
   * @param employee сотрудник, отправляющийся на практику
   * @return успешно внесены изменения или нет
   */
  boolean acceptEmployeeOnInternship(Employee employee);

  /**
   * Экзаменация сотрудника.
   *
   * @param employee   сотрудник, проходяший экзамен
   * @param examResult результат экзамена
   * @return успешно внесены изменения или нет
   */
  boolean examineEmployee(Employee employee, Boolean examResult);

  /**
   * Получение списка участников процесса, находящихся на определённом этапе.
   *
   * @param stage этап, для которого вывести информацию
   * @return список сотрудников, находящихся на этапе stage
   */
  List<Employee> readAllAtCurrentStage(Stage stage);

  /**
   * Получение обучающегося по ФИО, отобразить статус прохождения обучения.
   *
   * @param surname    фамилия
   * @param firstName  имя
   * @param patronymic отчество
   * @return список сотрудников с данными ФИО
   */
  List<Employee> readByName(String surname, String firstName, String patronymic);

  /**
   * Статистический метод, подсчитывающий, сколько человек, из зашедших в обучение в определённое
   * время (например, за месяц), завершили обучение на каком этапе и с каким результатом.
   *
   * @param startTimestamp начальное время
   * @param endTimestamp   конечное время
   * @return хеш-мапа с парами "этап обучения" - "количество сотрудников, находящихся на данном
   * этапе"
   */
  HashMap<Stage, Integer> countPeriod(long startTimestamp, long endTimestamp);

}
