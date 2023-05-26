package com.example.trabajopractico2_vazquez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

public class home extends AppCompatActivity {

    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        int DP_FINALES = 0;
        scrollView = findViewById(R.id.scroll_noti);

        //Importo el codigo necesario para conseguir el tamanio de altura
        DisplayMetrics AREA = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(AREA);
        int ALTURA_PIXEL = AREA.heightPixels;

        float density = getResources().getDisplayMetrics().density;

        if(ALTURA_PIXEL < 1000)
        {
            DP_FINALES = 730;

        }else if(ALTURA_PIXEL > 1000  && ALTURA_PIXEL < 2000)
        {
            DP_FINALES = 1100;
        }


        //Luego le asigno al scroll view el tamanio que quiero con el objeto layoutParams
        ViewGroup.LayoutParams layoutParams = scrollView.getLayoutParams();
        layoutParams.height = DP_FINALES;
        scrollView.setLayoutParams(layoutParams);
    }

    public void go_acerca(View view)
    {
        Intent i = new Intent(this, acerca.class);
        startActivity(i);
    }
}