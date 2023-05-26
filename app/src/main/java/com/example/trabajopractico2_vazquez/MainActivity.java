package com.example.trabajopractico2_vazquez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editusr;
    EditText editpsw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editusr = findViewById(R.id.edit_usr);
        editpsw = findViewById(R.id.edit_psw);

    }

    public void ingresar(View view) {

        String usr = editusr.getText().toString();
        String psw = editpsw.getText().toString();

        if(usr.equals("alumno") && psw.equals("1234"))
        {
            Intent intent = new Intent(this, home.class);
            startActivity(intent);
        }else
        {
            Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
        }

    }

}