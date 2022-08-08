package gov.hospital.Repository;

import gov.hospital.Models.HospitalDatabase;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepo extends JpaRepository<HospitalDatabase,Integer> {
}