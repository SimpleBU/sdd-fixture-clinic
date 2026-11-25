package ru.testbed.clinic.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.clinic.dto.MedicalRecordDto;

@RestController
@RequestMapping("/api/patients/{patientId}/records")
public class MedicalRecordController {

    @GetMapping
    public ResponseEntity<List<MedicalRecordDto>> listRecords(@PathVariable("patientId") Long patientId) {
        return ResponseEntity.ok(List.of());
    }

    @PostMapping
    public ResponseEntity<MedicalRecordDto> addRecord(
            @PathVariable("patientId") Long patientId,
            @RequestBody MedicalRecordDto record) {
        return ResponseEntity.ok(new MedicalRecordDto());
    }

}
