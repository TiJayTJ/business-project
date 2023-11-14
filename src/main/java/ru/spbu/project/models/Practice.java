package ru.spbu.project.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс сущности производственной практики
 */
@Entity
@Table(name = "practices")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Practice {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "employee_id")
  private Long employeeId;

  @Column(name = "leader_id")
  private Long leaderId;
  private String project;
}
