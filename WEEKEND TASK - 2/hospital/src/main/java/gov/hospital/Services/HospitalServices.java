package gov.hospital.Services;

import gov.hospital.Models.HospitalDatabase;

import java.util.List;

public interface HospitalServices {
    HospitalDatabase savePatientData(HospitalDatabase hospitalDatabase);
    List<HospitalDatabase> getAllPatientsData();
    HospitalDatabase getPatientDataById(int id);
    HospitalDatabase updatePatientData(HospitalDatabase hospitalDatabase,int id);
    void deletePatientInfo(int id);
}