package mcm.edu.ph.projectsafehaven.model.database;

public class Traits {
    public static String TABLE_NAME = "traits";
    public static String COLUMN_ID = "tid";
    public static String COLUMN_TRAITNAME = "traitName";
    public static String COLUMN_TRAITDESC = "traitDesc";

    private int tid;
    private String traitName, traitDesc;

    public Traits(){}

    public Traits(int tid, String traitName, String traitDesc){
        this.tid = tid;
        this.traitName = traitName;
        this.traitDesc = traitDesc;
    }
    /** getters **/
    public int getTid() {return tid;}
    public String getTraitName() {return traitName;}
    public String getTraitDesc() {return traitDesc;}

    /** setters **/
    public void setTid(int tid) {this.tid = tid;}
    public void setTraitName(String traitName){this.traitName = traitName;}
    public void setTraitDesc(String traitDesc){this.traitDesc = traitDesc;}

}
