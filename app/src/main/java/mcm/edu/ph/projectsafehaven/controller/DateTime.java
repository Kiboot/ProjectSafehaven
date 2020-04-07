package mcm.edu.ph.projectsafehaven.controller;

public class DateTime {
    int day =           0;
    int dayOfWeek =     0;
    int dayOfMonth =    0;
    int hour =          0;
    int minute =        0;
    int week =          0;
    int month =         0;
    boolean isPreLockdown = true;
    boolean isECQ = false;

    public DateTime(){} //default constructor

    public void startDateTime(){

        day =           7;
        dayOfWeek =     0;
        dayOfMonth =    0;
        hour =          6;
        minute =        0;
        week =          0;
        month =         0;

        day =           1;
        dayOfWeek =     0;
        dayOfMonth =    0;
        hour =          6;
        minute =        0;
        week =          1;
        month =         0;

    }

    public void moveTime(int hour, int minute){
        if(isPreLockdown = true){
        }else
            this.hour +=     hour;
            this.minute +=   minute;
            if(this.minute > 60){this.minute -= 60; this.hour += 1;} //makes sure there will be no 61 minutes
            if(this.hour > 24){this.hour -= 24; this.day +=1; this.dayOfWeek += 1; this.dayOfMonth += 1;}
            if(this.dayOfWeek == 8){this.dayOfWeek -= 6; week +=1;}
            if(this.dayOfMonth == 31){this.dayOfMonth -=30; month +=1;}
    }
    public void moveTime(){
        if(isPreLockdown = true){
        }else
            this.hour +=     1;
            if(this.minute > 60){this.minute -= 60; this.hour += 1;} //makes sure there will be no 61 minutes
            if(this.hour > 24){this.hour -= 24; this.day +=1; this.dayOfWeek += 1; this.dayOfMonth += 1;}
            if(this.dayOfWeek == 8){this.dayOfWeek -= 6; week +=1;}
            if(this.dayOfMonth == 31){this.dayOfMonth -=30; month +=1;}
    }
}
