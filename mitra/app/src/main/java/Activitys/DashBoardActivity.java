package Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.example.mitra.R;

public class DashBoardActivity extends AppCompatActivity {

    ViewPager viewPager;

    CardView cardappointment,cardsalary, Anonensment, ESIC, Messagea;
    ImageView logout;


    int[] images = {R.drawable.picsix, R.drawable.pictwo, R.drawable.picfive}; // Replace with your image resources

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        viewPager = findViewById(R.id.viewPager);

        logout=findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        //card 1
        //under card one
        cardappointment = findViewById(R.id.cardappointment);
        cardappointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Going Appointment Activity", Toast.LENGTH_SHORT).show();
            }
        });

        //card 2
        cardsalary = findViewById(R.id.cardsalary);
        cardsalary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), SalarySlipActivity.class);
                startActivity(intent);
            }
        });

        //card 3
        Anonensment = findViewById(R.id.Anonensment);
        Anonensment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Going Announcement Activity", Toast.LENGTH_SHORT).show();
            }
        });

        //card 4
        ESIC = findViewById(R.id.ESIC);
        ESIC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Going ESIC Card Activity", Toast.LENGTH_SHORT).show();
            }
        });

        //card 5
        Messagea = findViewById(R.id.Messagea);
        Messagea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Going Messages Activity", Toast.LENGTH_SHORT).show();
            }
        });

        //card 6
        Anonensment = findViewById(R.id.Anonensment);
        Anonensment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Going Announcement Activity", Toast.LENGTH_SHORT).show();
            }
        });




        ImageSliderAdapter imageSliderAdapter = new ImageSliderAdapter(this, images);
        viewPager.setAdapter(imageSliderAdapter);
        imageSliderAdapter.startAutoScroll(viewPager);

        // Example click listener for the ViewPager items
        viewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
//                Toast.makeText(getApplicationContext(), "Image at position " + position + " selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == KeyEvent.KEYCODE_BACK)
        {
        }

        return false;
    }


}
