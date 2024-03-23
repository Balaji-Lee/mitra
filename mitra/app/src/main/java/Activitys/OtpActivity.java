package Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mitra.R;


public class OtpActivity extends AppCompatActivity {
    Button submitbutton;

    EditText otpf;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        otpf=findViewById(R.id.otpf);

        submitbutton=(Button)findViewById(R.id.submitbutton);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String otpfielf= otpf.getText().toString().trim();

                if(otpfielf.equals("")){
                Intent intent=new Intent(getApplicationContext(), DashBoardActivity.class);
                startActivity(intent);}else{

                    Toast.makeText(getApplicationContext(),"Please enter correct OTP",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}