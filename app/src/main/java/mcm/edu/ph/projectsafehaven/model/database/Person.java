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

    public Person (int pid, int rellvl, int stress, int trust,
                   double money, double food,
                   String fname, String lname, String job, String trait1, String trait2, String trait3, String trait4, String item1, String item2){
        //main data catching constructor
        this.pid = pid;
        this.rellvl = rellvl;
        this.stress = stress;
        

    }


}
