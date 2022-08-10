package gov.hospital.Controllers;

import gov.hospital.Models.HospitalDatabase;
import gov.hospital.Services.HospitalServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hospital")
public class HController {
    @Autowired
    private HospitalServices hospitalServices;

    public HController(HospitalServices hospitalServices) {
        this.hospitalServices = hospitalServices ;
    }
    @PostMapping
    public ResponseEntity<HospitalDatabase> savePatientData(@RequestBody HospitalDatabase hospitalDatabase)
    {
        return new ResponseEntity<HospitalDatabase>(hospitalServices.savePatientData(hospitalDatabase), HttpStatus.CREATED);
    }
    @GetMapping
    public List<HospitalDatabase> getAllPatientsData()
    {
        return hospitalServices.getAllPatientsData();
    }
    @GetMapping("{id}")
    public ResponseEntity<HospitalDatabase> getPatientDataById(@PathVariable("id")int id)
    {
        return new ResponseEntity<HospitalDatabase>(hospitalServices.getPatientDataById(id),HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<HospitalDatabase> updatePatientData(@PathVariable("id")int id,@RequestBody HospitalDatabase hospitalDatabase)
    {
        return new ResponseEntity<HospitalDatabase>(hospitalServices.updatePatientData(hospitalDatabase,id), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deletePatientInfo(@PathVariable("id")int id)
    {
        hospitalServices.deletePatientInfo(id);
        return new ResponseEntity<String>("Patient\'s data is  deleted successfully !",HttpStatus.OK);
    }
}