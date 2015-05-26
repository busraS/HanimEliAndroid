package com.example.user.ornekler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.ornekler.model.Comment;

/**
 * Created by USER on 26.5.2015.
 */
public class YorumActivity extends Activity {

    TextView kullaniciyorumtextview;
    TextView tarihyorumtextview;
    TextView yorumyorumtextview;
    EditText yorumyapyorumedittex;
    Button btngonderyorum;

    Comment comment;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yorumlar);
        kullaniciyorumtextview = (TextView)findViewById(R.id.kullaniciyorumtexview);
        tarihyorumtextview = (TextView)findViewById(R.id.tarihyorumtextview);
        yorumyorumtextview = (TextView)findViewById(R.id.yorumyorumtextview);
        yorumyapyorumedittex = (EditText)findViewById(R.id.yorumyapyorumedittext);
        btngonderyorum = (Button)findViewById(R.id.btngonderyorum);

        comment=new Comment();

        btngonderyorum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comment.setContent(yorumyorumtextview.getText().toString());

            }
        });




    }






}
