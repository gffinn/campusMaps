package com.example.campusmaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginButton = (MaterialButton) findViewById(R.id.loginButton);
        TextView NewAcct = (TextView)findViewById(R.id.NewAcct);

        //Set username and password as:
        //username: admin
        //password: admin

        NewAcct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    opensignupPage();

            }
        });


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                    //correct
                    openActivity2();
                else
                    Toast.makeText(MainActivity.this,"LOGIN FAILED", Toast.LENGTH_SHORT).show();
            }
        });

    }
    //This opens the Next screen
    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
    //This opens the Next screen
    public void opensignupPage(){
        Intent intent = new Intent(this, signupPage.class);
        startActivity(intent);
    }
}