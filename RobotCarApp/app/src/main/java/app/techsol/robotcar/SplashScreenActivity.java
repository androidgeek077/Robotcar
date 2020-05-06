package app.techsol.robotcar;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SplashScreenActivity extends AppCompatActivity {

    TextView appNameTV;
    ImageView logoImg;
    TextView mSlogenTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        appNameTV=findViewById(R.id.appNameTV);
        mSlogenTV=findViewById(R.id.mSlogenTV);

        logoImg=findViewById(R.id.logoImg);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytrans);
        Animation myTwoanim = AnimationUtils.loadAnimation(this, R.anim.spin_in);
        Animation myFirstanim = AnimationUtils.loadAnimation(this, R.anim.spineone);
        logoImg.setAnimation(myFirstanim);
        appNameTV.setAnimation(myanim);
        mSlogenTV.setAnimation(myTwoanim);
        gotoMainpage();
        getSupportActionBar().hide();
    }

    private void gotoMainpage() {
        new Thread(){
            @Override
            public void run() {
                super.run();
                try {

                    sleep(4000);
                    Intent mintent=new Intent(SplashScreenActivity.this,MainActivity.class);
                    startActivity(mintent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

}
