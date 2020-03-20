package com.ufind.shafique.fpauth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView home1 = (TextView) findViewById(R.id.home1);

        home1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching Register Activity
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);

            }
        });



    }
}
