package ru.spbu.project.models;

/**
 * Класс сущности производственной практики
 */
public class Practice {
  private Integer id;
  private String project;
  private Leader leader;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public Leader getLeader() {
    return leader;
  }

  public void setLeader(Leader leader) {
    this.leader = leader;
  }
}
