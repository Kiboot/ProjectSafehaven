package mcm.edu.ph.projectsafehaven.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import mcm.edu.ph.projectsafehaven.R;
import android.widget.Button;
import android.widget.TextView;

public class FamilyPicker extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_picker);
        enableFullscreen();

        Button btnPrd = findViewById(R.id.btnProceed);



        btnPrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView lName = findViewById(R.id.famNameTxt);
                Intent i = new Intent(FamilyPicker.this, MemberSelector.class);

                i.putExtra("last_name",String.valueOf(lName.getText()));
            }
        });

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
    //Testing Testing 123

}
