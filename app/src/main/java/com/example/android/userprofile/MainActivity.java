package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView picture =(ImageView) findViewById(R.id.profile_picture);
        picture.setImageResource(R.drawable.picture);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText("Erica");
        name.setTextSize(30);
        name.setTextColor(Color.MAGENTA);

        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText("3/13/1989");

        TextView country = (TextView) findViewById(R.id.country);
        country.setText("USA");
    }
}
