package com.vivek.Service;

import com.vivek.scheduler.TimeInfo;
import jakarta.annotation.PostConstruct;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShedularService  {

    @Autowired
    private final Scheduler scheduler;

    public ShedularService(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    public void scheduler(Class jobClass, TimeInfo info){
        JobDetail detailsl;


    }





    @PostConstruct
    public void init(){
        try {
            scheduler.start();
        } catch (SchedulerException e) {
            throw new RuntimeException(e);
        }
    }
    public void preDistroy(){
        try {
            scheduler.shutdown();
        } catch (SchedulerException e) {
            throw new RuntimeException(e);
        }
    }

}
