package pl.pawel.homework9.model;

import com.opencsv.bean.CsvBindByName;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Document
public class CSVModelNOSQL {

    @Id
    @CsvBindByName
    private String id;
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
}
