package ru.spbu.project.models;

/**
 * Класс сущности теста
 */
public class Test {
  private Integer id;
  private Double percent;
  private Boolean[] answer = new Boolean[20];
  private Boolean result;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Double getPercent() {
    return percent;
  }

  public void setPercent(Double percent) {
    this.percent = percent;
  }

  public Boolean[] getAnswer() {
    return answer;
  }

  public void setAnswer(Boolean[] answer) {
    this.answer = answer;
  }

  public Boolean getResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }
}
