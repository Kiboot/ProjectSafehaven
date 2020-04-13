package mcm.edu.ph.projectsafehaven.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import mcm.edu.ph.projectsafehaven.R;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class SplashActivity extends AppCompatActivity {
    private final Handler mHideHandler = new Handler();
    private View mContentView;
    private TextView txt1,txt2,txt3;
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        enableFullscreen();
        mContentView = findViewById(R.id.layoutt);
        txt1 = findViewById(R.id.splashTxt1);
        txt2 = findViewById(R.id.splashTxt2);
        txt3 = findViewById(R.id.splashTxt3);
        logo = findViewById(R.id.logoView);

        final AlphaAnimation fadeIn = new AlphaAnimation(0.0f , 1.0f ) ;
        final AlphaAnimation fadeOut = new AlphaAnimation( 1.0f , 0.0f ) ;
        final AlphaAnimation hideElement = new AlphaAnimation( 1.0f , 0.0f ) ;

        hideElement.setDuration(0);
        hideElement.setFillAfter(true);
        hideElement.setStartOffset(fadeIn.getStartOffset());
        fadeIn.setDuration(2000);
        fadeIn.setFillAfter(true);
        fadeOut.setDuration(2000);
        fadeOut.setFillAfter(true);
        fadeOut.setStartOffset(fadeIn.getStartOffset());

        txt1.startAnimation(hideElement);
        logo.startAnimation(hideElement);
        txt2.startAnimation(hideElement);
        txt3.startAnimation(hideElement);

        txt1.startAnimation(fadeIn);
        txt3.startAnimation(fadeIn);

        mHideHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                txt1.startAnimation(fadeOut);
                txt3.startAnimation(fadeOut);
                logo.startAnimation(fadeIn);
                txt2.startAnimation(fadeIn);

                mContentView.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        Intent i  = new Intent(SplashActivity.this, Scenario.class);
                        SplashActivity.this.startActivity(i);
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        return false;
                    }
                });
            }
        }, 5000);


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
