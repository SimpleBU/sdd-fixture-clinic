package ru.testbed.clinic.dto;

import java.time.LocalDate;

/** Сгенерировано из manifest.yaml — не править руками. */
public class LabResultDto {

    private Long id;
    private Long patientId;
    private String testCode;
    private String value;
    private String unit;
    private String referenceRange;
    private String hivStatus;
    private LocalDate resultDate;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getPatientId() { return patientId; }
    public void setPatientId(Long patientId) { this.patientId = patientId; }
    public String getTestCode() { return testCode; }
    public void setTestCode(String testCode) { this.testCode = testCode; }
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }
    public String getReferenceRange() { return referenceRange; }
    public void setReferenceRange(String referenceRange) { this.referenceRange = referenceRange; }
    public String getHivStatus() { return hivStatus; }
    public void setHivStatus(String hivStatus) { this.hivStatus = hivStatus; }
    public LocalDate getResultDate() { return resultDate; }
    public void setResultDate(LocalDate resultDate) { this.resultDate = resultDate; }
}
