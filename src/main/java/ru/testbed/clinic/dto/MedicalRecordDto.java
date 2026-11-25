package ru.testbed.clinic.dto;

import java.time.Instant;
import java.util.List;

/** Сгенерировано из manifest.yaml — не править руками. */
public class MedicalRecordDto {

    private Long id;
    private Long patientId;
    private String diagnosis;
    private String icd10Code;
    private String anamnesis;
    private List<PrescriptionDto> prescriptions;
    private String doctorNotes;
    private String attendingPhysician;
    private String createdBy;
    private String historyLog;
    private Instant createdAt;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getPatientId() { return patientId; }
    public void setPatientId(Long patientId) { this.patientId = patientId; }
    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    public String getIcd10Code() { return icd10Code; }
    public void setIcd10Code(String icd10Code) { this.icd10Code = icd10Code; }
    public String getAnamnesis() { return anamnesis; }
    public void setAnamnesis(String anamnesis) { this.anamnesis = anamnesis; }
    public List<PrescriptionDto> getPrescriptions() { return prescriptions; }
    public void setPrescriptions(List<PrescriptionDto> prescriptions) { this.prescriptions = prescriptions; }
    public String getDoctorNotes() { return doctorNotes; }
    public void setDoctorNotes(String doctorNotes) { this.doctorNotes = doctorNotes; }
    public String getAttendingPhysician() { return attendingPhysician; }
    public void setAttendingPhysician(String attendingPhysician) { this.attendingPhysician = attendingPhysician; }
    public String getCreatedBy() { return createdBy; }
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }
    public String getHistoryLog() { return historyLog; }
    public void setHistoryLog(String historyLog) { this.historyLog = historyLog; }
    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
