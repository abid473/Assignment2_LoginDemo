package com.example.abid.loginform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Etuname,ETpassword;
    Button btlogin,btregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Etuname = (EditText) findViewById(R.id.ETuname);
        ETpassword = (EditText) findViewById(R.id.ETpass);
        btlogin = (Button) findViewById(R.id.btnlogin);
        btregister = (Button) findViewById(R.id.btnregister);

        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String struname;
                struname = Etuname.getText().toString();
                Intent intent = new Intent (MainActivity.this,Welcome.class);
                intent.putExtra("Username",struname);
                startActivity(intent);
            }
        });
    }
}
