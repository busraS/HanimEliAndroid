package com.example.user.ornekler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by USER on 22.5.2015.
 */
public class AnaSayfa extends Activity {
    Button btnyemekekleanasyfa;
    Button btnyemeklistesianasayfa;
    Button btnsiparisanasayfa;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsiparisanasayfa =(Button)findViewById(R.id.btnsiparisanasyfa);
        btnyemekekleanasyfa = (Button)findViewById(R.id.btnyemekekleanasayfa);
        btnyemeklistesianasayfa = (Button)findViewById(R.id.btnyemeklistesianasyfa);

        btnyemekekleanasyfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnaSayfa.this, YemekKayit.class);
                startActivity(intent);
            }
        });

      btnyemeklistesianasayfa.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(AnaSayfa.this,YemekKayit.class);
              startActivity(intent);
          }
      });





    }


}
