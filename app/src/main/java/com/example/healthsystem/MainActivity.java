package com.example.healthsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    private Button btnSaveName, btnPressure, btnIndicators;
    private EditText inpName, inpAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        btnSaveName = findViewById(R.id.buttonSaveName);
        btnPressure = findViewById(R.id.buttonPressure);
        btnIndicators = findViewById(R.id.buttonIndicators);
        inpName = findViewById(R.id.editName);
        inpAge = findViewById(R.id.editAge);

        btnSaveName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Пользователь нажал кнопку СОХРАНИТЬ");
                Patient patient = new Patient();
                String nName = inpName.getText().toString();
                String nAge = inpAge.getText().toString();

                while (true) {
                    if (nName.equals("") || nAge.equals("")) {
                        Toast.makeText(MainActivity.this, "Данные введены неверно", Toast.LENGTH_LONG).show();
                    } else {
                        patient.setName(nName);
                        patient.setAge(Integer.parseInt(nAge));

                        Toast.makeText(MainActivity.this, "Данные пациента - \n" + patient.toString() + "успешно добавлены", Toast.LENGTH_LONG).show();
                    }
                    break;
                }
            }
        });
        btnPressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Пользователь нажал кнопку ЗАПИСАТЬ ПОКАЗАТЕЛИ ДАВЛЕНИЯ");
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }
        });

        btnIndicators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Пользователь нажал кнопку ЗАПИСАТЬ ЖИЗНЕННЫЕ ПОКАЗАТЕЛИ");
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(intent);
            }
        });

    }
}
