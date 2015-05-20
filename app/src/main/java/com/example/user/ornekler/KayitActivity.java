package com.example.user.ornekler;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.user.ornekler.model.Person;

/**
 * Created by USER on 10.4.2015.
 */
public class KayitActivity  extends Activity{

    EditText email;
    EditText kullaniciAdi;
    Button kayitbuttonkayitol;
    EditText sifre;
    EditText sifreonay;
    CheckBox sozlesmekabul ;
    EditText isim;
    EditText soyisim;
    EditText adres;
    ExpandableListView sehir;
    ExpandableListView ilce;
    EditText telefon;


    Person person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kayit);

        kayitbuttonkayitol = (Button)findViewById(R.id.kayitbuttonkayitol);
        email = (EditText)findViewById(R.id.emailkayitoledittext);
        kullaniciAdi = (EditText) findViewById(R.id.kullaniciadikayitoledittext);
        sifre = (EditText)findViewById(R.id.parolakayitoledittext);
        sifreonay = (EditText)findViewById(R.id.parolatekrarkayitoledittext);
        sozlesmekabul = (CheckBox)findViewById(R.id.kabulkayitoledittext);
        isim = (EditText)findViewById(R.id.isimkayitoledittext);
        soyisim = (EditText)findViewById(R.id.soyisimkayitoledittext);
        adres = (EditText) findViewById(R.id.adreskayitoledittext);
        sehir = (ExpandableListView)findViewById(R.id.sehirkayitolexpandableListView);
        ilce = (ExpandableListView)findViewById(R.id.ilcekayitolexpandableListView2);
        telefon = (EditText)findViewById(R.id.telefonkayitoledittext);



     person = new Person();

        kayitbuttonkayitol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

    if (sozlesmekabul.isChecked()) {
        if (sifre.getText().toString().equals(sifreonay.getText().toString())) {
            person.setUsername(kullaniciAdi.getText().toString());
            person.setEmail(email.getText().toString());
            person.setPassword(sifre.getText().toString());
            person.setName(isim.getText().toString());
            person.setLastname(soyisim.getText().toString());
            person.getAdres().setContent(adres.getText().toString());
            person.getAdres().getTown().getCountry().setName(sehir.getSelectedItem().toString());
            person.getAdres().getTown().setName(ilce.getSelectedItem().toString());
            person.setTelNo(telefon.getText().toString());
        } else {

            Toast toast = Toast.makeText(getApplicationContext(), "Şifreler Uyuşmuyor!", Toast.LENGTH_SHORT);
            toast.show();
        }
    } else {
        Toast toast = Toast.makeText(getApplicationContext(), "Sözleşme Kabul Edilmedi!", Toast.LENGTH_SHORT);
        toast.show();

    }
}
        });


    }
}
