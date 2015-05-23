package com.example.user.ornekler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by USER on 22.5.2015.
 */
public class YemekListesi extends Activity {
    Button btncikisyemeklistesi;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    btncikisyemeklistesi = (Button)findViewById(R.id.btncikisyemeklistele);
        btncikisyemeklistesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YemekListesi.this, AnaSayfa.class);
                startActivity(intent);
            }
        });



    }

}
