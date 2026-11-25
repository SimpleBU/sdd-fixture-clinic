package ru.testbed.clinic.dto;

import java.time.LocalDate;

/** Сгенерировано из manifest.yaml — не править руками. */
public class ChargeStatusDto {

    private Integer level;
    private Boolean charging;
    private LocalDate lastServiceDate;

    public Integer getLevel() { return level; }
    public void setLevel(Integer level) { this.level = level; }
    public Boolean getCharging() { return charging; }
    public void setCharging(Boolean charging) { this.charging = charging; }
    public LocalDate getLastServiceDate() { return lastServiceDate; }
    public void setLastServiceDate(LocalDate lastServiceDate) { this.lastServiceDate = lastServiceDate; }
}
