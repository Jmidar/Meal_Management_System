package com.example.jmidar.mealsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {


    Button btnsignUp;
    TextView etxtname,etxtfullname,etxtemail,etxtpassword,etxtconfirmpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnsignUp = findViewById(R.id.btn_signup);

        etxtname = findViewById(R.id.etxt_name);
        etxtfullname = findViewById(R.id.etxt_fullname);
        etxtemail = findViewById(R.id.etxt_email);
        etxtpassword = findViewById(R.id.etxt_password);
        etxtconfirmpassword = findViewById(R.id.etxt_confirm_password);
    }
}
