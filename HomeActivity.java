package com.example.user.wannasave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    public Button but1;
    public void init() {
        but1 = (Button) findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy = new Intent(HomeActivity.this, startsave.class);
                startActivity(toy);
            }


        });
        public Button gol;
    public void init() {
        Button gol = (Button) findViewById(R.id.gol);
        gol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tay = new Intent(HomeActivity.this, startsave.class);
                startActivity(tay);
            }


        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        init();
    }
}
