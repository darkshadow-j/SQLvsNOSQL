package pl.pawel.homework9.model;

import com.opencsv.bean.CsvBindByName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CSVModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @CsvBindByName
    private Long id;
    @CsvBindByName
    private String first_name;
    @CsvBindByName
    private String last_name;
    @CsvBindByName
    private String email;
    @CsvBindByName
    private String gender;
    @CsvBindByName
    private String ip_address;


    public CSVModel() {
    }

    public CSVModel(Long id, String first_name, String last_name, String email, String gender, String ip_address) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.ip_address = ip_address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    @Override
    public String toString() {
        return "CSVModel{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", ip_address='" + ip_address + '\'' +
                '}';
    }
}
