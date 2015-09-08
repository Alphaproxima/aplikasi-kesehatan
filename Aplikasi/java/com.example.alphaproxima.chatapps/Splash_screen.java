package com.example.alphaproxima.chatapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final ImageView iv = (ImageView) findViewById(R.id.imageView);
        final Animation x = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);

        iv.startAnimation(x);
        x.setAnimationListener(new Animation.AnimationListener(){

            @Override
            public void onAnimationStart (Animation animation){

            }

            @Override
            public void onAnimationEnd (Animation animation){
                finish()


            }

            @Override
            public void onAnimationRepeat (Animation animation){

            }
        });
    }
}
