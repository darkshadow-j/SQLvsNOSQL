package pl.pawel.homework9.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.pawel.homework9.Start;

import java.io.IOException;

@Service
public class ServiceTest {


    @Autowired
    Start start;


    @EventListener(ApplicationReadyEvent.class)
    public void Test() throws IOException {
        start.WriteData();
        start.ReadData();

        start.WriteDataNOSQL();
        start.ReadDataNOSQL();
    }

}
