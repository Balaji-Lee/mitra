package Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mitra.R;

public class MainActivity extends AppCompatActivity {

    Button loginbutton;
    EditText EMPnumberfield,phonenumberfield;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Flow", "onCreate: mainactivity");
        setContentView(R.layout.activity_main2);

        EMPnumberfield=findViewById(R.id.EMPnumberfield);
        phonenumberfield=findViewById(R.id.phonenumberfield);


        loginbutton=findViewById(R.id.loginbutton);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String employeeNumber= EMPnumberfield.getText().toString().trim();
                String phoneNumber= phonenumberfield.getText().toString().trim();
                if(employeeNumber.equals("")){

                Intent intent= new Intent(getApplicationContext(), OtpActivity.class);
                startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Please enter correct Employee ID",Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}