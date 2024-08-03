package com.vivek.scheduler;

import org.springframework.stereotype.Component;

@Component
public class TimeInfo {
//   it is use how many time gose to fire
    private int  totalfirecount;

//  it is run forever and if its true then totalfirecont not apply
    private  boolean runfForever;

//    it will repeat the job that we set  per/milli second
    private  long repeatIntervalMs;

//    it will fire after we set the time to start
    private long initialOffSetMs;


    private String callBackData;

    public int totalfirecount() {
        return totalfirecount;
    }

    public void setTotalfirecount(int totalfirecount) {
        this.totalfirecount = totalfirecount;
    }

    public boolean runfForever() {
        return runfForever;
    }

    public void setRunfForever(boolean runfForever) {
        this.runfForever = runfForever;
    }

    public long repeatIntervalMs() {
        return repeatIntervalMs;
    }

    public void setRepeatIntervalMs(long repeatIntervalMs) {
        this.repeatIntervalMs = repeatIntervalMs;
    }

    public long initialOffSetMs() {
        return initialOffSetMs;
    }

    public void setInitialOffSetMs(long initialOffSetMs) {
        this.initialOffSetMs = initialOffSetMs;
    }

    public String callBackData() {
        return callBackData;
    }

    public void setCallBackData(String callBackData) {
        this.callBackData = callBackData;
    }
}
