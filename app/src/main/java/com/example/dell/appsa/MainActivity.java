package com.example.dell.appsa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtUserName, Password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView username = (TextView)findViewById(R.id.txtUserName);
        final TextView password = (TextView)findViewById(R.id.txtPassword);

        Button Login = (Button)findViewById(R.id.btnLogin);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("1234")){

                    Toast.makeText(getApplicationContext(),"Login",Toast.LENGTH_SHORT).show();

                    Intent user = new Intent(MainActivity.this, Home.class);
                    startActivity(user);
                }

                else{

                    Toast.makeText(getApplicationContext(),"Username and Password doesn't match",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}

