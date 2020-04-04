package mcm.edu.ph.projectsafehaven.model.database;

public class Person {

    public static String TABLE_NAME = "persons";
    public static String COLUMN_ID = "pid";
    public static String COLUMN_RELLVL = "rellvl";
    public static String COLUMN_STRESS = "stress";
    public static String COLUMN_TRUST = "trust";
    public static String COLUMN_MONEY = "money";
    public static String COLUMN_FOOD = "food";
    public static String COLUMN_FNAME = "fname";
    public static String COLUMN_LNAME = "lname";
    public static String COLUMN_JOB = "job";
    public static String COLUMN_TRAIT1 = "trait1";
    public static String COLUMN_TRAIT2 = "trait2";
    public static String COLUMN_TRAIT3 = "trait3";
    public static String COLUMN_TRAIT4 = "trait4";
    public static String COLUMN_ITEM1 = "item1";
    public static String COLUMN_ITEM2 = "item2";


    private int pid, rellvl, stress, trust;
    private double money, food;
    private String fname, lname, job, trait1, trait2, trait3, trait4, item1, item2;

    public Person(){} //default constructor. put in place to prevent minor usage errors.

    /** main data catching constructor **/
    public Person (int pid, int rellvl, int stress, int trust,
                   double money, double food,
                   String fname, String lname, String job, String trait1, String trait2, String trait3, String trait4, String item1, String item2){

        this.pid = pid;
        this.rellvl = rellvl;
        this.stress = stress;
        this.trust = trust;
        this.money = money;
        this.food = food;
        this.fname = fname;
        this.lname = lname;
        this.job = job;
        this.trait1 = trait1;
        this.trait2 = trait2;
        this.trait3 = trait3;
        this.trait4 = trait4;
        this.item1 = item1;
        this.item2 = item2;
    }
    /** getters **/
    public int getPid(){return pid;}
    public int getRellvl() {return rellvl;}
    public int getStress() {return stress;}
    public int getTrust() {return trust;}
    public double getMoney() {return money;}
    public double getFood() {return food;}
    public String getFname() {return fname;}
    public String getLname() {return lname;}
    public String getJob() {return job;}
    public String getTrait1() {return trait1;}
    public String getTrait2() {return trait2;}
    public String getTrait3() {return trait3;}
    public String getTrait4() {return trait4;}
    public String getItem1() {return item1;}
    public String getItem2() {return item2;}

    /** setters **/
    public void setPid(int pid) {this.pid = pid;}
    public void setRellvl(int rellvl) {this.rellvl = rellvl;}
    public void setStress(int stress) {this.stress = stress;}
    public void setTrust(int trust) {this.trust = trust;}
    public void setMoney(double money) {this.money = money;}
    public void setFood(double food) {this.food = food;}
    public void setFname(String fname) {this.fname = fname;}
    public void setLname(String lname) {this.lname = lname;}
    public void setJob(String job) {this.job = job;}
    public void setTrait1(String trait1) {this.trait1 = trait1;}
    public void setTrait2(String trait2) {this.trait2 = trait2;}
    public void setTrait3(String trait3) {this.trait3 = trait3;}
    public void setTrait4(String trait4) {this.trait4 = trait4;}
    public void setItem1(String item1) {this.item1 = item1;}
    public void setItem2(String item2) {this.item2 = item2;}

    /** SQL Create Person Table **/
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_RELLVL + " INTEGER,"
                    + COLUMN_STRESS + " INTEGER,"
                    + COLUMN_TRUST + " INTEGER,"
                    + COLUMN_MONEY + " REAL,"
                    + COLUMN_FOOD + " REAL,"
                    + COLUMN_FNAME + " TEXT,"
                    + COLUMN_LNAME + " TEXT,"
                    + COLUMN_JOB + " TEXT,"
                    + COLUMN_TRAIT1 + " TEXT,"
                    + COLUMN_TRAIT2 + " TEXT,"
                    + COLUMN_TRAIT3 + " TEXT,"
                    + COLUMN_TRAIT4 + " TEXT,"
                    + COLUMN_ITEM1 + " TEXT,"
                    + COLUMN_ITEM2 + " TEXT,"
                    + ")";
}
