package mcm.edu.ph.projectsafehaven.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Button;
import mcm.edu.ph.projectsafehaven.controller.GeneratePerson;

import mcm.edu.ph.projectsafehaven.R; //for more info https://www.javatpoint.com/R-java-file-in-android

public class MainActivity extends AppCompatActivity{

    TextView nameTxt, sexTxt, relLvlTxt, stressTxt, trustTxt, moneyTxt, foodTxt, jobTxt, trait1Txt, trait2Txt, trait3Txt, trait4Txt, item1Txt, item2Txt;
    Button randomBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTxt = findViewById(R.id.name);
        sexTxt = findViewById(R.id.sex);
        relLvlTxt = findViewById(R.id.relLvl);
        stressTxt = findViewById(R.id.stress);
        trustTxt = findViewById(R.id.trust);
        moneyTxt = findViewById(R.id.money);
        foodTxt = findViewById(R.id.food);
        jobTxt = findViewById(R.id.job);
        trait1Txt = findViewById(R.id.trait1);
        trait2Txt = findViewById(R.id.trait2);
        trait3Txt = findViewById(R.id.trait3);
        trait4Txt = findViewById(R.id.trait4);
        item1Txt = findViewById(R.id.item1);
        item2Txt = findViewById(R.id.item2);
        randomBtn = findViewById(R.id.btnRand);


        randomBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        final GeneratePerson person1 = new GeneratePerson();

                        sexTxt.setText(String.valueOf(person1.randomizeSex()));
                        relLvlTxt.setText(String.valueOf(person1.randomizeRelLvl()));
                        stressTxt.setText(String.valueOf(person1.randomizeStress()));
                        trustTxt.setText(String.valueOf(person1.randomizeTrust()));
                        moneyTxt.setText(String.valueOf(person1.randomizeMoney()));
                        foodTxt.setText(String.valueOf(person1.randomizeFood()));
                        jobTxt.setText(String.valueOf(person1.randomizeJob()));
                        trait1Txt.setText(String.valueOf(person1.randomizeTrait1()));
                        trait2Txt.setText(String.valueOf(person1.randomizeTrait2()));
                        trait3Txt.setText(String.valueOf(person1.randomizeTrait3()));
                        trait4Txt.setText(String.valueOf(person1.randomizeTrait4()));
                        item1Txt.setText(String.valueOf(person1.randomizeItem1()));
                        item2Txt.setText(String.valueOf(person1.randomizeItem2()));
                        nameTxt.setText(String.valueOf(person1.randomizeFname()+" "+person1.randomizeLname()));

                    }
                }
        );

    }
}
