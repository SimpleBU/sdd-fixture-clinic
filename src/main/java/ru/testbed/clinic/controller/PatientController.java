package ru.testbed.clinic.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.clinic.dto.PatientDto;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @GetMapping("/{patientId}")
    public ResponseEntity<PatientDto> getPatient(@PathVariable("patientId") Long patientId) {
        return ResponseEntity.ok(new PatientDto());
    }

    @PostMapping
    public ResponseEntity<PatientDto> registerPatient(@RequestBody PatientDto patient) {
        return ResponseEntity.ok(new PatientDto());
    }

    @GetMapping("/search")
    public ResponseEntity<List<PatientDto>> searchPatients(
            @RequestParam(name = "snils", required = false) String snils,
            @RequestParam(name = "fio", required = false) String fio,
            @RequestParam(name = "birthDate", required = false) LocalDate birthDate) {
        return ResponseEntity.ok(List.of());
    }

}
