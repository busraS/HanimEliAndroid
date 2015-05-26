package com.example.user.ornekler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.ornekler.model.Food;

import static java.lang.String.*;

/**
 * Created by USER on 21.5.2015.
 */
public class YemekKayit extends Activity {

    EditText txtadiyemekkayit;
    EditText txthakkindayemekkayit;
    EditText txtmalzemeyemekkayit;
    EditText txtkategoriyemekkayit;
    EditText txthsuresiyemekkayit;
    EditText txtmiktaryemekkayit;
    EditText txtfiyatyemekkayit;
    Button btnkaydetyemekkayit;

    Food food;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yemekkayit);

       txtadiyemekkayit = (EditText)findViewById(R.id.txtadiyemekkayit);
       txthakkindayemekkayit = (EditText)findViewById(R.id.txthakkindayemekkayit);
       txtmalzemeyemekkayit = (EditText)findViewById(R.id.txtmalzemeyemekkayit);
       txtkategoriyemekkayit = (EditText)findViewById(R.id.txtkategoriyemekkayit);
       txthsuresiyemekkayit = (EditText)findViewById(R.id.txthsuresiyemekkayit);
       txtmiktaryemekkayit = (EditText)findViewById(R.id.txtmiktaryemekkayit);
       txtfiyatyemekkayit = (EditText)findViewById(R.id.txtfiyatyemekkayit);
       btnkaydetyemekkayit = (Button)findViewById(R.id.btnkaydetyemekkayit);

       food = new Food();

       btnkaydetyemekkayit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {



               food.setName(txtadiyemekkayit.getText().toString());
               food.setMaterials(txtmalzemeyemekkayit.getText().toString());
               food.setDescription(txthakkindayemekkayit.getText().toString());
               food.setPreparationTime(valueOf(Short.parseShort(txthsuresiyemekkayit.getText().toString())));






               Intent intent = new Intent(YemekKayit.this,AnaSayfa .class);
               startActivity(intent);


           }
       });
    }



}


