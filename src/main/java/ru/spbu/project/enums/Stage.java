package ru.spbu.project.enums;

/**
 * Класс ENUM, который отслеживает на какой стадии находится сотрудник
 */
public enum Stage {
  WAITING_APPLICATION_TRAINING,
  REFUSAL_APPLICATION,
  PASSES_ENTRANCE_TEST,
  FAILED_ENTRANCE_TEST,
  STUDYING,
  EXPECTS_PRODUCTION_PRACTICE,
  PRODUCTION_PRACTICE,
  EXAM,
  FAILED_EXAM,
  PASSED_EXAM
}
