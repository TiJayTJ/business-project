package ru.spbu.project.models;

/**
 * Класс сущности сотрудника
 */
public class Employee {
  private Integer id;
  private String name;
  private String surname;
  private String patronymic;
  private String jobTitle;
  private String project;
  private String target;
  private Leader leader;
  private Practice practice;
  private Stage stage;

  public Stage getStage() {
    return stage;
  }

  public void setStage(Stage stage) {
    this.stage = stage;
  }
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

  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public Leader getLeader() {
    return leader;
  }

  public void setLeader(Leader leader) {
    this.leader = leader;
  }

  public Practice getPractice() {
    return practice;
  }

  public void setPractice(Practice practice) {
    this.practice = practice;
  }
}
