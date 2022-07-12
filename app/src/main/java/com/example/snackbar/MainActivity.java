package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material
        .snackbar
        .Snackbar;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b2 = (Button)findViewById(R.id.b1);
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                View view = findViewById(R.id.b1);
                String str = "Good night";
                int duration = Snackbar.LENGTH_SHORT;
                showSnackbar(view,str,duration);
            }
        });
    }
    public void showSnackbar(View view,String str,int duration){
        Snackbar.make(view,str,duration).show();
    }
}