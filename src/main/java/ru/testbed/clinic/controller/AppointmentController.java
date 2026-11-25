package ru.testbed.clinic.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.clinic.dto.AppointmentDto;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @GetMapping
    public ResponseEntity<List<AppointmentDto>> listAppointments(
            @RequestParam(name = "doctorId", required = false) Long doctorId,
            @RequestParam(name = "date", required = false) LocalDate date) {
        return ResponseEntity.ok(List.of());
    }

    @PostMapping
    public ResponseEntity<AppointmentDto> bookAppointment(@RequestBody AppointmentDto appointment) {
        return ResponseEntity.ok(new AppointmentDto());
    }

}
