package gov.hospital.Services;

import gov.hospital.Models.HospitalDatabase;
import gov.hospital.Repository.HospitalRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImplementation implements HospitalServices{
    @Autowired
    private HospitalRepo hospitalRepo;

    public HospitalServiceImplementation(HospitalRepo hospitalRepo) {
        this.hospitalRepo = hospitalRepo;
    }
    @Override
    public HospitalDatabase savePatientData(HospitalDatabase hospitalDatabase)
    {
        return hospitalRepo.save(hospitalDatabase);
    }
    @Override
    public List<HospitalDatabase> getAllPatientsData()
    {
        return hospitalRepo.findAll();
    }
    @Override
    public HospitalDatabase getPatientDataById(int id) 
    {
        HospitalDatabase hD = null ;
        try
        {
            hD = hospitalRepo.findById(id).orElseThrow(Exception::new);
        }
        catch(Exception e) {}
        return hD ;
    }
    @Override
    public HospitalDatabase updatePatientData(HospitalDatabase hospitalDatabase,int id)
    {
        HospitalDatabase currentPatientData = null ;
        try{
            currentPatientData = hospitalRepo.findById(id).orElseThrow(Exception::new);
           }
        catch(Exception e) {}
        currentPatientData.setPatientName(hospitalDatabase.getPatientName());
        currentPatientData.setGender(hospitalDatabase.getGender());
        currentPatientData.setAge(hospitalDatabase.getAge());
        hospitalRepo.save(currentPatientData);
        return currentPatientData;
    }
    @Override
    public void deletePatientInfo(int id)
    {
        try
        {
            hospitalRepo.findById(id).orElseThrow(Exception::new);
        }
        catch(Exception e){}
        hospitalRepo.deleteById(id);
    }
}