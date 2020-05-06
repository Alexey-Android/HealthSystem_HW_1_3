package com.example.healthsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TreeSet;

public class Main3Activity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    private Button btnSaveData2;
    private EditText inpWeight, inpSteps;
    private TextView txtDate2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        init();
    }

    private void init() {
        btnSaveData2 = findViewById(R.id.buttonSaveData2);
        inpWeight = findViewById(R.id.inputWeight);
        inpSteps = findViewById(R.id.inputSteps);
        txtDate2 = findViewById(R.id.txtDate2);

        btnSaveData2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Пользователь нажал кнопку СОХРАНИТЬ");
                Indicators indicators = new Indicators();
                List<Indicators> list = new ArrayList<>();

                String nWeight = inpWeight.getText().toString();
                String nSteps = inpSteps.getText().toString();
                while (true) {
                    if (nWeight.equals("") || nSteps.equals("")) {
                        Toast.makeText(Main3Activity.this, "Данные введены неверно", Toast.LENGTH_LONG).show();
                    } else {
                        indicators.setWeight(Double.parseDouble(nWeight));
                        indicators.setSteps(Integer.parseInt(nSteps));

                        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM YYYY HH:mm");
                        String date = sdf.format(Calendar.getInstance().getTime());
                        txtDate2.setText(date);
                        indicators.setDateTime2(txtDate2.getText().toString());
                        list.add(indicators);
                        Toast.makeText(Main3Activity.this, "Данные пациента - \n" + indicators.toString() + "успешно добавлены", Toast.LENGTH_LONG).show();
                    }
                    break;
                }
            }
        });
    }
}
