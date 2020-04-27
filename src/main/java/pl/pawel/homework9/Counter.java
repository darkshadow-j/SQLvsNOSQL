package pl.pawel.homework9;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Counter {

    private long startTime;
    private long endTime;


    @Before("@annotation(CountTime)")
    public void startCounter() {
        startTime = System.currentTimeMillis();
    }

    @After("@annotation(CountTime)")
    public void stopCounting() {
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }


}
