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
  private String practiceProject;
  private String target;
  private Leader leader;
  private Leader practiceLeader;

  public Leader getPracticeLeader() {
    return practiceLeader;
  }

  public void setPracticeLeader(Leader practiceLeader) {
    this.practiceLeader = practiceLeader;
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

  public String getPracticeProject() {
    return practiceProject;
  }

  public void setPracticeProject(String practiceProject) {
    this.practiceProject = practiceProject;
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
}
