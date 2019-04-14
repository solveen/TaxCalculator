package solveen.example.taxcalculator;



import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;

import android.widget.Toast;



public class MainActivity extends AppCompatActivity {



    TextView txtDisplaySalry;

    Button btnCalculate;

    EditText iptSalary;



    taxcalc eng;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        txtDisplaySalry = findViewById(R.id.txtSalaryAmount);





        btnCalculate = findViewById(R.id.btnCalSalary);



        iptSalary = findViewById(R.id.iptSalary);



        eng = new taxcalc();







        btnCalculate.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {



                String salary = iptSalary.getText().toString();



                if (salary.isEmpty()){



                    Toast.makeText(MainActivity.this, "Empty Fields", Toast.LENGTH_SHORT).show();



                }else{



                    double tax = eng.OnePercent(Double.parseDouble(salary));

                    txtDisplaySalry.setText(String.valueOf(tax));



                }

            }

        });





    }

}