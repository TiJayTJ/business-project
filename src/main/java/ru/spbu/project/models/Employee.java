package ru.spbu.project.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.spbu.project.enums.Stage;

/**
 * Класс сущности сотрудника
 */
@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String surname;
  private String patronymic;

  @Column(name = "job_title")
  private String jobTitle;
  private String project;

  @Column(name = "training_purpose")
  private String trainingPurpose;
  private Stage stage;

  @Column(name = "leader_id")
  private Long leaderId;

  @Column(name = "is_examined")
  private Boolean isExamined;
}
