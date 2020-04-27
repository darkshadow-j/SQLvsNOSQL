package pl.pawel.homework9;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.pawel.homework9.model.CSVModel;
import pl.pawel.homework9.model.CSVModelDAO;
import pl.pawel.homework9.model.CSVModelNOSQL;
import pl.pawel.homework9.model.CSVModelNOSQLDAO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@Service
public class Start {

    @Autowired
    private CSVModelDAO csvModelDAO;

    @Autowired
    private CSVModelNOSQLDAO csvModelNOSQLDAO;

    private List<CSVModel> models;
    private List<CSVModelNOSQL> modelsNOSQL;

    public Start() throws IOException { ;
        BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\Pawel\\Downloads\\MOCK_DATA.csv"));
        Reader reader = br;
        CsvToBean<CSVModel> csvToBean = new CsvToBeanBuilder(reader).withType(CSVModel.class).withIgnoreLeadingWhiteSpace(true).build();
        models = csvToBean.parse();
        BufferedReader br2 = Files.newBufferedReader(Paths.get("C:\\Users\\Pawel\\Downloads\\MOCK_DATA.csv"));
        Reader reader2 = br2;
        CsvToBean<CSVModelNOSQL> csvToBeanNOSQL = new CsvToBeanBuilder(reader2).withType(CSVModelNOSQL.class).withIgnoreLeadingWhiteSpace(true).build();
        modelsNOSQL = csvToBeanNOSQL.parse();
        System.out.println("GOTOWY SQL: " + models.size());
        System.out.println("GOTOWY noSQL: " + modelsNOSQL.size());
    }

    @CountTime
    public void WriteData() throws IOException {
        csvModelDAO.saveAll(models);
    }

    @CountTime
    public void ReadData() {
        List<CSVModel> m = csvModelDAO.findAll();
    }


    @CountTime
    public void WriteDataNOSQL() throws IOException {
        csvModelNOSQLDAO.saveAll(modelsNOSQL);
    }

    @CountTime
    public void ReadDataNOSQL() {
        List<CSVModelNOSQL> l = csvModelNOSQLDAO.findAll();

    }

}
