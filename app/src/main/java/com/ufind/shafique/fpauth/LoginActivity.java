package com.ufind.shafique.fpauth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView sign_up = (TextView) findViewById(R.id.textView_signup_login);
        sign_up.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching Register Activity
                Intent i = new Intent(getApplicationContext(), Reg_Activity.class);
                startActivity(i);

            }
        });


    }
}
