package ru.spbu.project.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Класс сущности руководителя
 */
@Entity
@Table(name = "leaders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leader {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String surname;
  private String patronymic;

  @Column(name = "job_title")
  private String jobTitle;
}
