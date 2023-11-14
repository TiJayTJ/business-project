package ru.spbu.project.service;

import org.springframework.stereotype.Service;
import ru.spbu.project.enums.Stage;
import ru.spbu.project.models.Employee;
import ru.spbu.project.models.Leader;
import ru.spbu.project.models.Practice;
import ru.spbu.project.models.Test;

import java.util.HashMap;
import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {


    @Override
    public boolean applyForTraining(Leader leader, Employee employee) {
        // TODO: 14.11.2023
        return false;
    }

    @Override
    public boolean acceptTraining(Employee employee, Boolean answer) {
        // TODO: 14.11.2023
        return false;
    }

    @Override
    public boolean entryTest(Employee employee, Test test) {
        // TODO: 14.11.2023
        return false;
    }

    @Override
    public boolean moduleCompletion(Employee employee, int moduleNumber, Test moduleTest) {
        // TODO: 14.11.2023
        return false;
    }

    @Override
    public boolean practiceTaskCompletion(Employee employee, int practiceTaskNumber, Test practiceTask) {
        // TODO: 14.11.2023
        return false;
    }

    @Override
    public boolean sendEmployeeOnInternship(Employee employee, Practice practice) {
        // TODO: 14.11.2023
        return false;
    }

    @Override
    public boolean acceptEmployeeOnInternship(Employee employee) {
        // TODO: 14.11.2023
        return false;
    }

    @Override
    public boolean examineEmployee(Employee employee, Boolean examResult) {
        // TODO: 14.11.2023
        return false;
    }

    @Override
    public List<Employee> readAllAtCurrentStage(Stage stage) {
        // TODO: 14.11.2023
        return null;
    }

    @Override
    public List<Employee> readByName(String surname, String firstName, String patronymic) {
        // TODO: 14.11.2023
        return null;
    }

    @Override
    public HashMap<Stage, Integer> countPeriod(long startTimestamp, long endTimestamp) {
        // TODO: 14.11.2023
        return null;
    }


}
