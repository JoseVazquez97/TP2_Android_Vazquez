package com.example.trabajopractico2_vazquez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class acerca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);
    }

    public void enviarCorreo(View view) {
        String email = "espn_soporte@ejemplo.com";
        String subject = "Necesito contactarme con ustedes";

        Intent i = new Intent(Intent.ACTION_SENDTO);
        i.setData(Uri.parse("mailto:" + email));
        i.putExtra(Intent.EXTRA_SUBJECT, subject);

        try {
            startActivity(i);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(getApplicationContext(), "No se encontró ninguna aplicación para realizar la acción deseada.", Toast.LENGTH_SHORT).show();
        }

    }

    public void llamarTelefono(View view) {

        String phoneNumber = "2954292876";

        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:" + phoneNumber));

        try {
            startActivity(i);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(getApplicationContext(), "No se encontró ninguna aplicación para realizar la acción deseada.", Toast.LENGTH_SHORT).show();
        }
    }

    public void abrirGitHub(View view) {
        String repositoryUrl = "https://github.com/JoseVazquez97/TP2_Android_Vazquez";

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(repositoryUrl));

        try {
            startActivity(i);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(getApplicationContext(), "No se encontró ninguna aplicación para realizar la acción deseada.", Toast.LENGTH_SHORT).show();
        }
    }
}