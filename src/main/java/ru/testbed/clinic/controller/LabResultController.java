package ru.testbed.clinic.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.clinic.dto.LabResultDto;

/** Результаты анализов. Ни путь, ни класс не подсказывают HEALTH. */
@RestController
@RequestMapping("/api/lab-results")
public class LabResultController {

    @GetMapping("/{resultId}")
    public ResponseEntity<LabResultDto> getLabResult(@PathVariable("resultId") Long resultId) {
        return ResponseEntity.ok(new LabResultDto());
    }

    @GetMapping("/export")
    public ResponseEntity<List<LabResultDto>> exportLabResults(
            @RequestParam(name = "from", required = false) LocalDate from,
            @RequestParam(name = "to", required = false) LocalDate to) {
        return ResponseEntity.ok(List.of());
    }

}
