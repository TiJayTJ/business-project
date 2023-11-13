package ru.spbu.project.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.spbu.project.enums.TestType;

/**
 * Класс сущности теста
 */
@Entity
@Table(name = "tests")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "employee_id")
  private Long employeeId;

  @Column(name = "test_type")
  private TestType testType;

  @Column(name = "score_percent")
  private double scorePercent;
}
