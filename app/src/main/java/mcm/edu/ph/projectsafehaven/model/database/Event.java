package mcm.edu.ph.projectsafehaven.model.database;

public class Event {
    public static String TABLE_NAME = "events";
    public static String COLUMN_ID = "eid";
    public static String COLUMN_EVENTNAME = "eventName";
    public static String COLUMN_EVENTTYPE = "eventType";
    public static String COLUMN_EVENTDESC = "eventDesc";

    private int eid;
    private int eventType;
    private String eventName;
    private String eventDesc;

    public Event(){} //default constructor

    public Event(int eid, int eventType, String eventName, String eventDesc){
        this.eid = eid;
        this.eventName =  eventName;
        this.eventType = eventType;
        this.eventDesc = eventDesc;
    }
    /** getters **/
    public int getEid() {return eid;}
    public int getEventType() {return eventType;}
    public String getEventName() {return eventName;}
    public String getEventDesc() {return eventDesc;}

    /** setters **/
    public void setEid(int eid) {this.eid = eid;}
    public void setEventType(int eventType) {this.eventType = eventType;}
    public void setEventName(String eventName) {this.eventName = eventName;}
    public void setEventDesc(String eventDesc) {this.eventDesc = eventDesc;}

    /** SQL Create Event Table **/
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_EVENTNAME + " TEXT,"
                    + COLUMN_EVENTTYPE + " TEXT,"
                    + COLUMN_EVENTDESC + " TEXT,"
                    + ")";

}
