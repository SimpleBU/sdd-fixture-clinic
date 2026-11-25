package ru.testbed.clinic.dto;

import java.time.Instant;
import java.time.LocalDate;

/** Сгенерировано из manifest.yaml — не править руками. */
public class PatientDto {

    private Long id;
    private String fullName;
    private String gender;
    private LocalDate birthDate;
    private String snils;
    private String omsPolicy;
    private String bloodType;
    private String allergies;
    private String chronicConditions;
    private String disability;
    private String photo;
    private ContactPerson emergencyContact;
    private Instant registeredAt;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
    public String getSnils() { return snils; }
    public void setSnils(String snils) { this.snils = snils; }
    public String getOmsPolicy() { return omsPolicy; }
    public void setOmsPolicy(String omsPolicy) { this.omsPolicy = omsPolicy; }
    public String getBloodType() { return bloodType; }
    public void setBloodType(String bloodType) { this.bloodType = bloodType; }
    public String getAllergies() { return allergies; }
    public void setAllergies(String allergies) { this.allergies = allergies; }
    public String getChronicConditions() { return chronicConditions; }
    public void setChronicConditions(String chronicConditions) { this.chronicConditions = chronicConditions; }
    public String getDisability() { return disability; }
    public void setDisability(String disability) { this.disability = disability; }
    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }
    public ContactPerson getEmergencyContact() { return emergencyContact; }
    public void setEmergencyContact(ContactPerson emergencyContact) { this.emergencyContact = emergencyContact; }
    public Instant getRegisteredAt() { return registeredAt; }
    public void setRegisteredAt(Instant registeredAt) { this.registeredAt = registeredAt; }
}
