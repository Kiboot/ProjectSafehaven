package mcm.edu.ph.projectsafehaven.view;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import mcm.edu.ph.projectsafehaven.R;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

public class Scenario extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    TextView scenario_txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario);
        enableFullscreen();

        Button btn_scene1 = findViewById(R.id.btn_scen1);
        btn_scene1.setOnClickListener(this);
        btn_scene1.setOnLongClickListener(this);

        Button btn_scene2 = findViewById(R.id.btn_scen2);
        btn_scene2.setOnClickListener(this);

        Button btn_scene3 = findViewById(R.id.btn_scen3);
        btn_scene3.setOnClickListener(this);



    }
    @Override
    public void onClick(View v){
        scenario_txt1 = findViewById(R.id.scenario_txt);
        final AlphaAnimation fadeIn = new AlphaAnimation(0.0f , 1.0f ) ;
        final AlphaAnimation hideElement = new AlphaAnimation( 1.0f , 0.0f ) ;
        hideElement.setDuration(0);
        hideElement.setFillAfter(true);
        hideElement.setStartOffset(fadeIn.getStartOffset());
        fadeIn.setDuration(1000);
        fadeIn.setFillAfter(true);

        switch(v.getId()) {
            case R.id.btn_scen1:
                scenario_txt1.startAnimation(hideElement);
                scenario_txt1.setText(R.string.scenario1);
                scenario_txt1.startAnimation(fadeIn);
                break;
            case R.id.btn_scen2:
                scenario_txt1.startAnimation(hideElement);
                scenario_txt1.setText(R.string.scenario_wip);
                scenario_txt1.startAnimation(fadeIn);
                break;
            case R.id.btn_scen3:
                scenario_txt1.startAnimation(hideElement);
                scenario_txt1.setText(R.string.scenario_wip);
                scenario_txt1.startAnimation(fadeIn);
                break;
        }
    }
    @Override
    public boolean onLongClick(View v){
        switch(v.getId()) {
            case R.id.btn_scen1:
                Intent i  = new Intent(Scenario.this, FamilyPicker.class);
                Scenario.this.startActivity(i);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                break;
        }
        return false;
    }
    private void enableFullscreen(){
        View decorView = getWindow().getDecorView();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                            View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                            View.SYSTEM_UI_FLAG_FULLSCREEN |
                            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            );
        }
    }

}
