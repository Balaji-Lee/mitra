package Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.mitra.R;

import java.util.ArrayList;
import java.util.List;

public class SalarySlipActivity extends AppCompatActivity {

    Spinner Monthspinner,yearspinner;
    Button download;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salary_slip);
        Monthspinner=findViewById(R.id.Monthspinner);
        yearspinner=findViewById(R.id.yearspinner);
        download=findViewById(R.id.download);

        String[] monthlist = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, monthlist);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Monthspinner.setAdapter(monthAdapter);

        String[] yearlist = {"2023", "2022", "2021","2020"};
        ArrayAdapter<String> yearAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, yearlist);
        yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearspinner.setAdapter(yearAdapter);

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedMonth = Monthspinner.getSelectedItem().toString();
                String selectedYear = yearspinner.getSelectedItem().toString();

                if (!selectedMonth.equals("Select Month") && !selectedYear.equals("Select Year")) {
                    // Both month and year are selected
                    String message = "Month: " + selectedMonth + " - Year: " + selectedYear;
                    Toast.makeText(getApplicationContext(),message , Toast.LENGTH_SHORT).show();

                }
            }
        });






    }
}