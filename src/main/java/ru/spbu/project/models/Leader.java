package ru.spbu.project.models;

import java.util.List;

/**
 * Класс сущности руководителя
 */
public class Leader {
  private Integer id;
  private String name;
  private String surname;
  private String patronymic;
  private String jobTitle;
  private List<String> project;
  private List<Employee> employees;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public List<String> getProject() {
    return project;
  }

  public void setProject(List<String> project) {
    this.project = project;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }
}
