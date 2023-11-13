package ru.spbu.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.spbu.project.models.Employee;
import ru.spbu.project.models.requests.*;
import ru.spbu.project.service.TrainingService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/training")
public class TrainingController {

    @Autowired
    private TrainingService trainingService;

    @PostMapping("/submitApplication")
    public ResponseEntity<String> submitApplication(@RequestBody TrainingApplicationRequest request) {
        // TODO: 14.11.2023 логика подачи заявления на обучение
        return ResponseEntity.ok("Application submitted successfully");
    }

    @PostMapping("/confirmParticipation/{employeeId}")
    public ResponseEntity<String> confirmParticipation(@PathVariable Long employeeId) {
        // TODO: 14.11.2023 логика подтверждения заявления на обучение
        return ResponseEntity.ok("Participation confirmed successfully");
    }

    @PostMapping("/takeEntranceTest/{employeeId}")
    public ResponseEntity<String> takeEntranceTest(@PathVariable Long employeeId, @RequestBody TestRequest testRequest) {
        // TODO: 14.11.2023 логика прохождения входного теста
        return ResponseEntity.ok("Entrance test completed successfully");
    }

    @PostMapping("/completeModuleTest/{employeeId}")
    public ResponseEntity<String> completeModuleTest(@PathVariable Long employeeId, @RequestBody Integer moduleNumber, @RequestBody TestRequest testRequest) {
        // TODO: 14.11.2023 логика прохождения теста модуля
        return ResponseEntity.ok("Module test completed successfully");
    }

    @PostMapping("/completePracticalAssignment/{employeeId}")
    public ResponseEntity<String> completePracticalAssignment(@PathVariable Long employeeId, @RequestBody PracticalAssignmentRequest assignmentRequest) {
        // TODO: 14.11.2023 логика прохождения практического задания
        return ResponseEntity.ok("Practical assignment completed successfully");
    }

    @PostMapping("/startInternship/{employeeId}")
    public ResponseEntity<String> submitApplicationInternship(@PathVariable Long employeeId, @RequestBody InternshipRequest internshipRequest) {
        // TODO: 14.11.2023 логика подачи заявления для отправки на производственную практику
        return ResponseEntity.ok("Internship application submitted successfully");
    }

    @PostMapping("/confirmParticipation/{employeeId}")
    public ResponseEntity<String> startInternship(@PathVariable Long employeeId) {
        // TODO: 14.11.2023 логика отправки на производственную практику
        return ResponseEntity.ok("Internship started successfully");
    }

    @PostMapping("/takeExam/{employeeId}")
    public ResponseEntity<String> takeExam(@PathVariable Long employeeId) {
        // TODO: 14.11.2023 логика сдачи экзамена
        return ResponseEntity.ok("Exam taken successfully");
    }

    @GetMapping("/participantsByStage")
    public ResponseEntity<List<Employee>> getParticipantsByStage(@RequestBody String stage) {
        // TODO: 14.11.2023 логика получения списка участников, находящихся на определённом этапе
        List<Employee> participants = new ArrayList<>();
        return ResponseEntity.ok(participants);
    }

    @GetMapping("/employeeStatus")
    public ResponseEntity<String> getEmployeeStatus(@RequestParam String employeeName) {
        // TODO: 14.11.2023 логика получения этапа по ФИО
        String status = "Da";
        return ResponseEntity.ok(status);
    }

    @GetMapping("/trainingStatistics")
    public ResponseEntity<HashMap<String, Integer>> getTrainingStatistics(
            @RequestBody DateTimeRequest startDateTime,
            @RequestBody DateTimeRequest endDateTime
    ) {
        // TODO: 14.11.2023 логика получения хешмапы с информацией о том, сколько человек на каком этапе находится
        HashMap<String, Integer> statistics = new HashMap<>();
        return ResponseEntity.ok(statistics);
    }
}

