package mcm.edu.ph.projectsafehaven.controller;

import android.content.res.Resources;

import java.util.Random;

import mcm.edu.ph.projectsafehaven.R;



public class GeneratePerson {

    private int SEED = 1; //random seeding not enabled at the moment
    Random gen = new Random();

    public GeneratePerson(){}//default constructor

    int randomizeSex(){
        int sex;
        sex = gen.nextInt(2);
        return sex;
    }
    //randomizing health is turned off for testing purposes
    int randomizeHealth(){return 100;}
    int randomizeRelLvl(){
        int relLvl;
        relLvl = gen.nextInt(3);
        return relLvl;
    }
    int randomizeStress(){
        int stress;
        stress = gen.nextInt(30);
        return  stress;
    }
    int randomizeTrust(int relLvl){
        int trust;
        if(relLvl==0){
            //if he/she is a family member, trust level would be 70 - 100
            trust = gen.nextInt(30);
            trust += 70;
        }
        else if(relLvl==1){
            //if he/she is a friend, trust level would be 50 - 100
            trust = gen.nextInt(50);
            trust += 50;
        }
        else {
            //if he/she is a nobody, trust level would be 0 - 50
            trust = gen.nextInt(50);
        }
        return  trust;
    }
    double randomizeMoney(){
        int intMoney;
        intMoney = gen.nextInt(10000);
        return (double)intMoney;
    }
    double randomizeFood(){
        int food;
        food = gen.nextInt(100);
        return (double)food;
    }
    String randomizeFname(){
        //band-aid solution until names have been transferred to a file
        String[] fnameArray = new String[]{
                "Aezra","Lyka Dion", "Ria", "Abigail", "Aira", "Alexa",
                "Alice", "Alyannah", "Alyssa", "Ana", "Andrea", "Angel",
                "Angela", "Angelica", "Angelie", "Anna", "Anne", "Ara",
                "Aya", "Bea", "Belle", "Bianca", "Camille", "Catherine",
                "Cha", "Cherry", "Christine", "Claire", "Clare", "Clarissa",
                "Coleen", "Cristine", "Czarina", "Danica", "Daniela", "Daniella",
                "Danielle", "Denise", "Desiree", "Diana", "Eirene", "Ella",
                "Elle", "Erin", "Faye", "Frances", "Gabrielle", "Grace",
                "Hannah", "Ice", "Irene", "Isabel", "Jan", "Jane", "Jean",
                "Jeanne", "Jennly", "Jessica", "Joan", "Joy", "Joyce",
                "Judy", "Justine", "Karen", "Kate", "Kathleen", "Katrina",
                "Kim", "Kimberly", "Kris", "Kristine", "Kyla", "Lea", "Leah",
                "Lorraine", "Lou", "Louise", "Lovely", "Loysa", "Lyn",
                "Mae", "Maria", "Marian", "Marie", "Mary", "Mavi", "Mica",
                "Michelle", "Nadine", "Nathalie", "Nica", "Nicole", "Nikki",
                "Nina", "Pamela", "Patricia", "Paula", "Pauline", "Pia",
                "Precious", "Rachel", "Ren", "Rose", "Ruth", "Sam", "Sandy",
                "Sarah", "Sheila", "Shine", "Sofia", "Sophia", "Stephanie",
                "Thea", "Tricia", "Trina", "Trisha", "Valerie", "Vanessa",
                "Victoria", "Yana"};
        String[] fname_female = Resources.getSystem().getStringArray(R.array.fname_f);

        //random name picker
        return fname_female[gen.nextInt(120)];

    }
    String randomizeLname(){}
    String randomizeJob(){}
    String randomizeTrait1(){}
    String randomizeTrait2(){}
    String randomizeTrait3(){}
    String randomizeTrait4(){}
    String randomizeItem1(){}
    String randomizeItem2(){}







}
