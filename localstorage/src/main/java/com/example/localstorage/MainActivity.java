package com.example.localstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.localstorage.prefs.Prefs;

public class MainActivity extends AppCompatActivity {
     EditText edtName,edtUsername;
     Button btnSave,btnGet;
     TextView txtSavedMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName=findViewById(R.id.edtName);
        edtUsername=findViewById(R.id.edtUsername);
        btnSave=findViewById(R.id.btnSave);
        btnGet=findViewById(R.id.btnGet);
        txtSavedMsg=findViewById(R.id.txtSavedData);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkValidation();
            }
        });
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showData();

            }
        });
    }

    void checkValidation() {
        if (edtName.getText().toString().isEmpty()) {
            Toast.makeText(this, "Enter name", Toast.LENGTH_SHORT).show();
        }
        else if (edtUsername.getText().toString().isEmpty()) {
            Toast.makeText(this, "Enter name", Toast.LENGTH_SHORT).show();
        }
        else {
            saveData();
        }
    }
    private void saveData(){

        Prefs.saveEmployeeName(MainActivity.this,edtName.getText().toString());
        Prefs.saveEmployeeUsername(MainActivity.this,edtUsername.getText().toString());
    }
    private void showData(){
        txtSavedMsg.setText(
        Prefs.getEmployeeName(MainActivity.this)+"\n"+
                  Prefs.getEmployeeUsername(MainActivity.this)
             );
    }
}
