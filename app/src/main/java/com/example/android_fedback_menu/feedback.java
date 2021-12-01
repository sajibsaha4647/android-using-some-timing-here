package com.example.android_fedback_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class feedback extends AppCompatActivity implements View.OnClickListener {

    private Button buttonone,buttontwo;
    private TextView textViewone,textviewtwo,textviewthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        buttonone = findViewById(R.id.buttonone);
        buttontwo = findViewById(R.id.buttonTwo);

        textViewone = findViewById(R.id.editone);
        textviewtwo = findViewById(R.id.editwo);
        textviewthree = findViewById(R.id.editthree);


        buttonone.setOnClickListener(this);
        buttontwo.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {

        startName =

        if(view.getId() == R.id.buttonone){
            textViewone
            textviewtwo
            textviewthree

        }else if(view.getId() == R.id.buttonTwo){
            textViewone.setText("");
            textviewtwo.setText("");
            textviewthree.setText("");


        }

    }


}