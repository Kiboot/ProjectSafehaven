package mcm.edu.ph.projectsafehaven.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;
import android.os.Bundle;
import mcm.edu.ph.projectsafehaven.R;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class SplashActivity extends AppCompatActivity {

    private static final boolean AUTO_HIDE = true;
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;
    private static final int UI_ANIMATION_DELAY = 300;
    private final Handler mHideHandler = new Handler();
    private final Handler aniHandler = new Handler();
    private View mContentView, mControlsView;
    private TextView txt1,txt2,txt3,txt4,txt5,txt6;
    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mVisible = true;
        mControlsView = findViewById(R.id.guidelineL);
        mContentView = findViewById(R.id.layoutt);

        txt1 = findViewById(R.id.splashTxt1);
        txt2 = findViewById(R.id.splashTxt2);
        txt3 = findViewById(R.id.splashTxt3);
        logo = findViewById(R.id.logoView);

        //contentView.findViewById(R.id.logoView);
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




        //txt1.startAnimation(fadeOut);


        //txt1.startAnimation(fadeOut);
        //txt3.startAnimation(fadeOut);

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
        delayedHide(100);
    }

    private final Runnable mHidePart2Runnable = new Runnable() {
        @SuppressLint("InlinedApi")
        @Override
        public void run() {
            mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    };
    private final Runnable mShowPart2Runnable = new Runnable() {
        @Override
        public void run() {
            // Delayed display of UI elements
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.show();
            }
            mControlsView.setVisibility(View.VISIBLE);
        }
    };

    private boolean mVisible;
    private final Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
            hide();
        }
    };
    private final View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (AUTO_HIDE) {
                delayedHide(AUTO_HIDE_DELAY_MILLIS);
            }
            return false;
        }
    };
    private void toggle() {
        if (mVisible) {
            hide();
        } else {
            show();
        }

    }
    private void hide() {
        // Hide UI first
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        mControlsView.setVisibility(View.GONE);
        mVisible = false;

        // Schedule a runnable to remove the status and navigation bar after a delay
        mHideHandler.removeCallbacks(mShowPart2Runnable);
        mHideHandler.postDelayed(mHidePart2Runnable, UI_ANIMATION_DELAY);
    }
    @SuppressLint("InlinedApi")
    private void show() {
        // Show the system bar
        mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        mVisible = true;

        // Schedule a runnable to display UI elements after a delay
        mHideHandler.removeCallbacks(mHidePart2Runnable);
        mHideHandler.postDelayed(mShowPart2Runnable, UI_ANIMATION_DELAY);
    }
    private void delayedHide(int delayMillis) {
        mHideHandler.removeCallbacks(mHideRunnable);
        mHideHandler.postDelayed(mHideRunnable, delayMillis);
    }






}
