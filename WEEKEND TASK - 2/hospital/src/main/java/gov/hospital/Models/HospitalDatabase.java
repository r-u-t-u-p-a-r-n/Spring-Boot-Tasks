package gov.hospital.Models;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="HospitalDatabase")
public class HospitalDatabase {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String patientName;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private int age;

}