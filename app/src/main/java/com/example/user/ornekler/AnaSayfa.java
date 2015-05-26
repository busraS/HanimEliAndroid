package com.example.user.ornekler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by USER on 22.5.2015.
 */
public class AnaSayfa extends Activity {
    Button btnyemekekleanasyfa;
    Button btnyemeklistesianasayfa;
    Button btnsiparisanasayfa;
    Button btnyorumlaranasayfa;
    Button btncikisanasayfa;
    Button btnguncelleanasayfa;
    TextView emailanasayfatextview;
    TextView telnoanasyfatextview;
    TextView yasadigiyeranasayfatextview;
    TextView adresanasayfatextview;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsiparisanasayfa =(Button)findViewById(R.id.btnsiparisanasyfa);
        btnyemekekleanasyfa = (Button)findViewById(R.id.btnyemekekleanasayfa);
        btnyemeklistesianasayfa = (Button)findViewById(R.id.btnyemeklistesianasyfa);
        btnguncelleanasayfa = (Button)findViewById(R.id.btnguncelleanasyfa);
        btnyorumlaranasayfa = (Button)findViewById(R.id.btnyorumlaranasayfa);
        btncikisanasayfa = (Button)findViewById(R.id.btncikisanasayfa);
        emailanasayfatextview = (TextView)findViewById(R.id.emailanasyfatextview);
        telnoanasyfatextview = (TextView)findViewById(R.id.telnoanasayfatextview);
        yasadigiyeranasayfatextview =(TextView)findViewById(R.id.yasadigiyeranasyfatextview);
        adresanasayfatextview = (TextView)findViewById(R.id.adresanasyfatextview);


        btnyorumlaranasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(AnaSayfa.this ,YorumActivity.class);
                startActivity(intent);
            }
        });

        btnsiparisanasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        btnguncelleanasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(AnaSayfa.this ,YeniActivity.class);
                startActivity(intent);
            }
        });



        btncikisanasayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


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
