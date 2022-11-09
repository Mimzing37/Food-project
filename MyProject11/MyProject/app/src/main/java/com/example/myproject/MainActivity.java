package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = findViewById(R.id.button2);
        Button phone = findViewById(R.id.button1);
        Button about = findViewById(R.id.button);


        button1.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, "press long click ", Toast.LENGTH_LONG).show();

        });

        button1.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick (View view) {

                Toast.makeText(MainActivity.this, "Hello Welcome " +
                        " Work hours from SAT TO THUS , at 8AP until 4PM " +
                        "THANK YOU", Toast.LENGTH_LONG).show();
                return false;
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:966535584631"));
                startActivity(i);
            }
        });

    }

    public void about(View view) {
        Intent i = new Intent(this, about.class);
        startActivity(i);
    }

    public void card(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}







