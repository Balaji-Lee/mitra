package Activitys;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.example.mitra.R;

public class FlashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.logo);
        // Create an ObjectAnimator for alpha property (fade in animation)
        ObjectAnimator fadeIn = ObjectAnimator.ofFloat(imageView, "alpha", 0f, 1f);
        fadeIn.setDuration(1500); // Duration of the animation in milliseconds
        // Start the animation
        fadeIn.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);


    }
}
