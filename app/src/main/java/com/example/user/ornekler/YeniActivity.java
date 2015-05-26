package com.example.user.ornekler;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.ornekler.model.Person;

/**
 * Created by USER on 25.5.2015.
 */
public class YeniActivity extends Activity {

    EditText txtemailyeni;
    EditText txttelnoyeni;
    EditText txtyasadigiyeryeni;
    EditText txtadresyeni;
    Button btnguncelleyeni;

    Person person ;

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yeni);
     txtemailyeni = (EditText)findViewById(R.id.txtemailyeni);
     txttelnoyeni = (EditText)findViewById(R.id.txttelnoyeni);
     txtyasadigiyeryeni = (EditText)findViewById(R.id.txtyasadigiyeryeni);
     txtadresyeni = (EditText)findViewById(R.id.txtadresyeni);
     btnguncelleyeni = (Button)findViewById(R.id.btnguncelleyeni);


     person = new Person();

     btnguncelleyeni.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             person.setEmail(txtemailyeni.getText().toString());
             person.setTelNo(txttelnoyeni.getText().toString());
             person.getAdres().setContent(txtadresyeni.getText().toString());
             person.getAdres().getTown().getCountry().setName(txtyasadigiyeryeni.getText().toString());



         }
     });

    }


}
