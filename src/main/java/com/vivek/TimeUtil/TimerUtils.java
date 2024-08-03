package com.vivek.TimeUtil;

import com.vivek.scheduler.TimeInfo;
import org.quartz.*;

import java.util.Date;

public class TimerUtils {
    private TimerUtils() {
    }

    public static JobDetail createJobDetails(Class jobClass, TimeInfo info) {
//      IT IS ONE TYPE OF Interface To store Kry Value
        JobDataMap jobDataMap= new JobDataMap();
        jobDataMap.put(jobClass.getSimpleName(), info);


        return JobBuilder
                .newJob(jobClass)
                .withIdentity(jobClass.getSimpleName())
                .setJobData(jobDataMap)
                .build();
    }
    public static Trigger buildTrigger(Class jobDataMap, TimeInfo tim){
        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder
                                                      .simpleSchedule()
                                                       .withIntervalInMilliseconds(tim.repeatIntervalMs());
      if(tim.runfForever()){
          simpleScheduleBuilder.repeatForever();
      }else {
          simpleScheduleBuilder.withIntervalInMilliseconds(tim.totalfirecount()-1);
      }
      return TriggerBuilder
              .newTrigger()
              .withIdentity(jobDataMap.getSimpleName())
              .withSchedule(simpleScheduleBuilder)
              .startAt(new Date(System.currentTimeMillis()+ tim.initialOffSetMs()))
              .build();
    }
}