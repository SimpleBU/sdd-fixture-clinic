package ru.testbed.clinic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.testbed.clinic.dto.ChargeStatusDto;

/** Ловушка: заряд батареи медоборудования (charge), а не платёж. */
@RestController
@RequestMapping("/api/equipment")
public class EquipmentController {

    @GetMapping("/{equipmentId}/charge")
    public ResponseEntity<ChargeStatusDto> getChargeStatus(@PathVariable("equipmentId") Long equipmentId) {
        return ResponseEntity.ok(new ChargeStatusDto());
    }

}
